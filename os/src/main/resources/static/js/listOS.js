const url = 'http://localhost:8089/os/readallOS'


const fetchAPI = fetch(url)
	.then((res) => res.json())
	.then((data) => {
		console.log(data)
		return data
	})


let listOS = document.querySelector('#list-os')

listOS.addEventListener('click', async (event) => {

	event.preventDefault()
	const result = await fetchAPI
	document.querySelector('#result').innerHTML = `${JSON.stringify(result, undefined)}`

})
