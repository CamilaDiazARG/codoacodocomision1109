<%-- 
    Document   : modificar
    Created on : 30 nov 2021, 12:07:22
    Author     : Camila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"  integrity="sha384 F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByh MI3AhiU"  crossorigin="anonymous">
        <title>Modificar Registro</title>
    </head>
    <body>
        <h1 class="text-center">Modificar Registro</h1>
        <div class=""container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosController?accion=insert"
                      method="POST">
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombres</label>
                        <input type="text" class="form-control" id="nombre"
                               name="nombre" value="" />
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellidos</label>
                        <input type="text" class="form-control" id="apellidos"
                               name="apellidos" value="" /> 
                    </div>
                     <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email"
                               name="email" value="" />
                    </div>
                     <div class="mb-3">
                        <label for="telefono" class="form-label">Teléfono</label>
                        <input type="text" class="form-control" id="telefono"
                               name="telefono" value="" />
                    </div>
                    <button type="submit" class="btn btn-primary">Agregar</button>
                    
                </form>
            </div>
        </div>
        
        
    </body>
</html>
