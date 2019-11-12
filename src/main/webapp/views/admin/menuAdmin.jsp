<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../../css/menuAdmin.css">
    <script src="../../js/jquery-3.4.1.min.js"></script>
    <title>Administrador</title>
</head>

<body>
    <div class="container">
        <div class="header">
            <img src="../../images/logo_principal.jpg" alt="logo ceub">
            <i class="fas fa-user">
                <h3>Nome do Administrador</h3>
            </i>
            <!-- <i class="fas fa-user">
                <h3>LogOff</h3>
            </i> -->
        </div>
        <div class="menu">
            <ul>
                <li><button class="btn-menu" id="btn-armario">Cadastrar Armários</button>
                </li>
                <li><button class="btn-menu" id="btn-cadeados">Cadastrar Cadeado</button></li>
                <li><button class="btn-menu" id="btn-mapaArmarios">Cadastrar Mapa de Armários</button>
                    <li><button class="btn-menu" id="btn-periodoLetivo">Cadastrar Período Letivo</button></li>
            </ul>
        </div>
        <div class="main">
            <div class="main-cadeados">
                <div class="form-cadeados">
                    <h1>Cadastrar Cadeados</h1>
                    <form action="../../manager" method="POST">
                        <input name="id" type="hidden" value="1">
                        <div class="form-group">
                            <input type="text" id="txtCodigo" name="txtCod" required placeholder="Código do Cadeado">
                        </div>
                        <div class="form-group">
                            <input type="text" id="txtSenha" name="txtSenha" required placeholder="Senha do Cadeado">
                        </div>

                        <div class="form-group">
                            <button type="submit">Cadastrar</button>
                            <!-- TODO: Gerar tela de confirmação de cadastro com os dados 
                                       adicionados
                            -->
                        </div>
                    </form>
                    <div id="listagemCadeadosAjax"></div>
                </div>
            </div>
            <div class="main-armarios">
                <div class="form-armarios">
                    <h1>Cadastrar Armarios</h1>
                    <form action="../../manager" method="POST">
                        <input name="id" type="hidden" value="2">
                        <div class="form-group">
                            <input type="number" id="txtNumber" name="txtNumber" required placeholder="Numero do Armário">
                        </div>
                        <div class="form-group">
                            <input type="text" id="txtLocal" name="txtLocal" required placeholder="Localização">
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
            <div class="main-periodoLetivo">
                <div class="form-periodoLetivo">
                    <h1>Cadastrar Período Letivo</h1>
                    <form action="../../manager" method="POST">
                        <input name="id" type="hidden" value="3">
                        <div class="form-group">
                            <input type="number" required placeholder="Ano letivo">
                        </div>
                        <div class="form-group">
                            <input type="number" required placeholder="Número">
                        </div>
                        <div class="form-group">
                            <input type="date" required placeholder="Data de Devolução">
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
            <div class="main-mapaArmarios">
                <div class="form-mapaArmarios">
                    <h1>Cadastrar Mapa de Armários</h1>
                    <form action="../../manager" method="POST">
                        <input name="id" type="hidden" value="4">
                        <div class="form-group">
                            <input type="text" required placeholder="Tipo">
                        </div>
                        <div class="form-group">
                            <input type="number" required placeholder="Quantidade">
                        </div>
                        <div class="form-group">
                            <input type="text" required placeholder="Altura">
                        </div>
                        <div class="form-group">
                            <input type="number" required placeholder="Quantidade de colunas">
                        </div>
                        <div class="form-group">
                            <input type="number" required placeholder="Numero">
                        </div>
                        <div class="form-group">
                            <input type="text" required placeholder="Disciplinas">
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
        </div>
    </div>
    <script src="../../js/menuAdmin.js"></script>
    <script src="https://kit.fontawesome.com/43f367141c.js"></script>
</body>

</html>