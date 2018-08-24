<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 11</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">

			<?php
				$Num1 = $_GET["Num1"];
				$Num2 = $_GET["Num2"];
				$Num3 = $_GET["Num3"];
				$Numbers = array($Num1, $Num2, $Num3);
				sort($Numbers);
				echo "<p>O maior número do conjunto é: <br><br>";
				echo $Numbers[sizeof($Numbers)-1];
			?>
			<br><br>
			<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
