alert("yvan eht nioj!") /*Ventana emergente, funciona nativa del ordenador*/
console.log("Estamos en la consola") 

let nombre = "La cami"; /*variable: tipo string, usa espacio cunado utiliza la variable*/
var numero= 10; /*tipo numerica, ocupa espacio en la memoria*/
const PI = 3.1416; /*contantes, no cambia de valor*/
let hayClases=true; 
console.log((numero+25)+" "+nombre)/*+ concatenar y sumar*/
console.log(hayClases)
console.log(5 > 3)
let esFeriado=false;

/*Condicionales*/
if(8 >= 8 ) { /*si es verdadera se ejecuta*/
    console.log("Es correcto!")
}else{ /*si es falso*/
    console.log('No es correcto!')
}
console.log((5 > 3) ? "Es correcto 5 > 3": "No es correcto"); /*terminario*/

if((hayClases == true) && esFeriado != true){/*== cuando compara 2 valores para que sea true se tienen que cumplir ambas condiciones*/
    console.log('Me conecto a la videollamada')
}else{
    console.log('No me conecto a la videollamada')
}
if(25<32 || 11>20){/*se cumple una de las 2 condiciones*/
    console.log('Se cumplio la condicion')
}

let saludo = "Hola, como estas?"
let saludar = saludo + nombre;

let elemento = document.getElementById("principal");
/*console.log(elemento)*/
elemento.innerHTML="<h1>" + saludar + "</h1>"
document.write("<h1 class='text-center bg-info'>"+saludar+"</h1>");