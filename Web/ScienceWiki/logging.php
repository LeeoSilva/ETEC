<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
</head>
<body>

	<?php

		include 'Libraries/Functions.php';
		include 'Libraries/Variables.php';

		$usr = FALSE;
		$pass = FALSE;

		// MySQL Connection.
		$connection = mysqli_connect("localhost", "root", "justkidding0909");
		$db = mysqli_select_db($connection, "ScienceWiki");

		// Check connection.
		if ( !$connection ) {
			die("Connection Failed: " . mysqli_connect_error());
		}

		if ( !$db ){
			die("Database invalid: " . mysqli_connect_errno());
		}


		// Getting the highest ID
		$highestid = highestID($connection);


		// Getting variables and verificating them.
		if( $_POST["username"] == "" ){
			exit("<p style='color:red;'>Provided Username is empty! <br></p>");
		}else{
			$username = $_POST["username"];
		}


		if( $_POST["password"] == "" ){
			exit("<p style='color:red;'>Provided password is empty! <br></p>");
		}else{
			$password = sha1($_POST["password"]);
		}
		
		// Checking if the results are iqual

		//Checking Username.
		$command = 'SELECT usr_name FROM Users WHERE usr_name="' . $username .'";';
		if( $result = mysqli_query($connection, $command) ){
			for($i = 0; $i <= $highestid; $i++){
				if( $info = mysqli_fetch_assoc($result) ){
					if( $info["usr_name"] == $username ){
						// echo $info["usr_name"] . "<br>";
						// echo $username . "<br>";
						$usr = TRUE;
						break;
					}else{
						exit("<p style='color:red;'>Invalid username!</p>");
					}
				}else{
					exit("<p style='color:red;'>Invalid username!</p>");
				}
			}
		}else{
			exit("<p style='color:red;'>Invalid username!</p>");
		}

		// Checking Password.
		$command = 'SELECT usr_pass FROM Users WHERE usr_name="' . $username .'";';
		if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					if( $info["usr_pass"] == $password ){
						// echo $info["usr_pass"];
						// printf($password);
						$pass = TRUE;
					}else{
						echo $info["usr_pass"] . "<br>" . sha1($password) . "<br>";
						echo "<p style='color:red;'>Invalid password!</p>";
						// header("Refresh: 5;URL=./index.php");							
					}
				}else{
					echo mysqli_connect_error();		
					// header("Refresh: 5;URL=./index.php");								
				}
		}else{
			echo mysqli_connect_errno();		
			// header("Refresh: 5;URL=./index.php");
		}


		if( $id = ID($connection, $username, $password) ){
			header("Location: index.php?userid=$id");
		}


	?>

</body>
</html>
