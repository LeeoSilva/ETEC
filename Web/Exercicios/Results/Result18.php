<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 18</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
				$N = $_GET["N"];
				echo "<p>";
				if($N <= 0){
					echo "<p>Valor inválido!<br>";
					echo "Informe outro valor.</p>";
					sleep(1.5);
					header("../Exercicios/Form18.php");
				}
				for($i = 1; $i <= $N; $i++){
					if($i != $N){
						echo $i . ", ";
					}else{
						echo $i . ".";
					}
				}

				echo "</p>";
			 ?>

		<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
