<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 15</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
				echo "<p>Ordem Decrescente: <br>";
				for($i = 100; $i >= 50; $i--){
					if($i % 10 == 0 and $i != 100){
						echo "<br>";
					}
					echo $i .", ";
				}
				echo "</p>";
			 ?>
			 <a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
