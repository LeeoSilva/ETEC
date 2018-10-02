
<?php

include("../conexao.php");
header('Content-Type: application/json');
//header("Access-Control-Allow-Origin: *");
//header("Access-Control-Allow-Headers: Content-Type");

$postdata = file_get_contents("php://input");
$request = json_decode($postdata);
$nome = $request->nome;
$idade = $request->idade;
$peso = $request->peso;
$altura = $request->altura;

$sql = "insert into atleta (atl_nome, atl_idade, atl_peso, alt_altura) values ('$nome',$idade, $peso, $altura)";
$status = mysqli_query($conexao, $sql);
if ($status) {
    $data = ["status" => "OK", "msg" => "Inserido com Sucesso"];
    echo json_encode($data);
} else {
    $data = ["status" => "Erro", "msg" => "Erro ao Inserir " . mysqli_error($conexao)];
    echo json_encode($data);
}
?>