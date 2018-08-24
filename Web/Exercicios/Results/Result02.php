<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Resultado 2</title>
	</head>
	<body>

			<!-- Crie uma página onde o usuário digita o número de votos de dois candidatos, -->
			<!-- os votos brancos e nulos.<br> -->
			<!-- Calcular e mostrar em outra página o percentual que cada um representa em relação ao total de eleitores. -->

		<?php
			// Variables.
			$Cand1 = $_GET["Cand1"];
			$Cand2 = $_GET["Cand2"];
			$BlankVotes = $_GET["brancos"];
			$NullVotes = $_GET["nulos"];

			//Calculation
			$TotalVotes = ($Cand1 + $Cand2 + $BlankVotes + $NullVotes);
			$PercentCand1 = number_format($TotalVotes + (100 / $Cand1));
			$PercentCand2 = number_format($TotalVotes + (100 / $Cand2));

			echo "<p>Candidato 1 com " .$PercentCand1 ."% dos votos<p>";
			echo "<p>Candidato 2 com " .$PercentCand2 ."% dos votos<p>";
		 ?>

	</body>
</html>
