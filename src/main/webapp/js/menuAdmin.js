// Mapeando elementos da DOM
const divElementMainCadeados = document.querySelector('.main-cadeados');
const divElementMain = document.querySelector('.main');
const divElementMainArmarios = document.querySelector('.main-armarios');
const divElementMainPeriodoLetivo = document.querySelector('.main-periodoLetivo');
const divElementMainMapaArmarios = document.querySelector('.main-mapaArmarios');
const btnCadeado = document.querySelector('button[id=btn-cadeados]');
const btnArmario = document.querySelector('button[id=btn-armario]');
const btnPeriodoLetivo = document.querySelector('button[id=btn-periodoLetivo]');
const btnMapaArmarios = document.querySelector('button[id=btn-mapaArmarios]');
btnCadeado.setAttribute('onclick', 'renderCadeado()');
btnArmario.setAttribute('onclick', 'renderArmario()');
btnPeriodoLetivo.setAttribute('onclick', 'renderPeriodoLetivo()');
btnMapaArmarios.setAttribute('onclick', 'renderMapaArmarios()');

// Função que renderiza o formulário para cadastro de cadeados
function renderCadeado() {
    divElementMainCadeados.style.display = 'grid';
    divElementMainCadeados.style.visibility = 'visible';

    divElementMainArmarios.style.display = 'none';
    divElementMainArmarios.style.visibility = 'hidden';


    divElementMainPeriodoLetivo.style.display = 'none';
    divElementMainPeriodoLetivo.style.visibility = 'hidden';

    divElementMainMapaArmarios.style.display = 'none';
    divElementMainMapaArmarios.style.visibility = 'hidden';

    // ajaxCadeadoListagem();
}

// function ajaxCadeadoListagem() {

//     // Ajax Pesquisa a listagem de cadeados
//     //Vai numa servelt pesquisa todos os cadeados e monta um json e constoi uma lógica que com esse json monta um table html mostrando tudo
//     $.get("suaServeletQueLista", function(responseJson) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response JSON...
//         var $table = $("<table>").appendTo($("#listagemCadeadosAjax")); // Create HTML <table> element and append it to HTML DOM element with ID "somediv".
//         $.each(responseJson, function(index, cadeado) { // Iterate over the JSON array.
//             $("<tr>").appendTo($table) // Create HTML <tr> element, set its text content with currently iterated item and append it to the <table>.
//                 .append($("<td>").text(cadeado.coCadeado)) // Create HTML <td> element, set its text content with id of currently iterated product and append it to the <tr>.
//                 .append($("<td>").text(cadeado.coSenha)); // Create HTML <td> element, set its text content with price of currently iterated product and append it to the <tr>.
//         });
//     });
// }

// Função que renderiza o formulário para cadastro de armários
function renderArmario() {
    divElementMainArmarios.style.display = 'grid';
    divElementMainArmarios.style.visibility = 'visible';

    divElementMainCadeados.style.display = 'none';
    divElementMainCadeados.style.visibility = 'hidden';

    divElementMainPeriodoLetivo.style.display = 'none';
    divElementMainPeriodoLetivo.style.visibility = 'hidden';

    divElementMainMapaArmarios.style.display = 'none';
    divElementMainMapaArmarios.style.visibility = 'hidden';
}

// Função que renderiza o formulário para cadastro de período Letivo

function renderPeriodoLetivo() {
    divElementMainPeriodoLetivo.style.display = 'grid';
    divElementMainPeriodoLetivo.style.visibility = 'visible';

    divElementMainCadeados.style.display = 'none';
    divElementMainCadeados.style.visibility = 'hidden';

    divElementMainArmarios.style.display = 'none';
    divElementMainArmarios.style.visibility = 'hidden';

    divElementMainMapaArmarios.style.display = 'none';
    divElementMainMapaArmarios.style.visibility = 'hidden';
}

// Função que renderiza o formulário para cadastro do mapa de armários

function renderMapaArmarios() {
    divElementMainMapaArmarios.style.display = 'grid';
    divElementMainMapaArmarios.style.visibility = 'visible';

    divElementMainCadeados.style.display = 'none';
    divElementMainCadeados.style.visibility = 'hidden';

    divElementMainArmarios.style.display = 'none';
    divElementMainArmarios.style.visibility = 'hidden';

    divElementMainPeriodoLetivo.style.display = 'none';
    divElementMainPeriodoLetivo.style.visibility = 'hidden';
}