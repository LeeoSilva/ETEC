<?php
	include('Funcoes.php');

	$connection = conectar();
	
	$nome = $_POST['nome'];
	$login = $_POST['login'];
	$pass = sha1($_POST['pass']);
	$email = $_POST['email'];
	
	$verificacao = new Registro();
	
	if( $verificacao->nome($connection, $nome) == $nome ){
		echo "<script>alert(\"Este usuário já está registrado\")</script>";
		header('./cadastrar.php');
	}

	if( $verificacao->login($connection, $login) == $login ) {
		echo "<script>alert(\"Este login já está resigstrado\")</script>";
		header('./cadastrar.php');
	}

	if( $verificacao->email($connection, $email) == $email ){
		echo "<script>alert(\"Este email já está resigstrado\")</script>";
		header('./cadastrar.php');
	}


	$command = "insert into login(nome, login, senha, email) values('$nome','$login','$pass','$email');";
	if( $result = mysqli_query($connection, $command) ){
		echo "<script>alert(\"Cadastro realizado com sucesso\")</script>";
	}else{
		echo "<script>alert(\"Nao foi possível realizar o cadastro\")</script>";
	} 
	echo("<script type='text/javascript'>location.href='./Formularios/login.php';</script>");
?>