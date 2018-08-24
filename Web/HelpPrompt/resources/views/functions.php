<?php

	function connection(){
	    // Conecta e verifica se ocorreu sucesso na conexão do PostGRESQL.
	    $connection = pg_connect(env('DB_HOST'), env('DB_PORT'), env('DB_DATABASE'), env('DB_USERNAME'), env('DB_PASSWORD'));	
		if( !$connection ){ die("Error in connection: " . pg_last_error()); }
    	return $connection;
    }
?>