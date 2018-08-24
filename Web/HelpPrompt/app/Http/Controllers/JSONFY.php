<?php 

namespace App\Http\Controllers;

use Illuminate\Http\Request;



class JSONFY extends Controller{

    public function connection(){
        // Conecta e verifica se ocorreu sucesso na conexão do PostGRESQL.
        $connection = pg_connect(env('DB_HOST'), env('DB_PORT'), env('DB_DATABASE'), env('DB_USERNAME'), env('DB_PASSWORD'));

        if( !$connection ){ die("Error in connection: " . pg_last_error()); }
        return $connection;
    }

    public function index(){
        // Lista o banco
        return Accommodation::paginate('index.php');
    }


    public function create(){
        // Mostra o formulário de criação
        return Response();
    }

    public function store(){
        // Adiciona um registro no banco.
        return Response();
    }

    public function show($id){
        // Lista um registro dado seu id
        return Response();
    }

    public function edit($id){
        // Auto-explicativo '-'
        return Response();
    }

    public function update($id){
        // Atualiza um certo registro dado seu id
        return Response();
    }

    public function destroy($id){
        // Deleta um certo registro dado seu id
        return Response();
    }

}
