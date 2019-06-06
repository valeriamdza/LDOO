<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div>
            <form action="/LoginController/addUser" method="post">
                <label for="email" path="email">Correo electronico: </label>
                <input type="email" id="correo" name="correo" path="email"></br></br>
                <label for="password" path="password">Contraseña: </label>
                <input type="password" id="contra" name="contra" path="password"</br></br>
                <label for="name" path="name">Nombre: </label>
                <input type="text" id="nombre" name="nombre" path="name"></br></br>
                <label for="date" path="date">Fecha de Nacimiento: </label>
                <input type="date" id="fecha" name="fecha" path="date"></br></br>
                <input type="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
