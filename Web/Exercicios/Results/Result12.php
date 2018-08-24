<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 12</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">

			<?php
				$Time1 = (string) $_GET["Time1"];
				$Time2 = (string) $_GET["Time2"];
				$Gols1 = (int)    $_GET["Gols1"];
				$Gols2 = (int) 		$_GET["Gols2"];


				if($Gols1 > $Gols2){
					echo "<p>O time vencedor é: " .$Time1 ." com " .$Gols1 ." Gols<br><br></p>";
				}else if($Gols2 > $Gols1){
					echo "<p>O time vencedor é: " .$Time2 ." com " .$Gols2 ."<br><br></p>";
				}else if($Gols1 == $Gols2){
					echo "<p>";
					echo "EMPATE!<br>";
					echo $Time1 ." - " .$Gols1 ." Gols<br>";
					echo $Time2 ." - " .$Gols2 ." Gols<br><br>";
					echo "</p>";
				}
			 ?>
		<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
