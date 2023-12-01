
fetch('/JavaScript/Module/js/json/string.json')
  .then(response => response.json())
  .then(data => receiveObject(data, '#strings'))
  .catch(error => console.error(error));

fetch('/JavaScript/Module/js/json/numbers.json')
  .then(response => response.json())
  .then(data => receiveObject(data, '#numbers'))
  .catch(error => console.error(error))

fetch('/JavaScript/Module/js/json/arrays.json')
  .then(response => response.json())
  .then(data => receiveObject(data, '#arrays'))
  .catch(error => console.error(error))

fetch('/JavaScript/Module/js/json/basicHTML.json')
  .then(response => response.json())
  .then(data => receiveObject(data, '#basic-html'))
  .catch(error => console.error(error))

fetch('/JavaScript/Module/js/json/ObjectAJAX.json')
  .then(response => response.json())
  .then(data => receiveObject(data, '#object-ajax'))
  .catch(error => console.error(error))

fetch('/JavaScript/Module/js/json/table.json')
  .then(response => response.json())
  .then(data => receiveObject(data, '#tables'))
  .catch(error => console.error(error))

function receiveObject(json, id) {
  let objects = document.querySelector(id)

  json.forEach(element => {
    let a = document.createElement('a')
    a.className = element.class
    a.href = element.href
    a.target = element.target
    a.innerHTML = element.name
    objects.appendChild(a)
  })
}