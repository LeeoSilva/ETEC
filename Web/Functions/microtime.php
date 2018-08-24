<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>MicroTime</title>
		<link rel="TabImage" href="./Images/Tux.png">
		<link rel="stylesheet" type="text/css" href="../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
				$inicio = microtime();
				$i = 1;

				while($i <= 1000){
					echo "<p>Escrevendo linha $i <br></p>";
					$i++;
				}

				$final = microtime();
				$tempo = $final - $inicio;
				echo "<p><br> Página gerada em $tempo segundos.</p>";
			 ?>
			 <br>
			 <a href="../index.html"> <img src="../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"> <a><br>



		 </div>
	</body>
</html>
