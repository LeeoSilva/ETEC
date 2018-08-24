<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 10</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
		<?php
			$num1 = $_GET["num1"];
			$num2 = $_GET["num2"];
			$numbers = array($num1, $num2);
			sort($numbers);
			echo "<p>Ordem Crescente: </p>";
			for ($i = 0; $i <= sizeof($numbers); $i++){
				echo "<p>" .$numbers[$i] ." </p>";
			}
		 ?>
		<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
