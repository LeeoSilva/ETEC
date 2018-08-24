	<?php

		include "Libraries/Variables";
		include "Libraries/Functions";

		// MySQL Connection.
		$connection = mysqli_connect("localhost", "root", "justkidding0909");
		$db = mysqli_select_db($connection, "ScienceWiki");

		// Check connection.
		if ( !$connection ) {
			die("Connection Failed: " . mysqli_connect_error());
		}

		if ( !$db ){
			die("Database invalid: " . mysqli_connect_errno($db));
		}

		// Getting variables and verificating them.
		if( $_POST["username"] == "" ){
			echo "<p style='color:red;'>Provided username is empty! <br></p>";
			header('Refresh: 5;URL=./login.php');
		}else{
			$username = ($_POST["username"]);
		}

		
		// Checks if there is another user
		// with the same name as the new user.

		$command = "SELECT usr_name FROM Users WHERE usr_name='" . $username . "';";
		if( $result = mysqli_query($connection, $command) ){
			if( $info = mysqli_fetch_assoc($result) ){
				if( $info["usr_name"] == $username ){
					exit("<p>This username already exists.</p> <br>");
				}
			}
		}


		if( $_POST["mail"] == "" ){
			echo "<p style='color:red;'>Provided email is empty! <br></p>";
			header('Refresh: 5;URL=./login.php');
		}else{
			$mail = ($_POST["mail"]);
		}

		// Check if there is another user with the same email as the new user.

		$command = "SELECT usr_mail FROM Users WHERE usr_mail='" . $mail ."';";
		if( $result = mysqli_query($connection, $command) ){
			if( $info = mysqli_fetch_assoc($result) ){
				if( $info["usr_mail"] == $mail ){
					printf("<p>There is another user with that same email address. <br>");
					exit("<a href='google.com' style='text-decoration: none;'>Recover</a> Email?</p>");
				}
			}
		}

		if( $_POST["password"] == "" ){
			exit("<p style='color:red;'>Provided password is empty! <br></p>");
		}else{
			// Encripts the password.
			$password = sha1(($_POST["password"]));
		}
		
		if( $_POST["gender"] == "" ){
			exit("<p style='color:red;'>Gender not provided! <br></p>");
		}else{
			$gender = ($_POST["gender"]);
		}


		// Injecting in the database.
		$command  = 'INSERT INTO Users(usr_name, usr_pass, usr_mail, usr_gender) ';
		$command .= 'VALUES ("' . $username . '", "' .$password . '", "' . $mail . '" , "' . $gender . '");';

		if ( $result = mysqli_query($connection, $command) ) {
			$GLOBALS["logged"] = TRUE;
			$command = "SELECT usr_id FROM Users WHERE usr_name='" .$username ."' AND usr_pass='" . $password . "';";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					$GLOBALS["ID"] = $info["usr_id"];
					header("Location: ./index.php");
				}else{
					exit("Some error ocurred: " . mysqli_connect_error() . "<br>" . mysqli_connect_error());
				}
			}else{
				exit("Invalid Command: " . mysqli_connect_errno() . "<br>" . mysqli_connect_error());
			}

		}else{
			exit("Invalid Command: " . mysqli_connect_errno() . "<br>" . mysqli_connect_error());
		}

		mysqli_close($connection);
	?>