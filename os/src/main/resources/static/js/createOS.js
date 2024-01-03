document.addEventListener('DOMContentLoaded', function () {

	let registerButton = document.querySelector('#register-button');
	let closeConfirmationButton = document.querySelector('#close-confirmation-button');
	let closeModalButton = document.querySelector('#close-modal-button');
	let clearFields = document.querySelector('#clear-fields')


	registerButton.addEventListener('click', register);
	closeConfirmationButton.addEventListener('click', closeConfirmationModal);
	closeModalButton.addEventListener('click', closeConfirmationModal);
	clearFields.addEventListener('click', clearField)
});

function clearField() {

	document.querySelector('#code').value = ''
	document.querySelector('#type').value = ''
	document.querySelector('#description').value = ''

}

function register() {
	
	let code = document.querySelector('#code').value;
	let type = document.querySelector('#type').value;
	let description = document.querySelector('#description').value;

	let codeCapitalize = code.toUpperCase()

	let url = 'http://localhost:8089/os/insertOS'

	let data = {
		code: codeCapitalize,
		type: type,		
		description: description
	}

	

	document.querySelector('#confirmation-message').innerHTML = makeFetchPostRequest(url, data) 
	//`Codigo: ${data.code} <br/>Tipo: ${data.type} <br/>Descrição: ${data.description}`

	showConfirmationModal();
}

function showConfirmationModal() {
	let modal = document.querySelector('#confirmation-modal');
	modal.style.display = 'block';
	modal.classList.add('show');
	document.body.style.overflow = 'hidden';
}

function closeConfirmationModal() {
	let modal = document.querySelector('#confirmation-modal');
	modal.style.display = 'none';
	modal.classList.remove('show');
	document.body.style.overflow = '';
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
			return response.json(); // This returns a promise
		})
		.then(data => {
			console.log(data)
		})
		.catch(error => {
			console.error('Fetch Error:', error);
			throw error;
		});
}