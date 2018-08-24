<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register</title>
</head>
<body>
	<?php
		// Create connection
		$connection = mysqli_connect("localhost", "root", "justkidding0909", "ScienceWiki");
		if(!$connection){
			die("Connectiion Failed: " . mysqli_connect_errr());
		}


		
		// Getting variables from the form.
		$username = $_POST["username"];
		$login = $_POST["login"];
		$password = $_POST["password"];
		$email = $_POST["email"];
		
		// Working on them.
		if(strlen($username) < 6){
			echo "	";
		}





		// Adding Names to the database.
		$communicator = "INSERT INTO Users (usr_name) VALUES()";
		mysqli_query($connection, $communicattor);




	?>
</body>
</html>