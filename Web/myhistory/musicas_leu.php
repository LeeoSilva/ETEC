<!DOCTYPE html>
<html>
<head>
	<title>Músicas Leonardo</title>
		<?php include("File/SubFile/iniciar.php"); ?>
		<style type="text/css" media="screen">
			body{
				background-image: url(img/back.jpg);
				background-repeat: no-repeat;
			}
		</style>
	</head>
<body>

	<?php include("file/menu.php"); ?>

	<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
		<!--NADA-->
	</div>

	<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" align="center">
		<h2 align="center">Minhas Músicas Preferidas:</h2>
					<br>
					<div>
						<p>Twenty One Pilots</p>
						<audio controla controls><source src="music/a.mp3"></audio>
					</div>
						<br>
					<div>
						<p>System Of A Down</p>	
						<audio controla controls><source src="music/a.mp3"></audio>
					</div>
						<br>
					<div>
						<p>Nirvana</p>	
						<audio controla controls><source src="music/a.mp3"></audio>
					</div>
						<br>
					<div>
						<p>Pink Floyd</p>	
						<audio controla controls><source src="music/a.mp3"></audio>
					</div>
						<br>
					<div>
						<p>Eminem</p>
						<audio controla controls><source src="music/a.mp3"></audio>					
					</div>
					
	</div>

	<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
		<!--NADA-->		
	</div>

	<!--(NAO MEXER) JAVA SCRIPT && JQUERY-->
	<?php include("File/SubFile/fechar.php"); ?>
</body>
</html>