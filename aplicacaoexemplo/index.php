<?php

require_once 'funcoes.php';

$nome = "";
$idade = "";
$id = "";
$acao = "";

if (!empty($_GET)) {
  $id = $_GET['id'];
  $acao = $_GET['acao'];
  
  if ($acao == 'carregar') {
    $cliente = buscarCliente($id);
    $nome = $cliente['nome'];
    $idade = $cliente['idade'];
  }

  if ($acao == 'excluir') {
    excluirCliente($id);
  }
}

if (!empty($_POST)) {
  salvarCliente($_POST);
}

$clientes = listarClientes();

?>
<htmL>
    <head>

        <title>Aplicação Exemplo</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/sticky-footer-navbar.css" rel="stylesheet">

    </head>

    <body>

    <header>
      <!-- Fixed navbar 
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="index.php">Aplicação Exemplo</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="index.php">Cadastro</a>
            </li>        
          </ul>         
        </div>
      </nav>
    </header>-->


    <main role="main" class="container">
     <h2>Cadastro</h2>

      <form method="POST">
        <input type="hidden" name="id" value="<?=$id?>"/>
        <div class="form-group">
          <label for="nome">Nome</label>
          <input type="text" class="form-control" name="nome" id="nome" 
          value="<?=$nome?>"
          placeholder="Digite seu nome!">          
        </div>
        <div class="form-group">
          <label for="nome">Idade</label>
          <input type="number" class="form-control" name="idade" id="idade"
          value="<?=$idade?>"
           placeholder="Digite a sua idade!">          
        </div>

        <input type="submit" class="btn btn-primary" value="Cadastrar"></input>
      </form>

      <table class="table">
          <tr>
            <th>ID</th>
            <th>NOME</th>
            <th>IDADE</th>
            <th>&nbsp;</th>
            <th>&nbsp;</th>
          </tr>
          <?php
            foreach($clientes as $cliente) {
          ?>
          <tr>
            <td><?=$cliente['id']?></td>
            <td><?=$cliente['nome']?></td>
            <td><?=$cliente['idade']?></td>
            <td><a class="btn btn-primary" href="index.php?acao=carregar&id=<?=$cliente["id"]?>">Carregar</a></td>
            <td><a class="btn btn-primary" href="index.php?acao=excluir&id=<?=$cliente["id"]?>">Excluir</a></td>
          </tr>
          <?php
          }
          ?>
      </table>

    </main>

     <footer class="footer">
      <div class="container">
        <span class="text-muted">Direitos reservados, aula @php.</span>
      </div>
    </footer>

    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    </body>

</html>