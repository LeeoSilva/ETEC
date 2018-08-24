<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 5</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">

			<?php
				$F = $_GET["Temperature"];
				$C = number_format(($F - 32) / 1.8, 2);
				echo "<p>Temperatura em °F: " .$C ."</p>";
			 ?>

			 <a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>

		</div>
	</body>
</html>
