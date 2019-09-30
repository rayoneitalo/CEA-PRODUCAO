<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta http-equiv="X-UA-Compatible" content="ie=edge">
            <title>Tela de Login</title>
            <script src="https://kit.fontawesome.com/43f367141c.js"></script>

            <link rel="stylesheet" href="../css/styleLoginAdmin.css">
        </head>

        <body>

            <div class="container">
                <img src="../images/logo_principal.jpg" class="rounded mx-auto d-block" alt="Logo Ceub">
                <h1>Login Administrador</h1>
                <form class="form-login" action="hello" method="post">
                    <label for="name"><i class="far fa-user"></i>Login</label>
                    <input type="text" placeholder="Entre com sua Matrícula" id="name" required="Campo Obrigatório" maxlength="11" required autocomplete="cc-name">
                    <label for="password"><i class="fas fa-unlock-alt"></i>Senha</label>
                    <input type="password" placeholder="Entre com sua Senha" id="password" required="Campo Obrigatório" maxlength="15" required autocomplete="acc-number">
                    <button class="btn" type="submit">Entrar</button>

                </form>
            </div>
        </body>

        </html>