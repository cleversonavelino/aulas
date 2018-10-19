<?php
session_start();
if (empty($_SESSION['clientes'])) {
    $_SESSION['clientes'] = [];
}

function salvarCliente($cliente) {
    $id = count($_SESSION['clientes']);
    $cliente['id'] = $id + 1;
    array_push($_SESSION['clientes'],$cliente);
}

function listarClientes() {
    return $_SESSION['clientes'];
}


?>