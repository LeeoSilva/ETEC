<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
</head>
<body>
	<div align="CENTER">
		<?php


			include('./Bibliotecas/Funcoes.php');

			// Variables.

			$connection = connect();

			$username = $_POST["username"];
			$email = $_POST["email"];
			$pass = sha1($_POST["pass"]);
			$registro = new Registro();

			// Checks if the username exists in the database.
			if( $registro->nome($connection, $username) == $username ){
				echo "<script>alert(\"Este usuário já está registrado!\")</script>";
				header('./Formularios/Cadastro.html');
			}

			if( $registro->email($connection, $email)  == $email){
				echo "<script>alert(\"Este email já está registrado!\")</script>";
				header('./Formularios/Cadastro.html');
			}

			$command - "INSERT INTO *"



		?>
	</div>
</body>
</html>