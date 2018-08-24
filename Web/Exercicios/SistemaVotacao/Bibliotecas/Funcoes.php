<?php

function connect(){
	$connection = new mysqli("localhost", "root", "justkidding0909");
	$db = mysqli_select_db("Votacao");

	if( $connection->connect_error ){
		die("Connection Failed: " . $connection->connect_error());
	}

	if( $db->connect_errno ){
		die("Database Error: " . $db->connect_errno());
	}
}



class Registro{


	function __construct(){
		connect();
	}

	function schoolID($code){
		$command = "SELECT escola_id FROM Escolas WHERE escola_id=$code;";
		if( $result = $connection->query($command) ){
			if( $info = $result->fetch_assoc() ){
				return $info["escola_id"];
			}
		}
		return FALSE;
	}

	function course($course){
		$command = "SELECT cur_name FROM Cursos WHERE cur_name=$course;";
		if( $result = $connection->query($command) ){
			if( $info = $result->fetch_assoc() ){
				return $info["cur_name"];
			}
		}
		return FALSE;
	}

	function name($name){
		$command = "SELECT usr_name FROM Users WHERE usr_name=$name;";
		if( $result = $connection->query($command) ){
			if( $info = $result->fetch_assoc() ){
				return $info["usr_name"];
			} 
		}
		return FALSE;
	}

	function logged($code, $course, $name){
		$command = "SELECT usr_id FROM Users WHERE usr_name=$name AND cur_name";
	}




}

?>