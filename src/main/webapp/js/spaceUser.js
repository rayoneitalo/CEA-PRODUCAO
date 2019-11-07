// Referenciando os elementos da DOM
let divElementContainer = document.querySelector('.container');
let divElementMap = document.querySelector('.map');
let btnMenuElement = document.querySelector('button[id=btn-menu]');

let btnCodCabinet1 = document.querySelector('button[id=btn-cod1]');
let btnCodCabinet2 = document.querySelector('button[id=btn-cod2]');
let btnCodCabinet3 = document.querySelector('button[id=btn-cod3]');
let btnCodCabinet4 = document.querySelector('button[id=btn-cod4]');
let btnCodCabinet5 = document.querySelector('button[id=btn-cod5]');
let btnCodCabinet6 = document.querySelector('button[id=btn-cod6]');
let btnCodCabinet7 = document.querySelector('button[id=btn-cod7]');

let divElementCodCabinets1 = document.querySelector('div[id=cod1]');
let divElementCodCabinets2 = document.querySelector('div[id=cod2]');
let divElementCodCabinets3 = document.querySelector('div[id=cod3]');
let divElementCodCabinets4 = document.querySelector('div[id=cod4]');
let divElementCodCabinets5 = document.querySelector('div[id=cod5]');
let divElementCodCabinets6 = document.querySelector('div[id=cod6]');
let divElementCodCabinets7 = document.querySelector('div[id=cod7]');


// Chama a função que renderiza a div map
btnMenuElement.onclick = rederDivMap;

// Chama as funções que renderizam as divs Cabinets
// btnCodCabinet1.onclick = cabinets1;
// btnCodCabinet2.onclick = cabinets2;
// btnCodCabinet3.onclick = cabinets3;
// btnCodCabinet4.onclick = cabinets4;
// btnCodCabinet5.onclick = cabinets5;
// btnCodCabinet6.onclick = cabinets6;
// btnCodCabinet7.onclick = cabinets7;

// Função que renderiza a div map
// TODO Essa função não está terminada
function rederDivMap() {
    divElementMap.style.display = "grid";
    divElementMap.style.visibility = "visible";
}

// Função que renderiza a divCabinet1
function cabinets1() {
    divElementCodCabinets1.style.display = "grid";
    divElementCodCabinets1.style.visibility = "visible";

    divElementCodCabinets2.style.display = "none";
    divElementCodCabinets2.style.visibility = "hidden";

    divElementCodCabinets3.style.display = "none";
    divElementCodCabinets3.style.visibility = "hidden";

    divElementCodCabinets4.style.display = "none";
    divElementCodCabinets4.style.visibility = "hidden";

    divElementCodCabinets5.style.display = "none";
    divElementCodCabinets5.style.visibility = "hidden";

    divElementCodCabinets6.style.display = "none";
    divElementCodCabinets6.style.visibility = "hidden";

    divElementCodCabinets7.style.display = "none";
    divElementCodCabinets7.style.visibility = "hidden";
}

// Função que renderiza a divCabinet2
function cabinets2() {
    divElementCodCabinets1.style.display = "none";
    divElementCodCabinets1.style.visibility = "hidden";

    divElementCodCabinets2.style.display = "grid";
    divElementCodCabinets2.style.visibility = "visible";

    divElementCodCabinets3.style.display = "none";
    divElementCodCabinets3.style.visibility = "hidden";

    divElementCodCabinets4.style.display = "none";
    divElementCodCabinets4.style.visibility = "hidden";

    divElementCodCabinets5.style.display = "none";
    divElementCodCabinets5.style.visibility = "hidden";

    divElementCodCabinets6.style.display = "none";
    divElementCodCabinets6.style.visibility = "hidden";

    divElementCodCabinets7.style.display = "none";
    divElementCodCabinets7.style.visibility = "hidden";



}
// Função que renderiza a divCabinet3
function cabinets3() {
    divElementCodCabinets1.style.display = "none";
    divElementCodCabinets1.style.visibility = "hidden";

    divElementCodCabinets2.style.display = "none";
    divElementCodCabinets2.style.visibility = "hidden";

    divElementCodCabinets3.style.display = "grid";
    divElementCodCabinets3.style.visibility = "visible";

    divElementCodCabinets4.style.display = "none";
    divElementCodCabinets4.style.visibility = "hidden";

    divElementCodCabinets5.style.display = "none";
    divElementCodCabinets5.style.visibility = "hidden";

    divElementCodCabinets6.style.display = "none";
    divElementCodCabinets6.style.visibility = "hidden";

    divElementCodCabinets7.style.display = "none";
    divElementCodCabinets7.style.visibility = "hidden";


}
// Função que renderiza a divCabinet4

