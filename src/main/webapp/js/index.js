// Declaração das variáveis referentes aos elementos HTML
const divElementOptions = document.querySelector('div.options');
const formElementAluno = document.querySelector('.form-login-aluno');
const formElementAdmin = document.querySelector('.form-login-admin');
const divElement = document.querySelector('div.container');
const h1Element = document.querySelector('div.container h1');
const imgElement = document.querySelector('div.container img');
const btnElementAluno = document.querySelector('button[id=btn-aluno]');
const btnElementAdmin = document.querySelector('button[id=btn-admin]');


btnElementAluno.setAttribute('onclick', 'renderFormAluno()');
btnElementAdmin.setAttribute('onclick', 'renderFormAdmin()');

// Função que aplica as propriedades CSS quando carregada a página

window.onload = function efect() {
    divElement.style.visibility = "visible";
    divElement.style.left = "50%";
    divElement.style.top = "50%";
    h1Element.style.opacity = "1";
    imgElement.style.opacity = "1";
    divElementOptions.style.opacity = "1";
}


// Função que renderiza o login para aluno

function renderFormAluno() {
    formElementAluno.style.display = 'grid'
    formElementAluno.style.visibility = 'visible';

    formElementAdmin.style.display = 'none';
    formElementAdmin.style.visibility = 'hidden';
}

function renderFormAdmin() {
    formElementAdmin.style.display = 'grid';
    formElementAdmin.style.visibility = 'visible';

    formElementAluno.style.display = 'none'
    formElementAluno.style.visibility = 'hidden';
}