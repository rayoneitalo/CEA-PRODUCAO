<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css/menuAdmin.css">

    <title>Administrador</title>
</head>

<body>
    <div class="container">
        <div class="header">
            <img src="../images/logo_principal.jpg" alt="logo ceub">
            <i class="fas fa-user">
                <h3>Nome do Administrador</h3>
            </i>
            <!-- <i class="fas fa-user">
                <h3>LogOff</h3>
            </i> -->
        </div>
        <div class="menu">
            <ul>
                <li><button class="btn-menu">Cadastrar Armários</button>
                </li>
                <li><button class="btn-menu" id="btn-cadeados" onclick="renderDiv()">Cadastrar Cadeado</button></li>
                <li><button class="btn-menu" id="btn-menu">Cadastrar Mapa de Arquivos</button>
                    <li><button class="btn-menu" id="btn-menu">Cadastrar Período Letivo</button></li>
            </ul>
        </div>

        <div class="main">
            <div class="main-cadeados">
                <div class="form-cadeados">
                    <h1>Cadastro de cadeados</h1>
                    <form action="../admin" method="POST">
                        <div class="form-group">
                            <label for="txtCodigo">Código do Cadeado</label>
                            <input type="text" id="txtCodigo" name="txtCod" required>
                        </div>
                        <div class="form-group">
                            <label for="txtSenha">Senha do Cadeado</label>
                            <input type="password" id="txtSenha" name="txtSenha" required>
                        </div>
                        <div class="form-group">
                            <button type="submit">Cadastrar</button>
                            <!-- TODO: Gerar tela de confirmação de cadastro com os dados 
                                       adicionados
                            -->
                        </div>
                    </form>
                </div>
            </div>
            <!-- <div class="main-armarios"></div> -->

            <!-- <div class="main-periodoLetivo">arm</div> -->
        </div>


    </div>
    <script src="../js/menuAdmin.js"></script>
    <script src="https://kit.fontawesome.com/43f367141c.js"></script>
</body>

</html>