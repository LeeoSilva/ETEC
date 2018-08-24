<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 23</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">
	</head>
	<body>
		<div align="CENTER">
			<?php
				$num1 = $_GET["num1"];
				$num2 = $_GET["num2"];
				echo "<p>";
				for($i = $num1; $i <= $num2; $i++){
					$result = pow($i, 2);
					if($i % 10 == 0){
						echo "<br>";
					}
					if($i == $num2){
						echo "$result.";
					}else{
						echo "$result, ";
					}
				}
				echo "</p>";
			 ?>
			<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
