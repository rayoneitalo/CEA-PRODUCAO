<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta http-equiv="X-UA-Compatible" content="ie=edge">
            <link rel="stylesheet" href="../css/spaceUser.css">
            <title>Espaço Aluno</title>
        </head>

        <body>
            <div class="container">
                <div class="header">
                    <img src="../images/logo_principal.jpg" alt="logo ceub">
                    <i class="fas fa-user"><h3>Nome do Aluno</h3></i>

                </div>
                <div class="menu">
                    <ul>
                        <li><button class="btn-menu"><i class="fas fa-home"><span class="text-menu">Home</span></i></button>
                        </li>
                        <li><button class="btn-menu"><i class="fas fa-desktop"><span class="text-menu">Auto
                                Atendimento</span></i></button></li>
                        <li><button class="btn-menu" id="btn-menu"><i class="fas fa-archive"><span class="text-menu">Alugar
                                Armário</span></i></button></li>
                                <li><a href="http://localhost:8080/CEA/views/menuAdmin.jsp">Admin</a></li>
                    </ul>
                </div>

                <div class="map">
                    <div class="options">
                        <h3>Selecione o bloco </h3>
                        <div class="btns">
                            <button class="btn-blocks" id="btn-cod1">Bloco 1</button>
                            <button class="btn-blocks" id="btn-cod2">Bloco 2</button>
                            <button class="btn-blocks" id="btn-cod3">Bloco 3</button>
                            <button class="btn-blocks" id="btn-cod4">Bloco 4</button>
                            <button class="btn-blocks" id="btn-cod5">Bloco 5</button>
                            <button class="btn-blocks" id="btn-cod6">Bloco 6</button>
                            <button class="btn-blocks" id="btn-cod7">Bloco 7</button>
                        </div>

                    </div>
                    <div class="map-cabinets">
                        <div class="cod-cabinets" id="cod1">
                            <h3>Armários-Bloco 1</h3>
                            <img src="../images/example_map.PNG" alt="">
                        </div>
                        <div class="cod-cabinets" id="cod2">
                            <h3>Armários-Bloco 2</h3>
                            <img src=".../images/example_map.PNG" alt="">
                        </div>
                        <div class="cod-cabinets" id="cod3">
                            <h3>Armários-Bloco 3</h3>
                            <img src="../images/example_map.PNG" alt="">
                        </div>
                        <div class="cod-cabinets" id="cod4">
                            <h3>Armários-Bloco 4</h3>
                            <img src="../images/example_map.PNG" alt="">
                        </div>
                        <div class="cod-cabinets" id="cod5">
                            <h3>Armários-Bloco 5</h3>
                            <img src="../images/example_map.PNG" alt="">
                        </div>
                        <div class="cod-cabinets" id="cod6">
                            <h3>Armários-Bloco 6</h3>
                            <img src="../images/example_map.PNG" alt="">
                        </div>
                        <div class="cod-cabinets" id="cod7">
                            <h3>Armários-Bloco 7</h3>
                            <img src="../images/example_map.PNG" alt="">
                        </div>

                    </div>
                </div>
            </div>
            <script src="../js/spaceUser.js"></script>
            <script src="https://kit.fontawesome.com/43f367141c.js"></script>
        </body>

        </html>