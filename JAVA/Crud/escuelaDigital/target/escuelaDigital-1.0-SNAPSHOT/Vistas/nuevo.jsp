<%-- 
    Document   : nuevo
    Created on : 30 nov 2021, 12:07:36
    Author     : Camila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Agregar Alumno</title>
        
    </head>
    <body>
        
        <h1 class="text-center mt-4 mb-2">Agregar Alumno</h1>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-4 w-50" action="AlumnosController?accion=insert" method="POST">
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombres</label>
                        <input type="text" class="form-control" id="nombre" name="nombre"/>
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellidos</label>
                        <input type="text" class="form-control" id="apellido" name="apellido"/> 
                    </div>
                     <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" name="email"/>
                    </div>
                     <div class="mb-3">
                        <label for="telefono" class="form-label">Teléfono</label>
                        <input type="text" class="form-control" id="telefono" name="telefono"/>
                    </div>
                    <div class="d-grid gap-2">
                    <button type="submit" class="btn btn-secondary">Agregar</button>
                    </div>
                    
                </form>
            </div>
        </div>
    </body>
</html>
