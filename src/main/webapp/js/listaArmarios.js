// Referenciando os elementos da DOM
const divElementContainer = document.querySelector('.container');
const divElementContentContainer = document.querySelector('.content-container');
const btnElement = document.querySelector('button[class=btn]');
const btnCommitmentTermAccept = document.querySelector('#btn-commitmentTermAccept');
const btnCommitmentTermRefuse = document.querySelector('#btn-commitmentTermRefuse');



btnCommitmentTermAccept.addEventListener('click', function() {
    alert('aceito');
});
btnCommitmentTermRefuse.addEventListener('click', function() {
    divElementContainer.style.display = 'grid';
    divElementContentContainer.style.visibility = "hidden";
});


function renderbtnCommitmentTerm() {
    divElementContainer.style.display = 'none';
    divElementContentContainer.style.visibility = "visible";
}
// btnElement.addEventListener('click', function() {
//     divElementContainer.style.display = 'none';
//     divElementContentContainer.style.visibility = "visible";
// })