<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 7</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
				$Num = $_GET["Num"];
					if($Num > 0){
						echo "<p>Número POSITIVO.</p>";
					}else if($Num < 0){
						echo "<p>Número NEGATIVO.</p>";
					}else if($Num == 0){
						echo "<p>Número NULO.</p>";
					}
			 	?>

		 <a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>

		</div>
	</body>
</html>
