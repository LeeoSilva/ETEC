<?php
	include("../Bibliotecas/Funcoes.php");
	
	$connection = connect();
	$registro = new Registro();

	$code = $_GET["escola"];
	$course = $_GET["curso"];
	$name = $_GET["name"];

	if( $registro->schoolID($code) == FALSE ){
		$connection->close();
		exit("Registro->schoolID");
	}

	if( $registro->course($course) == FALSE ){
		$connection->close();
		exit("Registro->course");
	}

	if( $registro->name($name) == FALSE ){
		$connection->close();
		exit("Registro->name");
	}


	header("Location: ../index.php?");

?>