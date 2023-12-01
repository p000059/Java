function showTable(obj, string) {
    let div = document.querySelector(string)
    let table = document.createElement('table')

    table.className = 'table table-striped table-bordered table-hover'
    table.appendChild(createThead(obj))
    table.appendChild(createTbody(obj))
    table.appendChild(createTfoot(obj))
    div.appendChild(table)
    return div
}

function createThead(array) {
    let thead = document.createElement('thead')
    let tr = document.createElement('tr')

    let key = returnKeyFromArray(array)

    key.forEach(element => {
        let th = document.createElement('th')
        th.innerHTML = element[0].toUpperCase() + element.substring(1)
        tr.appendChild(th)
    })

    thead.className = 'thead-dark'
    thead.appendChild(tr)
    return thead
}

function createTbody(array) {
    let tbody = document.createElement('tbody')
    array.forEach(showTbody)

    function showTbody(elements) {
        let tr = document.createElement('tr')
        for (let i in elements) {
            let td = document.createElement('td')
            td.innerHTML = elements[i]
            tr.appendChild(td)
        }
        tbody.appendChild(tr)
    }
    return tbody
}

function createTfoot(array) {
    
    let key = returnKeyFromArray(array)
    let tfoot = document.createElement('tfoot')
    let tr = document.createElement('tr')
    let td = document.createElement('td')

    td.style.textAlign = 'center'
    td.style.fontSize = '60%'
    td.colSpan = key.length
    td.className = "font-size: 14px"
    td.innerHTML = "Foot Table"

    tr.appendChild(td)
    tfoot.appendChild(tr)

    return tfoot
}

function returnKeyFromArray(array){
    let key = ''
    array.forEach(element => key = Object.keys(element))
    return key
}

function clearTable(object) {
    document.querySelector(object).innerHTML = ''
}

export { showTable, createThead, createTbody, createTfoot, returnKeyFromArray, clearTable }