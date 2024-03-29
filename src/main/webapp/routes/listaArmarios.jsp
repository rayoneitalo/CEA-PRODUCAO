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
                <h2>Cláusulas</h2>
                <h4>Cláusula 1ª</h4> - Este Termo de Compromisso fundamenta-se no uso dos armários por alunos da FACES/LABOCIEN, matriculados em disciplinas laboratoriais.<br>

                <h4>Cláusula 2ª</h4> – Este Termo poderá ser rescindido por qualquer uma das partes mediante aviso escrito com 10 dias de antecedência.<br>

                <h4>Cláusula 3ª</h4>- O uso dos armários obedecerá às exigências descritas nas Normas de Utilização dos armários. </p><br>

                <h4>Cláusula 4ª - Cabe ao LABOCIEN:</h4>
                a)disponibilizar chaves e/ou cadeados semestralmente para seus usuários, bem como administrar a operacionalização do uso dos mesmos; <br><br>b)minimizar os riscos e manter a biossegurança em condições adequadas aos usuários das avidades
                prácas realizadas no Labocien; <br><br>c)ﬁscalizar o uso dos armários por meio da avaliação connua e abertura dos mesmos quando se ﬁzer necessário; <br><br>d)supervisionar o cumprimento das cláusulas deste termo; <br><br>e)manter as condições
                de funcionamento e segurança dos armários.<br>
                <h4>Cláusula 5ª – Cabe ao ALUNO</h4>

                a)o aluno interessado em usar um armário deverá entregar o “Termo de Compromisso/Solicitação de Armário” preenchido e assinado na secretaria do Labocien, quando receberá o número de seu armário. Só será permitido o uso de um armário por aluno; <br><br>b)cumprir
                as cláusulas descritas neste termo; <br><br>c)o aluno será responsável pelo armário e seus pertences durante o tempo em que for usuário; <br><br>d)a troca de armário pelo usuário deverá ser comunicada à secretaria para o devido controle;
                <br><br>e)caberá ao aluno ulizar o armário com os devidos cuidados, contribuindo para sua conservação e mantendo-o sempre fechado; <br><br>f)os pertences guardados nos armários deverão ser relacionados às avidades que o aluno realiza na
                Instuição. Ex.: livros, apostilas, cadernos, pastas, agasalhos, materiais de papelaria, roupa, jalecos, capacetes. Solicitamos que não armazenem alimentos perecíveis por mais de 24h. <br><br>g)responsabilizar-se por perda das chaves e
                cadeados. Em caso de perda, o aluno deverá comunicar a secretaria do Labocien para as devidas providências; <br><br>h)preservar as condições sicas dos armários; <br><br>i)devolver as chaves e/ou cadeados no período determinado pelo LABOCIEN
                (semestre regular); <br><br>j)não colar equetas;<br><br> k)não trocar de cadeado. <br>

                <h4>Cláusula 6ª - Constituem-se motivos para a rescisão deste Termo de Compromisso:</h4>
                a)guardar objetos que coloquem em risco as pessoas e o espaço; <br><br>b)guardar objetos considerados ilegais, bebidas alcoólicas, animais vivos; <br><br>c)trancamento da matrícula; <br><br>d)não cumprimento de cláusula deste Termo; <br><br>e)não
                realizar os cuidados especíﬁcos com os materiais perecíveis acondicionadas nos armários. <br><br><br>E, por estarem inteiramente de acordo com as cláusulas aqui estipuladas, firmam este Termo de Compromisso para Uso do Armário.

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