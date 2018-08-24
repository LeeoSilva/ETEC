<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 6</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
			<div align="CENTER">

				<?php
					$Num = $_GET["Num"];
					if(is_int($Num)){
						if($Num > 10){
							echo "<p>Número Maior que 10</p>";
						}else if($Num < 10){
							echo "<p>Número Menor que 10</p>";
						}else if($Num == 10){
							echo "<p>Número Igual a 10</p>";
						}else{
							echo "<p>Inválido</p>";
						}
					}else{
						echo "<p>Inválido!</p>	";
					}
					?>
				 <a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>


			</div>
	</body>
</html>
