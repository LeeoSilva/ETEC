<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 9</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">
	</head>
	<body>
		<div align="CENTER">
			<?php
				$nota1 = $_GET["nota1"];
				$nota2 = $_GET["nota2"];
				$avg   = ($nota1 + $nota2) * 0.5;

				if($avg >= 5){
					echo "<p>ALUNO APROVADO!</p>";
				}else if($avg < 5){
					echo "<p>ALUNO REPROVADO!<p>";
				}
			 ?>
		 <a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
