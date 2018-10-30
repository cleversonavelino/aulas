<?php
session_start();
if (empty($_SESSION['clientes'])) {
    $_SESSION['clientes'] = [];
}

function salvarCliente($cliente)  {  
    if (!empty($cliente['id']) && buscarCliente($cliente['id'])) {      
        foreach($_SESSION['clientes'] as $indice => $clienteAlterar) {
            if ($cliente['id'] == $clienteAlterar['id']) {
                $_SESSION['clientes'][$indice] = $cliente;
            }
        }       
    } else {    
       $cont = count($_SESSION['clientes']);
       $cliente['id'] = $cont + 1;//$cont++;
       array_push($_SESSION['clientes'],$cliente);       
    }
}

function listarClientes() {
    return $_SESSION['clientes'];
}

function buscarCliente($id) {
    foreach ($_SESSION['clientes'] as $cliente) {
        if ($cliente['id'] == $id) {
            return $cliente;
        }
    }
}

function excluirCliente($id) {    
    foreach($_SESSION['clientes'] as $indice => $clienteRemover) {

        if ($clienteRemover['id'] == $id) {
            unset($_SESSION['clientes'][$indice]);
        }
    }
}


?>