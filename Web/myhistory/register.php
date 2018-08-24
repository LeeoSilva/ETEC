<!DOCTYPE html>
<html>		
<head>
	<title>Register</title>
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
	               		<h1 class="title">Registrar</h1>
	               		<hr />
	               	</div>
	            </div> 

				<div class="main-login main-center">
					<form class="form-horizontal" method="post" action="file/v_register.php">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Nome:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="name"  placeholder="Digite seu Nome" required/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">E-mail:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="email" id="email"  placeholder="Digite seu E-mail" required/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Usuário:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon">@</span>
									<input type="text" class="form-control" name="username" id="username"  placeholder="Digite um Nome para Usuário" required/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Senha:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="password"  placeholder="Digite uma Senha" required/>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<button type="submit" class="btn btn-primary btn-lg btn-block login-button">Registrar</button>
						</div>
					</form>
					<div class="login-register">
				            <a href="login.php">
				            	<button type="submit" class="btn btn-primary btn-lg btn-block login-button">Login</button>
				            </a>	
				         </div>
				</div>
			</div>
		</div>


	<!--(NAO MEXER) JAVA SCRIPT && JQUERY-->
		<script src="Scripts/js/jquery.min.js" type="text/javascript"></script>
		<script src="Scripts/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>