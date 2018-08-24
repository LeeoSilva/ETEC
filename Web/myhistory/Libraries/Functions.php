<?php


	function connect(){
		// Connects to the database.

		$connection = new mysqli("localhost", "root", "justkidding0909");
		$db = $connection->select_db("OurHistory");

		if( $connection->connect_error ){
			die("Connection Failed: " + $connection->connect_error());
		}

		if( $db->connect_errno ){
			die("MySQL error: " + $db->connect_errno());
		}

		return $connection;
	}


	class Regitro{

		function id($connection, $id){
			$command = "SELECT usr_id FROM Users WHERE usr_id=$id;";
			if( $result = $connection->query($command) ){
				if( $info = $result->fetch_assoc() ){
					return $info["usr_id"];
				}
			}
			return "ERROR Registro->id function.";
		}


		function login($connection, $login){
			$command = "SELECT usr_login FROM Users WHERE usr_login=$login;";
			if( $result = $connection->query($command) ){
				if( $info = $result->fetch_assoc($result) ){
					return info["usr_login"];
				}
			}
			return "ERROR Registro->login function.";
		}

		function pass($connection, $pass){
			$command = "SELECT usr_pass FROM Users WHERE usr_pass=$pass;";
			if( $result = $connection->query($command) ){
				if( $info = $result->fetch_assoc() ){
					return $info["usr_pass"];
				}
			}
			return "ERROR Registro->password funtion.";
		}

		function email($connection, $email){
			$command = "SELECT usr_mail FROM Users WHERE usr_mail=$email;";
			if( $result = $connection->query($command) ){
				if( $info = $result->fetch_assoc() ){
					return $info["usr_mail"];
				}
			} 
			return "ERROR Registro->email.";
		}

		function level($connection, $level){
			$command = "SELECT usr_level FROM Users WHERE usr_level=$level;";
			if( $result = $connection->query($command) ){
				if( $info = $result->fetch_assoc() ){
					return $info["usr_level"];
				}
			}
			return "ERROR Registro->level function.";
		}
	}

?>