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
    <link rel="stylesheet" href="css/listaArmarios.css">
    <link rel="stylesheet" href="css/termoCompromisso.css"> 

    <title>Espaço Aluno</title>

</head>

<body>

    <div class=" container ">
        <div class="header ">
            <img src="images/logo_principal.jpg " alt="logo ceub ">
            <i class="fas fa-user "><h3>Nome do Aluno</h3></i>

        </div>
        <div class="menu">
            <ul>
                <li>
                    <button class="btn-menu " type="submit "><i class="fas fa-home "><span class="text-menu "><a href="http://localhost:8080/CEA/views/user/espacoAluno.jsp ">Home</a></span></i></button>
                </li>
                <li>
                    <button class="btn-menu "><i class="fas fa-desktop "><span class="text-menu ">Auto Atendimento</span></i></button>
                </li>
            </ul>
        </div>

        <div class="map ">
            <div class="map-cabinets">
                <h1>Lista de Armários disponíveis</h1>

                <table class="table">
                    <tr>
                        <th>Numero</th>
                        <th>Bloco</th>
                        <th>Localização</th>
                        <th>Opções</th>
                    </tr>

                    <c:forEach var="linha" items="${lista}">
                        <tr>
                            <td>${linha.nuArmario}</td>
                            <td>${linha.bloco}</td>
                            <td>${linha.localizacao}</td>
                            <td>
                                <button class="btn" onclick="renderbtnCommitmentTerm()">Agendar</button>
                            </td>

                        </tr>
                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

    <div class="content-container">
        <h2>Termo de compromisso</h2>
        <div class="content-header">
            <img src="images/logo_principal.jpg" alt="">
            <h3>Nº PROTOCOLO: XXX</h3>
        </div>
        <div class="content-information">
            <div class="information-groups">
                <h3>Dados Aluno</h3>

                <h5>Nome:</h5>

                <h5>RA:</h5>

                <h5>Curso:</h5>
            </div>
            <div class="information-groups">
                <h3>Dados do Armário</h3>
                <h5>Numero:</h5>
                <h5>Localização:</h5>
                <h5>Data de devolução:</h5>
            </div>

        </div>
        <div class="content-aside">
            <section class="body">
                <h3>Cláusulas</h3>
                <p>O vídeo fornece uma maneira poderosa de ajudá-lo a provar seu argumento. Ao clicar em Vídeo Online, você pode colar o código de inserção do vídeo que deseja adicionar. Você também pode digitar uma palavra-chave para pesquisar online o
                    vídeo mais adequado ao seu documento. Para dar ao documento uma aparência profissional, o Word fornece designs de cabeçalho, rodapé, folha de rosto e caixa de texto que se complementam entre si. Por exemplo, você pode adicionar uma
                    folha de rosto, um cabeçalho e uma barra lateral correspondentes.</p>
                <p>Clique em Inserir e escolha os elementos desejados nas diferentes galerias. Temas e estilos também ajudam a manter seu documento coordenado. Quando você clica em Design e escolhe um novo tema, as imagens, gráficos e elementos gráficos
                    SmartArt são alterados para corresponder ao novo tema. Quando você aplica estilos, os títulos são alterados para coincidir com o novo tema. Economize tempo no Word com novos botões que são mostrados no local em que você precisa deles.
                </p>
                <p>Para alterar a maneira como uma imagem se ajusta ao seu documento, clique nela e um botão de opções de layout será exibido ao lado. Ao trabalhar em uma tabela, clique no local onde deseja adicionar uma linha ou uma coluna e clique no sinal
                    de adição. A leitura também é mais fácil no novo modo de exibição de Leitura. Você pode recolher partes do documento e colocar o foco no texto desejado. Se for preciso interromper a leitura antes de chegar ao fim dela, o Word lembrará
                    em que ponto você parou - até mesmo em outro dispositivo.</p>
            </section>
            <section class="footer">
                <button class="btn-commitmentTerm" id="btn-commitmentTermAccept">Aceitar</button>
                <button class="btn-commitmentTerm" id="btn-commitmentTermRefuse">Recusar</button>
            </section>
        </div>

    </div>


    <script src="js/listaArmarios.js "></script>
    <script src="https://kit.fontawesome.com/43f367141c.js "></script>
</body>

</html>