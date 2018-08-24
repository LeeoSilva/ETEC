<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 4</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">

			<?php
				$Percent = ($_GET["Percent"] / 100);
				$Salary = $_GET["Salary"];

				$newSalary = number_format(($Salary * $Percent) + $Salary, 2);
				echo "<p>Novo percentual de reajuste: R$ " .$newSalary .".</p>";
 			?>
			<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>


		</div>
	</body>
</html>
