<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 19</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
					echo "<h1>Tabuada do 8: </h1>";
					echo "<p>";
					for($i = 1; $i <= 10; $i++){
						$constant = 8;
						$result = $constant * $i;
						echo $constant ." * " .sprintf('%02.0f', $i) ." = " .sprintf('%02.0f', $result) ."<br>";
					}
					echo "</p>";
			 ?>
			 <a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
