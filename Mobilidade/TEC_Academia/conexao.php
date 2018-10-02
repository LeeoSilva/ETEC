<?php

$conexao = new mysqli("localhost", "root", "");
$conexao->set_charset("UTF8");
if ($conexao->connect_error) {
    die("Falha ao conectar: " . $conexao->connect_error);
}
if (!$conexao->select_db("academia")) {
    die("O Banco de dados ACADEMIA não existe");
}
?>
