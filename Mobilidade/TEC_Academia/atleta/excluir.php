<?php

include("../conexao.php");
header('Content-Type: application/json');
//header("Access-Control-Allow-Origin: *");
//header("Access-Control-Allow-Headers: Content-Type");
$postdata = file_get_contents("php://input");
$request = json_decode($postdata);
$codigo = $request->codigo;
$sql = "delete from atleta  where atl_id = $codigo";
$status = mysqli_query($conexao, $sql);
if ($status) {
    $data = ["status" => "OK", "msg" => "Excluido com Sucesso"];
    echo json_encode($data);
} else {
    $data = ["status" => "Erro", "msg" => "Erro ao Excluir " . mysqli_error($conexao)];
    echo json_encode($data);
}
?>