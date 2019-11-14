<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../../css/spaceUser.css">
    <title>Espaço Aluno</title>
    <script>
        function submitForm(btn) {

            const id = btn.id;
            switch (id) {
                case "btn-cod1":
                    document.getElementById('id').value = "btnBl1";
                    break;
                case "btn-cod2":
                    document.getElementById('id').value = "btnBl2";
                    break;
                case "btn-cod3":
                    document.getElementById('id').value = "btnBl3";
                    break;
                case "btn-cod4":
                    document.getElementById('id').value = "btnBl4";
                    break;
                case "btn-cod5":
                    document.getElementById('id').value = "btnBl5";
                    break;
                default:
                    console.log('Não foi possível identificar o valor do ID');
            }
        }
    </script>
</head>

<body>
    <div class="container">
        <div class="header">
            <img src="../../images/logo_principal.jpg" alt="logo ceub">
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
            <div class="options">
                <h3>Selecione o bloco </h3>
                <div class="btns">
                    <form action="../../manager" method="POST">
                        <button class="btn-blocks" id="btn-cod1" onclick="submitForm(this)">Bloco 1</button>
                        <button class="btn-blocks" id="btn-cod2" onclick="submitForm(this)">Bloco 2</button>
                        <button class="btn-blocks" id="btn-cod3" onclick="submitForm(this)">Bloco 3</button>
                        <button class="btn-blocks" id="btn-cod4" onclick="submitForm(this)">Bloco 4</button>
                        <button class="btn-blocks" id="btn-cod5" onclick="submitForm(this)">Bloco 5</button>
                        <input name="id" type="hidden" id="id">
                    </form>
                </div>
            </div>

        </div>
    </div>
    <script src="../../js/spaceUser.js"></script>
    <script src="https://kit.fontawesome.com/43f367141c.js"></script>
</body>

</html>