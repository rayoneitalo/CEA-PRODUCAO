// Declaração das variáveis referentes aos elementos HTML
let divElement = document.querySelector('div.container');
let h1Element = document.querySelector('div.container h1');
let imgElement = document.querySelector('div.container img');

// Função que aplica as propriedades CSS quando carregada a página

window.onload = function efect() {
    divElement.style.visibility = "visible";
    divElement.style.left = "50%";
    divElement.style.top = "50%";
    h1Element.style.opacity = "1";
    imgElement.style.opacity = "1";

}