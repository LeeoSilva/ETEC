<?php

include("../conexao.php");
header('Content-Type: application/json');
//header("Access-Control-Allow-Origin: *");
//header("Access-Control-Allow-Headers: Content-Type");
$postdata = file_get_contents("php://input");
$request = json_decode($postdata);
$codigo = $request->codigo;
$nome = $request->nome;
$idade = $request->idade;
$peso = $request->peso;
$altura = $request->altura;
$sql = "update atleta set atl_nome = '$nomec', atl_idade = $idade, atl_peso = $peso, atl_altura = $altura where atl_id = $codigo";
$status = mysqli_query($conexao, $sql);
if ($status) {
    //$data = ["status" => "OK","msg"=>"Alterou"];
    $data = ["status" => "OK", "msg" => "Alterado com sucesso"];
    echo json_encode($data);
} else {
    $data = ["status" => "Erro", "msg" => "Erro ao Alterar" . mysqli_error($conexao)];
    echo json_encode($data);
}
?>