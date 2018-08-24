<html>
	<head>
		<link rel='stylesheet' href='../Layout/style.css' type="text/css">
		<meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta charset="UTF-8">
		<title>Logar</title>
	</head>
	<body class='flex' style='background-image: url("../Imagens/space.png")'>
		<div class='fullscreen flex'>
			<div class='menu'>
				<a href='../index.php' class='block'>H<div class='balaodialogo'>Home</div></a>
				<a href='../estrela.php' class='block'>E<div class='balaodialogo'>Estrelas</div></a>
				<a href='../planeta.php' class='block'>P<div class='balaodialogo'>Planetas</div></a>
				<a href='../galaxia.php' class='block'>G<div class='balaodialogo'>Galáxias</div></a>
				<a href='../inserir.php' class='block'>T<div class='balaodialogo'>Inserir Artigo</div></a>
			</div>
			<table>
				<thead>
					<tr><th colspan='2'>Login</th></tr>
				</thead>
				<tbody>
					<form method='post' action='../verificarLogin.php' class='body_form'>
						<tr><td colspan='2'><input type='text' name='login' placeholder='Digite o seu login' required></td></tr>
						<tr><td colspan='2'><input type='password' name='pass' placeholder='Digite a sua senha' required></td></tr>
						<tr>	
							<td><input type='reset' value='Limpar'></td>
							<td><input type='submit' value='Logar'></td>
						</tr>
					</form>
				</tbody>
			</table>
		</div>
	</body>
</html>