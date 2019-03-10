<%-- 
    Document   : index
    Created on : 09-mar-2019, 17:00:45
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
        <h1><br>Registro de Usuario<br><br></h1>
        <form action = "formulario.jsp" method = "post">
         <br>Nombre: <input type = "text" name = "nombre_i">
         <br><br>
         Correo electronico: <input type = "email" name = "correo_i" />
         <br><br>
         Contraseña <input type = "password" name = "contra_i" />
         <br><br>
         Fecha de Nacimiento: <input type="text" name="nacimiento_i" placeholder="día/mes/año">
         <br><br>
         <input type = "submit" value = "Enviar" /><br><br>
      </form>
    </body>
</html>
