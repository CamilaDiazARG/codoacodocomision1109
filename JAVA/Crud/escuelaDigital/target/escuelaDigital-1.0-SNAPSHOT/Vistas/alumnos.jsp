<%-- 
    Document   : alumnos
    Created on : 30 nov 2021, 12:06:58
    Author     : Camila
--%>

<%@page import="modelo.AlumnosDAO"%>
<%@page import="modelo.Alumnos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Listado de Alumnos</title>
    </head>
    <body>
        <h1 class="text-center m-4">Listado de Alumnos</h1>
        <div class="container">
            <div class="row">
               <a class="btn btn-dark col-md-4 mt-4 mb-4"
                href="AlumnosController?accion=nuevo">Agregar alumno</a> 
                <table class="table table-secondary">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombres</th>
                            <th>Apellidos</th>
                            <th>Email</th>
                            <th>Teléfono</th>
                            <th>Modificar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                           List<Alumnos> resultado = null;
                           AlumnosDAO alumno =new AlumnosDAO();
                           resultado = alumno.listarAlumnos();
                           for(int i=0; i < resultado.size(); i++){
                               String ruta ="AlumnosController?accion=modificar&id=" +resultado.get(i).getId();
                               String rutaE ="AlumnosController?accion=eliminar&id=" +resultado.get(i).getId();
                        %>
                        <tr> 
                            <td> <%=resultado.get(i).getId() %> </td>
                            <td> <%=resultado.get(i).getNombres() %> </td>
                            <td> <%=resultado.get(i).getApellidos() %> </td>
                            <td> <%=resultado.get(i).getEmail() %> </td>
                            <td> <%=resultado.get(i).getTelefono() %> </td>
                            <td> <a type="button" class="btn btn-outline-secondary" href="<%=ruta%>">Modificar</a> </td>
                            <td> <a type="button"  class="btn btn-danger" href=<%=rutaE%>>X</a> </td>
                        </tr>
                   
                       <% 
                           }
                        %>
                    </tbody>
                </table>
                    
            </div>
        </div>
    </body>
</html>
