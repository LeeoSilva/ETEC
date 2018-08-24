<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 3</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">
	</head>
	<body>
		<div align="CENTER">
		<?php
			//Variables

			$num1 = $_GET["Num1"];
			$num2 = $_GET["Num2"];
			$num3 = $_GET["Num3"];
			$num4 = $_GET["Num4"];
			$Result = ($num1 + $num2 + $num3 + $num4);
			echo "<p>O resultado é: " .$Result ."</p>";
		 ?>
		<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
