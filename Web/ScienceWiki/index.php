<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" type="text/css" href="./Layouts/Layout.css">
	<title>ScienceWiki</title>

</head>
<body>
	
	
	<div class="links" align="RIGHT">
		<?php

			// Libraries.
			include 'Libraries/Functions.php'; // --> Functions.
			include 'Libraries/Variables.php'; // --> Variables.

			// MySQL Connection
			$connection = mysqli_connect("localhost", "root", "justkidding0909", "ScienceWiki");
			$db = mysqli_select_db($connection, "ScienceWiki");
			$id = $_GET["userid"];

			// Check connection

			if ( !$connection ){
				die("Connection Failed: " . mysqli_connect_error());
			}

			if ( !$db ){
				die("Database Failed: " . mysqli_connect_errno() . "<br>" . mysqli_connect_error());
			}

			if ( isset($id) ){
					$html = "<p class='links' align='RIGHT'>LOGGED</p>";
					$html .= "<a href='./index.php' class='title' >ScienceWiki</a>";	
					$html .= "</div>";
					echo $html . "<br>";
					echo "</div>";
					drawWebsite($connection, $id);
				}
			else{
				header("Location: login.html");
			}

		?>
		</div>
	
		<div class="CreateArtig" align="CENTER">
			<a href="./CreateArtig.html"><input type="button" value="Post Artig"></a><br>



		</div>
		


</body>
</html>