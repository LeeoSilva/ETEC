<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 16</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
				echo "<p>";
				for($i = (int) 0; $i <= 10; $i++){
					$aux = 100 + $i;
					if($aux < 110){
						echo $aux . ", ";
					}else if($aux == 110){
						echo $aux . ".";
					}
				}
				echo "</p>"
			?>
			<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
