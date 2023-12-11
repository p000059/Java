let execute = document.querySelector('#execute')
execute.addEventListener('click', (event) => registerPart(event))

let clear = document.querySelector('#clear')
clear.addEventListener('click', (event) => clearFields(event))

let modalElement = document.getElementById('modal_confirm')
let btnModalConfirm = domElementId('button_modal_confirm')

btnModalConfirm.addEventListener("click", function(event) {
	let modal = new bootstrap.Modal(modalElement, {
		keyboard: false
	});

	modal.show();
})

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

function registerPart(event) {

	event.preventDefault()
	event.stopPropagation()

	clearFields()

	let code = document.querySelector('#code').value
	let name = document.querySelector('#name').value
	let description = document.querySelector('#description').value
	let value = document.querySelector('#value').value

	let codeCapitalize = code[0].toUpperCase() + code.substring(1)
	let nameCapitalize = name[0].toUpperCase() + name.substring(1)
	let descriptionLowerCase = description.toLowerCase()

	let url = '../insertpart';

	let data = {
		code: codeCapitalize,
		name: nameCapitalize,
		description: descriptionLowerCase,
		value: value
	};

	makeFetchPostRequest(url, data)

	createLabel(document.querySelector('#result').innerHTML = data)

}

function clearFields() {

	document.querySelector('#code').innerHTML = ''
	document.querySelector('#name').innerHTML = ''
	document.querySelector('#description').innerHTML = ''
	document.querySelector('#value').innerHTML = ''
}

function createLabel(object) {
	let label = document.createElement('label')
	label.className = 'labels'
	label.textContent = object
	return label
}

function makeFetchPostRequest(url, data) {

	fetch(url, {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(data)
	})
		.then(response => {
			if (!response.ok) {
				throw new Error('Network response was not ok');
			}
			return response.json();
		})
		.then(data => {

			console.log(data);
		})
		.catch(error => {

			console.error('Fetch Error:', error);
		});
}
