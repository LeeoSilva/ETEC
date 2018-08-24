<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 8</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">
			<?php
				$AppleNums = $_GET["AppleNums"];
				if($AppleNums < 12){
					$Result = $AppleNums * 1.30;
					echo "<p>Preço Final: R$ " .$Result .".</p>";
				}else if($AppleNums >= 12){
					echo "<p>Preço Final: R$ " .number_format($AppleNums, 2) . ".</p>";
				}
		 ?>
		 <a href="../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>

	 </div>
	</body>
</html>
