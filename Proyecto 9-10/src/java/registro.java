
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/registro"})
public class registro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "    <head>\n" +
                    "        <title>Registro</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <h1>Formulario</h1>\n" +
                    "        \n" +
                    "        <div>\n" +
                    "            <h2>Registro de usuario</h2>\n" +
                    "            <form action=\"Registros\" id='registro' method=\"post\">\n" +
                    "                <label>Correo:</label><input type=\"email\" name=\"correo\"/><br>\n" +
                    "                <label>Contraseña:</label><input type=\"password\" name=\"contra\"/><br>\n" +
                    "                <label>Usuario:</label><input type=\"text\" name=\"usuario\"/><br>\n" +
                    "                <label>Fecha de nacimiento:</label><input type=\"date\" name=\"fecha\"/><br>\n" +
                    "                  \n" +"<label>Tipo de Usuario:</label>"+
                                    "<select name='tipo' form='registro'><option value='admin'>Administrador</option>"+
                                    "<option value='normal'>Normal</option><option value='invitado'>Invitado</option></select><input type=\"submit\" value=\"Enviar\"name=\"Enviar\"/>  "+
                    "            </form>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    "");
                        }
                        }