function cabinets4() {
    divElementCodCabinets1.style.display = "none";
    divElementCodCabinets1.style.visibility = "hidden";

    divElementCodCabinets2.style.display = "none";
    divElementCodCabinets2.style.visibility = "hidden";

    divElementCodCabinets3.style.display = "none";
    divElementCodCabinets3.style.visibility = "hidden";

    divElementCodCabinets4.style.display = "grid";
    divElementCodCabinets4.style.visibility = "visible";

    divElementCodCabinets5.style.display = "none";
    divElementCodCabinets5.style.visibility = "hidden";

    divElementCodCabinets6.style.display = "none";
    divElementCodCabinets6.style.visibility = "hidden";

    divElementCodCabinets7.style.display = "none";
    divElementCodCabinets7.style.visibility = "hidden";

}
// Função que renderiza a divCabinet5

function cabinets5() {
    divElementCodCabinets1.style.display = "none";
    divElementCodCabinets1.style.visibility = "hidden";

    divElementCodCabinets2.style.display = "none";
    divElementCodCabinets2.style.visibility = "hidden";

    divElementCodCabinets3.style.display = "none";
    divElementCodCabinets3.style.visibility = "hidden";

    divElementCodCabinets4.style.display = "none";
    divElementCodCabinets4.style.visibility = "hidden";

    divElementCodCabinets5.style.display = "grid";
    divElementCodCabinets5.style.visibility = "visible";

    divElementCodCabinets6.style.display = "none";
    divElementCodCabinets6.style.visibility = "hidden";

    divElementCodCabinets7.style.display = "none";
    divElementCodCabinets7.style.visibility = "hidden";
}
// Função que renderiza a divCabinet6

// function cabinets6() {
//     divElementCodCabinets1.style.display = "none";
//     divElementCodCabinets1.style.visibility = "hidden";

//     divElementCodCabinets2.style.display = "none";
//     divElementCodCabinets2.style.visibility = "hidden";

//     divElementCodCabinets3.style.display = "none";
//     divElementCodCabinets3.style.visibility = "hidden";

//     divElementCodCabinets4.style.display = "none";
//     divElementCodCabinets4.style.visibility = "hidden";

//     divElementCodCabinets5.style.display = "none";
//     divElementCodCabinets5.style.visibility = "hidden";

//     divElementCodCabinets6.style.display = "grid";
//     divElementCodCabinets6.style.visibility = "visible";

//     divElementCodCabinets7.style.display = "none";
//     divElementCodCabinets7.style.visibility = "hidden";


// }
// // Função que renderiza a divCabinet7

// function cabinets7() {
//     divElementCodCabinets1.style.display = "none";
//     divElementCodCabinets1.style.visibility = "hidden";

//     divElementCodCabinets2.style.display = "none";
//     divElementCodCabinets2.style.visibility = "hidden";

//     divElementCodCabinets3.style.display = "none";
//     divElementCodCabinets3.style.visibility = "hidden";

//     divElementCodCabinets4.style.display = "none";
//     divElementCodCabinets4.style.visibility = "hidden";

//     divElementCodCabinets5.style.display = "none";
//     divElementCodCabinets5.style.visibility = "hidden";

//     divElementCodCabinets6.style.display = "none";
//     divElementCodCabinets6.style.visibility = "hidden";

//     divElementCodCabinets7.style.display = "grid";
//     divElementCodCabinets7.style.visibility = "visible";


// }



// !Função que determina qual divCabinet irá ser renderizada
// !Inacabada
// function rederCabits() {
//     var option;

//     switch (option) {
//         case option == 'cod1':
//             function cabinets1() {
//                 divElementCodCabinets1.style.display = "flex";
//                 divElementCodCabinets1.style.visibility = "visible";
//                 option = 'cod1';
//             }
//             break;

//         case option == 'cod2':
//             function cabinets2() {
//                 divElementCodCabinets2.style.display = "flex";
//                 divElementCodCabinets2.style.visibility = "visible";
//                 option = 'cod2';
//             }
//             break;

//         case option == 'cod3':
//             function cabinets3() {
//                 divElementCodCabinets3.style.display = "flex";
//                 divElementCodCabinets3.style.visibility = "visible";
//                 option = 'cod3';
//             }
//     }
// }