<%-- 
    Document   : index
    Created on : 9 dic 2021, 12:06:15
    Author     : Camila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"/>
        <title>Inicio</title>
    </head>
    <body>
        <h1 class="text-center mt-5 mb-2">Bienvenid@s a Escuela Digital!</h1>
         <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosController?accion=ingresar" method="POST">
                    <div class="mb-3">
                        <h5 class="pb-3" >Iniciar sesión:</h5>
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" name="email" placeholder="Correo electrónico, usuario" />
                    </div>
                    <div class="mb-3">
                        <label for="pass" class="form-label">Clave</label>
                        <input type="password" class="form-control" id="pass" name="pass" placeholder="*******"/>
                    </div>
                    <div class="d-grid gap-2">
                    <button type="submit" class="btn btn-danger">Ingresar</button>
                    </div>
                </form>
 
            </div>
        </div>
    </body>
</html>
