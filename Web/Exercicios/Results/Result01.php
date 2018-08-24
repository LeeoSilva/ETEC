<html>
	<head>

		<meta charset="utf-8">
		<title>Result 1</title>
		<link rel="TabIcon" href="../Images/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../../CSS/Stylesheet.css">

	</head>
	<body>
		<div align="CENTER">

		<?php
				$width = $_GET["width"];
				$height = $_GET["height"];

				$result = $width * $height;

				echo "Área do retângulo = " . $result;
		 ?>

		 <br><br>
<a href="../../index.html"> <img src="../../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"></a><br><br>
</div>
	</body>
</html>
