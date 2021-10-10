let elemento = document.getElementById("principal"); //capturamos el div del dom

//addEventListener('click') mismo evento onclick en html
//let btn = document.getElementById("btn"); capturamos el botón
//usamos el evento load renderizamos el formulario

window.addEventListener('load',function(){
    elemento.innerHTML=`
    <form>
    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Email address</label>
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
      <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Password</label>
      <input type="password" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="mb-3 form-check">
      <input type="checkbox" class="form-check-input" id="exampleCheck1">
      <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button type="button" id="btn" onclick="entrar()" class="btn btn-primary">Enviar</button>
  </form>
  `;

});

let usuarios = ["luis","Fede",40];

let usuario = {
    name: "Cami",
    email:"cami@cami.com",
    pass:"1234",
    validar: (e,p)=>{
        if(e === usuario.email && p === usuario.pass) {
            return true;
        }else{
            return false;
        }
    }

};

function entrar() {
    let email = document.getElementById("exampleInputEmail1").value;
    let pass = document.getElementById("exampleInputPassword1").value;

    let entra = usuario.validar(email,pass);
    if(entra) {
        elemento.innerHTML=`
        <h1>Administración</h1>
        <p>Bienvenide ${usuario.name} </p>
        `;
    }
}



