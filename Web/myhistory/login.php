<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">	
		<!--(NAO MEXER) BOOTSTRAP-->
		<link rel="stylesheet" href="Scripts/css/bootstrap.css">
	
		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="Scrpts/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
		
		<!--REGISTER/LOGIN CSS-->
		<link rel="stylesheet" href="Scripts/css/register_login.css">

</head>
<body>
	<?php (file_exists('file/menu.php') ? include 'file/menu.php' : header('Location: erro.php')) ?>

		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h1 class="title">Login</h1>
	               		<hr />
	               	</div>
	            </div> 

				<div class="main-login main-center">
					<form class="form-horizontal" method="post" action="file/v_login.php">
						
						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Usuário:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon">@</span>
									<input type="text" class="form-control" name="username" id="username"  placeholder="Digite o Usuário Cadastrado" required/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Senha:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="password"  placeholder="Digite a Senha Cadastrada" required/>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<button type="submit" class="btn btn-primary btn-lg btn-block login-button">Entrar</button>
						</div>
					</form>
				</div>
			</div>
		</div>


	<!--(NAO MEXER) JAVA SCRIPT && JQUERY-->
		<script src="Scripts/js/jquery.min.js" type="text/javascript"></script>
		<script src="Scripts/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>