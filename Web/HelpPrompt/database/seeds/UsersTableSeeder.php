<?php

use Illuminate\Database\Seeder;
use App\users;

class UsersTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {		
		/*
		|--------------
		| Users Seeder
		|--------------
		|
		| Preenche alguns campos do banco de dados com registros
		| para testes e criação de situações
		|
		| Adicionando informações sobre os desenvolvedores:
		| Leonardo Camargo <leonardo.silva1199@etec.sp.gov.br>
		| Lorena Biondi <lorena.moreira@etec.sp.gov.br>
		| Livia Souto <livia.souto@etec.sp.gov.br>
		|		
		*/


		// Leonardo Camargo
		$user1            = new users;
		$user1->usr_ip    = '179.232.213.58'; // IP fixo da minha casa.
		$user1->usr_name  = 'LeonardoCamargo';
		$user1->usr_pass  = '1abaaf61cf319485ee3d8b023c94cf32'; // Md5 Crypto
		$user1->usr_mail  = 'leonardo.silva1199@etec.sp.gov.br';
		$user1->usr_cpf   = 49982031856;
		$user1->usr_level = 0;
		$user1->usr_birth = '2001-10-26';
		$user1->save();

		// Lorena Biondi
		$user1            = new users;
		$user1->usr_ip    = '0.0.0.0';
		$user1->usr_name  = 'LorenaBiondi'; 
		$user1->usr_pass  = '3919e36e75380cf1fa6d5a0723eed8df'; // Md5 Crypto
		$user1->usr_mail  = 'lorena.moreira@etec.sp.gov.br';
		$user1->usr_cpf   = 45791613865;
		$user1->usr_level = 0;
		$user1->usr_birth = '2001-05-05';
		$user1->save();
		
		// Livia Souto
		$user2            = new users;
		$user2->usr_ip    = '0.0.0.0';
		$user2->usr_name  = 'LiviaSouto';
		$user2->usr_pass  = 'daowidaslkdj'; // Keyboard Slap
		$user2->usr_mail  = 'livia.souto@etec.sp.gov.br';
		$user2->usr_cpf   = '46070795881';
		$user2->usr_level = 0;
		$user2->usr_birth = '2001-12-11';
		$user2->save();

    }
}
