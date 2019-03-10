<%-- 
    Document   : formulario
    Created on : 09-mar-2019, 17:18:02
    Author     : PERSONAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="css" href="estilos.css"/>
        <title>Formulario</title>
    </head>
    <body>
        <h1>Registro de Usuario</h1>
        <div>
        <%!
            String nombre="";
            String correo="";
            String nacimiento="";
        %>
        <%
           nombre=request.getParameter("nombre_i");
           correo=request.getParameter("correo_i");
           nacimiento=request.getParameter("nacimiento_i");
    
           out.print("<br><br>");
           out.print("Nombre: "+nombre);
           out.print("<br><br>");
           out.print("Correo electrónico: "+correo);
           out.print("<br><br>");
           out.print("Fecha de Nacimiento: "+nacimiento);
           out.print("<br><br>");
        %>
        </div>
    </body>
</html>
