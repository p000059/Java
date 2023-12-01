function clearFields(event) {
    event.preventDefault()
    event.stopPropagation()
    document.querySelector('#number').value = ''
    document.querySelector('#result').innerHTML = ''
}

export { clearFields }