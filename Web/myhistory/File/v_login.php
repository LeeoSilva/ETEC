<?php 
session_start();

$user=$_POST["username"];

$pass=$_POST["password"];


$_SESSION["user"]=$user;
$_SESSION["pass"]=$pass;

header("Location: ../index_user.php");

 ?>