
// const nombres = []
/*
const nombres = ["Cami","La Cami","Benito","El beni","Gizmo","El Gizmo"]
nombres.push("Lo Gato")
console.log(nombres)
nombres.push("")
console.log(nombres)

const manejodeNombres=(a)=>{
    nombres.push(a)
    console.log(nombres)
};
*/

/*Objetos

const agregarNombres=()=>{
    nombre={
        nombre:"Benito",
        apellido: "Cerati Diaz"
    };
    nombres.push(nombre)
    console.log(nombres)
}
const nomb=()=>{
    nombre = { 
        nombre: "Gizmo",
        apellido: "Modo Diaz"
    };
    console.log(nombre)
}

agregarNombres()
nomb()

*/

class Persona{   
    constructor(nombre,apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    mostrarNombre(){
        return this.nombre;
        

    }
}
let nombre = prompt("Escribe tu nombre")
let persona1 = new Persona(nombre,"Diaz")
let persona2 = new Persona("Nombre","Apellido") 

let persona3={
    nombre:"Pedro",
    apellido:"Mansilla"
}
console.log(persona1.mostrarNombre())
console.log(persona2.mostrarNombre())

class Vehiculo{ 
    encender(){ //metodo
        return "el auto está tranqui 120" //función
    }
}

let auto= new Vehiculo(); //new agregar la nueva clase instaciar al metodo
auto.velocidad = 150; //propiedad

let moto={
    encender:()=>{
        return "Vení subite a mi gilera"
    }
}

console.log(auto.encender())
console.log(auto.velocidad)
console.log(moto.encender())
