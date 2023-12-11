
let modalElement = document.querySelector('#confirm');
let btnModalConfirm = domElementId('button_modal_confirm');

btnModalConfirm.addEventListener("click", function(event) {
	let modal = new bootstrap.Modal(modalElement, {
		keyboard: false
	});

	modal.show();
});

modalElement.addEventListener('show.bs.modal', function(event) {
	let modalConfirmBody = domElementId('modal_confirm_body');
	modalConfirmBody.innerHTML = 'Confirme no botão abaixo que você deseja excluir este registro';

	let divButtons = domElementId('div_actions'); //document.getElementById('div_actions');
	let buttons = divButtons.getElementsByTagName('BUTTON');

	// if(domElementId('button_modal_confirm')){}
	if (buttons[0]) {
		buttons[0].addEventListener("click", function(event) {
			modalConfirmBody.innerHTML = 'Você clicou no botão de exclusão';
		});
	}

	// Caso exista mais de uma ação. Podemos capturar cada ação com base no atributo data-action.
	/*
	Array.from(buttons).forEach((item, i) => {
	item.addEventListener("click", function(event) {
	//action
	let action = this.getAttribute('data-action');
	console.log(action);
	});
	});
	*/


});

/*
 Você poderia trabalhar com callback
 confirm(true); ou confirm(false);
 
modalConfirm(function(confirm) {
 if (confirm) {
 // sua ação para salvar...
 } else {
 
 // sua ação para não salvar/fechar a modal
 }
 });
*/

function domElementId(id) {
	return document.getElementById(id)
}