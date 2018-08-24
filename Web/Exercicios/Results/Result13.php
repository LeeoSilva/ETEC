<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 13</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
				$LitrosVendidos = (double) $_GET["LitrosVendidos"];
				$option = $_GET["comb"];
				$finalVal = (double) 0;
				if($option == "Gasolina"){
					$finalVal = $LitrosVendidos * 3.60;
					echo $finalVal;
					if($LitrosVendidos <= 20){
						$finalVal -= ($finalVal * 0.3);
					}else if($LitrosVendidos > 20){
						$finalVal -= ($finalVal * 0.6);
					}
				}else if($option == "Alcool"){
					$finalVal = $LitrosVendidos * 2.70;
					if($LitrosVendidos <= 20){
						$finalVal -= ($finalVal * 0.3);
					}else if($LitrosVendidos > 20){
						$finalVal -= ($finalVal * 0.4);
					}
				}
				$finalVal = number_format($finalVal, 2);
				echo "<p>Valor final: R$" .$finalVal ."</p>";
			 ?>



		<a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
		</div>
	</body>
</html>
