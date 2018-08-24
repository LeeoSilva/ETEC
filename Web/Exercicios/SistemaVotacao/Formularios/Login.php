<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Login Page</title>

	<style>
		

		h1, p {
			color: #FFF;
			text-shadow: 2px 3px 4px #000;
		}

		a {
			text-decoration: none;
		}

	</style>


</head>

<body bgcolor="#0067B8">
	<div align="CENTER">

		<h1>Sistema de votação</h1>

			<form method="POST" action="./Logica/VerificarLogin.php">
			<p>
				Código da Esola: <input type="text" value="escola"><br>
				Curso: <input type="text" value="curso"><br>
				Nome: <input type="text" value="nome"><br><br>
				<a href="./Logica/VerificarLogin.php"> <input type="submit" value="Send"> </a>
			</p>
		</form>
	</div>
</body>

</html>