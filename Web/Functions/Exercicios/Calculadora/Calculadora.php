<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Calculadora</title>
		<link rel="TabImage" href="./Images/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">

			<?php
				function addition($num1, $num2){
					$sum = $num1 + $num2;
					return $sum;
				}

				function subtraction($num1, $num2){
					$result = $num1 - $num2;
					return $result;
				}

				function multiplication($num1, $num2){
					$product = $num1 * $num2;
					return $product;
				}

				function division($num1, $num2){
					$result = $num1 / $num2;
					return $result;
				}

				function potentiation($num1, $num2){
					for($i = 1; $i < $num2; $i++){
						$result = $num1 * $num1;
					}
					return $result;
				}

			 ?>
			 <form method="get" action="./Result.php">
					<input list="ChooseEquation">
						<datalist id="Equations">
							<option value="Adição">
							<option value="Subtração">
							<option value="Multiplicação">
							<option value="Divisão">
							<option value="Potenciação">
					</datalist>
					<input type="submit" value="Enviar">
				</form>

			 <a href="../index.html"> <img src="../../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br>

		</div>
	</body>
</html>
