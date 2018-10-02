<?php

header('Content-Type: application/json');
//header("Access-Control-Allow-Origin: *");
//header("Access-Control-Allow-Headers: Content-Type");
include("../conexao.php");
$sql = "select atl_id as id, atl_nome as nome, atl_idade as idade,atl_peso as peso, atl_altura as altura from atleta order by atl_nome";
$result = mysqli_query($conexao, $sql);
$r["result"] = $result->fetch_all(MYSQLI_ASSOC);
echo json_encode($r, JSON_UNESCAPED_UNICODE);
?>
 