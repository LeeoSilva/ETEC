<?php

	function connect(){
		// MySQL Connection

		$connection = mysqli_connect("localhost", "root", "justkidding0909");
		$db = mysqli_select_db("Votacao");

		if( !$connection ){
			die("Connection Failed: " . mysqli_error());
		}

		if( !$db ){
			die("Database Error: " . mysqli_errno());
		}

		return $connection;
	}


	class alunos{

		// Alunos Fields.

		function aluno_id($connection, $id){
			// Search for aluno_id in the database.

			$command = "SELECT aluno_id FROM Aluno WHERE aluno_id=$id";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($connection, $result) ){
					return $info["aluno_id"];
				}
			}
		}

		function aluno_name($connection, $name){
			// Search for aluno_name in the database.

			$command = "SELECT aluno_name FROM Aluno WHERE aluno_name=$name";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($connection, $result) ){
					return $info["aluno_name"];
				}
			}
		}

		function aluno_mail($connection, $mail){
			// Search for aluno_mail in the database.

			$command = "SELECT aluno_mail FROM Aluno WHERE aluno_mail=$mail";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($connection, $result) ){
					return $info["aluno_mail"];
				}
			}
		}

		function aluno_pass($connection, $pass){
			// Search for aluno_pass in the database.

			$command = "SELECT aluno_pass FROM Aluno WHERE aluno_pass=$pass";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($connection, $result) ){
					return $info["aluno_pass"];
				}
			}
		}

		// Escolas Field.

		function escola_id($connection, $id){
		}


	}




?>