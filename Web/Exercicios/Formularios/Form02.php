<!DOCTYPE html>
<html>
	<head>

		<meta charset="utf-8">
		<title>Formulário 2</title>
		<link rel="../Images/ProfilePics/Tux.png">
		<link rel="stylesheet" type="text/css" href="../../CSS/Stylesheet.css">

	</head>
	<body bgcolor: #333333>
		<div align="CENTER">
		<p>Crie uma página onde o usuário digita o número de votos de dois candidatos,
			os votos brancos e nulos.<br>
			Calcular e mostrar em outra página o percentual que cada um representa em relação ao total de eleitores.</p>

			<form method="get" action="./Results/Result02.php">

			<p>Número de votos do candidato 1: <input type="text" name="Cand1"><br>
				 Número de votos do candidato 2: <input type="text" name="Cand2"><br>
				 Número de votos brancos: <input type="text" name="brancos"><br>
				 Número de votos nulos: <input type="text" name="nulos"><br><br></p>

				 	<a href="../index.html"> <img src="../Images/HomeIcons/Green_home.png" value="Página Inicial" width="100px" height="100px"><a><br><br>
 					<a href="./Results/Result02.php"> <input type="submit" value="Enviar"></a>

			</form>
		</div>
	</body>
</html>
