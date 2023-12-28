let execute = document.querySelector('#execute')
execute.addEventListener('click', (event) => registerPart(event))

let clear = document.querySelector('#clear-fields')
clear.addEventListener('click', (event) => clearFields(event))

function registerPart(event) {

	event.preventDefault()
	event.stopPropagation()
	
	let code = ""
	let name = ""
	let description = ""
	let value = 0

	code = document.querySelector('#code').value
	name = document.querySelector('#name').value
	description = document.querySelector('#description').value
	value = document.querySelector('#value').value

	let codeCapitalize = code.toUpperCase()
	
	let url = '../insertpart';

	let data = {
		code: codeCapitalize,
		name: name,
		description: description,
		value: value
	};

	makeFetchPostRequest(url, data)

	createLabel(document.querySelector('#result').innerHTML = data)
	closeModal()

}

function clearFields() {

	document.querySelector('#code').value = ''
	document.querySelector('#name').value = ''
	document.querySelector('#description').value = ''
	document.querySelector('#value').value = ''
}

function createLabel(object) {
	let label = document.createElement('label')
	label.className = 'labels'
	label.textContent = object
	return label
}

function closeModal() {
	
	let modal = document.querySelector('#modal-confirm')
	modal.style.display = 'none'	
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
