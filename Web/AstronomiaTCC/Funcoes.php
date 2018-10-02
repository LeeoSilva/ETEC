<?php

	function getConn(){
		// Connects to the database.

		$connection = mysqli_connect("localhost", "root", "justkidding0909");
		$db = mysqli_select_db($connection, "astronomia");
		
		if( !$connection ){
			die("Falha na conexão: " . mysqli_connect_error());
		}
		
		if( !$db ){
			die("Falha no banco de dados: " . mysqli_connect_errno());
		}
		
		mysqli_query($connection,  "set names 'utf8'");
		mysqli_query($connection, 'SET character_set_connection=utf8');
		mysqli_query($connection, 'SET character_set_client=utf8');
		mysqli_query($connection, "SET character_set_results=utf8");
		
		mb_language('uni'); 
		mb_internal_encoding('UTF-8');
		return $connection;
	}
	

	class Registro{
		// Classe de busca de registros no  banco de dados.


		function Artigo($connection, $assunto){
				// Busca um artigo de um certo assunto.
			
				$command = "SELECT artigo FROM artigos WHERE assunto='$assunto';";
				if(  $result = mysqli_query($connection, $command) ){
					if( $info = mysqli_fetch_assoc($result) ){
						return $info["artigo"];
					}else{
				//		return FALSE;
						return "Registro->Artigo: Falha na inserção de comandos: " . mysqli_connect_error();
					}
				}else{
				//	return FALSE;
					return "Registro->Artigo: Falha no banco de dados: " . mysqli_connect_errno();
				}
			}





		function Titulo($connection, $assunto){
			// Busca o título de um artigo de um certo assunto.

			$command = "SELECT art_titulo FROM artigos WHERE assunto='$assunto';";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					return $info["art_titulo"];
				}else{
				//	return FALSE;
						return "Registro->Titulo: Falha na inserção de comandos: " . mysqli_connect_error();
				}
			}else{
				//return FALSE;
				 		return "Registro->Titulo: Falha no banco de dados: " . mysqli_connect_errno();
			}
		}

		
		// Tabela login


		function id($connection, $id){
			$command = "SELECT id_login FROM login WHERE id='$id';";
			if( $result = mysql_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					return $info["id_login"];
				}else{
					//return FALSE;
										return "Registro->id: Falha na inserção de comandos: " . mysqli_connect_error();
				}
			}else{
		//	return FALSE;
			return "Registro->id: Falha no banco de dados: " . mysqli_connect_errno();

		
			}
		}




		function nome($connection, $nome){
			// Busca o nome de um usuário.

			$command = "SELECT nome FROM login WHERE nome='$nome'";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					return $info["nome"];
				}else{
					//return FALSE;
										return "Registro->nome: Falha na inserção de comandos: " . mysqli_connect_error();
				}
			}else{
				//return FALSE;
					return "Registro->nome: Falha no banco de dados: " . mysqli_connect_errno();
			}
		}


		function login($connection, $login){
			// Busca o login de um usuario.

			$command = "SELECT login FROM login WHERE login='$login'";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					return $info["login"];
				}else{
					//return FALSE;
					 return "Registro->login: Falha na inserção de comandos: " . mysqli_connect_error();
				}
			}else{
				//return FALSE;
				 return "Registro->login: Falha no banco de dados: " . mysqli_connect_error();
			}
		}

		function senha($connection, $pass){
			// Busca a senha de um usuário (Feita para verificação).

			$command = "SELECT senha FROM login WHERE senha='$pass'";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					return $info["senha"];
				}else{
	//				return FALSE;
					return "Registro->senha: Falha na inserção de comandos: " . mysqli_connect_error();
				}
			}else{
	//				return FALSE;
				return "Registro->senha: Falha no banco de dados: " . mysqli_connect_error();				
			}
		}

		function email($connection, $email){
			// Busca um email de um usuário.

			$command = "SELECT email FROM login WHERE email='$email'";
			if( $result = mysqli_query($connection, $command) ){
				if( $info = mysqli_fetch_assoc($result) ){
					return $info["email"];
				}else{
				//	return FALSE;
				 	return "Registro->email: Falha na inserção de comandos: " . mysqli_connect_error();
				}
			}else{
				//return FALSE;
				 return "Registro->email: Falha no banco de dados: " . mysqli_connect_error();				
			}
		}
	}


?>