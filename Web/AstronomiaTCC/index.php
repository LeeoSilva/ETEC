<html>
	<head>
		<link rel='stylesheet' href='./Layout/style.css' type="text/css">
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta charset="UTF-8">
		<title>Astronomia</title>
	</head>
	<body class='flex' style='background-image: url("./Imagens/space.png")'>
		<div class='fullscreen flex'>
			<div class='menu'>
				<a href='index.php' class='block'>H<div class='balaodialogo'>Home</div></a>
				<a href='estrela.php' class='block'>E<div class='balaodialogo'>Estrelas</div></a>
				<a href='planeta.php' class='block'>P<div class='balaodialogo'>Planetas</div></a>
				<a href='galaxia.php' class='block'>G<div class='balaodialogo'>Galáxias</div></a>
				<a href='inserir.php' class='block'>T<div class='balaodialogo'>Inserir Artigo</div></a>
			</div>
			<div class='login flex'>
				<a href='./Formularios/login.php'>Login</a>
				<div class='line'></div>
				<a href='./Formularios/cadastrar.php'>Cadastre-se</a>
			</div>
			<div class='title'>
				ASTRONOMIA
			</div>
			<div class='subtitle'>


				<?php
					include('Funcoes.php');
	
					$connection = conectar();
					$titulo = new Registro();
					echo "<h4>" . $titulo->Titulo($connection, 'Astronomia') . "</h4>";
				?>
			
			
			</div>	
		</div>
		<div class='info'>
			
			<?php
				$artigo = new Registro();
				echo  "<h4>" . $artigo->Artigo($connection, 'Astronomia') . "</h4>";
				
			?>
		
		</div>
	</body>
</html>