function addZero(numero){
    if (numero <= 9) 
        return "0" + numero;
    else
        return numero; 
}

(function(){
    let date = new Date()
    let small = (addZero(date.getDate().toString()) + "/" + (addZero(date.getMonth()+1).toString()) + "/" + date.getFullYear());
    document.querySelector('#year').innerHTML = `ZETEC - ${small}`
})()
