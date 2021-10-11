let elemento = document.querySelector("#principal");

//Arreglos, almacena datos

let mascotas = [];
//Asignando valores, posiciones o indices
// mascotas[0] = "Perro";
// mascotas[1] = "Gato";

const agregarMascota=()=>{
    let datos = document.querySelectorAll("input");

    console.log(datos[6].checked);
    let consulta="";
    if(datos[6].checked) {
        consulta= "urgencia";
    }else{
        consulta= "consulta";
    };

    
    mascota= {
        propietario: datos[0].value,
        nombre: datos[1].value,
        raza: datos[2].value,
        edad: datos[3].value,
        peso: datos[4].value,
        img: datos[5].value,
        consulta:consulta
    };
    mascotas.push(mascota);

};
const mostrarMascotas=()=>{ 
    for (let a = 0; a < mascotas.length; a++) {
        elemento.innerHTML+= `
        <h2> ${a} ${mascotas[a]} </h2>`;
    }
};

//emas5 funcion mostrarMascotas (){}

const CrearFormulario=()=>{
    elemento.innerHTML=`
    <form>
  <div class="mb-3">
    <label for="prop" class="form-label">Propietario</label>
    <input type="text" class="form-control" id="prop">
  </div>
  <div class="mb-3">
    <label for="nombre" class="form-label">Nombre:</label>
    <input type="text" class="form-control" id="nombre">
  </div>
  <div class="mb-3">
    <label for="raza" class="form-label">Raza:</label>
    <input type="text" class="form-control" id="raza">
  </div>
  <div class="mb-3">
    <label for="edad" class="form-label">Edad:</label>
    <input type="number" class="form-control" id="edad">
  </div>
  <div class="mb-3">
    <label for="peso" class="form-label">Peso:</label>
    <input type="number" class="form-control" id="peso">
  </div>
  <div class="mb-3">
    <label for="img" class="form-label">Imagen</label>
    <input type="text" class="form-control" id="img">
  </div>
  <div class="mb-3 form-check">
  <input type="radio" class="form-check-input" name="urgencia">
  <label class="form-check-label" for="urgencia">Urgencia</label>
  </div>
  <div class="mb-3 form-check">
  <input type="radio" class="form-check-input" name="consulta">
  <label class="form-check-label" for="consulta">Consulta</label>
  </div>

  <button type="button" class="btn btn-primary" id="btn">Agergar Datos</button>
    </form>
    `;
    document.getElementById("btn").addEventListener('click',agregarMascota);
};

CrearFormulario();


//{propietario,nombre,raza,edad,peso,imagen,tipoConsulta}
