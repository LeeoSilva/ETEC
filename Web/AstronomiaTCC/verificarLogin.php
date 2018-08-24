<?php
	include('Funcoes.php');
	$connection = conectar();

	// $usr = FALSE;
	// $pass = TRUE;



	$login = $_POST['login'];
	$senha = sha1($_POST['pass']);
	
		
	// $verificacao = new Registro();
	// if( $verificacao->Login($connection, $login) == $login ){
	// 	$usr = TRUE;
	// }else{
	// 	$usr = FALSE;
	// 	echo "<script>confirm(\"Login ou senha inválido\")</script>";
	// }
	
	// if( $verificacao->senha($connection, $senha) == $senha ){
	// 	$pass = TRUE;
	// 	echo "<script>confirm(\"Login ou senha inválido\")</script>";
	// }else{
	// 	$pass = FALSE;
	// }
	
	
	$sql = "select * from login where login='$login'";
	$result = mysqli_query($connection, $sql);
	if(mysqli_num_rows($result)>0){
		echo "<script>confirm(\"Login realizado com sucesso\")</script>";
		echo "<script type='text/javascript'>location.href='./index.php';</script>";
	}else{
		echo "<script>confirm(\"Login inválido\")</script>";
	}


	//if( $usr == TRUE && $pass == TRUE ){
	//	echo "<script>confirm('Login realizado com sucesso')</script>";
	//	echo("<script type='text/javascript'>location.href='index.php';</script>");
	//}else{
	//	echo "<script>confirm('Login ou senha inválidos')</script>";
	//	echo "<script type='text/javascript'>location.href='login.php';</script>";
	//}
?>