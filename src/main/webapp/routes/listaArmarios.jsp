<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="model.beans.Armario"%>
<%@page import="model.dao.ArmarioDAO"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/spaceUser.css">
    <link rel="stylesheet" href="css/listaArmarios.css">
    <title>Espaço Aluno</title>

</head>

<body>
    <div class="container">
        <div class="header">
            <img src="images/logo_principal.jpg" alt="logo ceub">
            <i class="fas fa-user"><h3>Nome do Aluno</h3></i>

        </div>
        <div class="menu">
            <ul>
                <li>
                    <button class="btn-menu"><i class="fas fa-home"><span class="text-menu">Home</span></i></button>
                </li>
                <li>
                    <button class="btn-menu"><i class="fas fa-desktop"><span class="text-menu">Auto Atendimento</span></i></button>
                </li>
                <li>
                    <button class="btn-menu" id="btn-menu"><i class="fas fa-archive"><span class="text-menu">Alugar Armário</span></i></button>
                </li>
            </ul>
        </div>

        <div class="map">
            <div class="map-cabinets">
                <h1>Lista de Armários disponíveis</h1>

                <table class="table">
                    <tr>
                        <th>Numero</th>
                        <th>Localização</th>
                        <th>Ações</th>
                    </tr>

                    <c:forEach var="linha" items="${lista}">
                        <tr>
                            <td>${linha.nuArmario}</td>
                            <td>${linha.localizacao}</td>
                            <td>
                                <button class="btn">Agendar</button>
                            </td>

                        </tr>
                    </c:forEach>

                </table>

            </div>
        </div>
    </div>
    <script src="js/spaceUser.js"></script>
    <script src="https://kit.fontawesome.com/43f367141c.js"></script>
</body>

</html>