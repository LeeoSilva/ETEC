<!-- Functions for ScienceWiki -->

<?php

include 'Variables.php';

// MySQL Connection.
$connection = mysqli_connect("localhost", "root", "justkidding0909");
$db = mysqli_select_db($connection, "ScienceWiki");


function drawWebsite($connection, $id){ // Begin drawWebsite.
	// It speaks for itself.
	
	$username = "";
	echo "<h1 align='CENTER'>Your Artigs</h1>";
	$command = "SELECT art FROM Artigs WHERE usr_id='" . $id . "';";
	if( $result = mysqli_query($connection, $command) ){
		if( $info = mysqli_fetch_assoc($result) ){
			$username = $info["usr_name"];
		}
	}
} // End drawWebsite.


function highestID($connection){ // Begin highestID.
	// Takes the number of users in the database.

	$highestID = 0;
	$command = 'SELECT usr_id FROM Users WHERE usr_id>"' . $highestID . "';";
	if($result = mysqli_query($connection, $command)){
		while($info = mysqli_fetch_assoc($result)){
			if($info["usr_id"] >= $highestID){
				$highestID = $info["usr_id"];
			}else{
				return $highestID;
			}
		}
	}
} // End highestID.


function CheckLogin($id){
	// Checks if there is a login session open.
	if( isset($id) ){
		return FALSE;
	}else{
		return TRUE;
	}
}


function GetName($connection){
	// Gets the name of the actual logged user.
	if( CheckLogin() ){
		$command = "SELECT usr_name FROM Users WHERE usr_id='" . $GLOBALS["ID"] . "';";
		if( $result = mysqli_query($connection, $command) ){
			if( $info = mysqli_fetch_assoc($result) ){
				$name = $info["usr_name"];
				return name;
			}else{
				return FALSE;
			}
		}else{
			return FALSE;
		}
	}else{
		return FALSE;
	}


}

function ID($connection, $usr, $pass){
	// Gets the ID of the actual logged user.
	$command = "SELECT usr_id FROM Users WHERE usr_name='" . $usr . "' AND usr_pass='" . $pass . "';";
	// echo $command . "<br>";
	if( $result = mysqli_query($connection, $command) ){
		if ( $info = mysqli_fetch_assoc($result) ){
			return $info["usr_id"];
		}else{
			return mysqli_connect_errno();
		}
		return "checkcredentials2";
	}
}



?>