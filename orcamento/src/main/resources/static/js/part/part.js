let execute = document.querySelector('#execute')
execute.addEventListener('click', (event) => registerPart(event))

let clear = document.querySelector('#clear')
clear.addEventListener('click', (event) => clearFields(event))

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
