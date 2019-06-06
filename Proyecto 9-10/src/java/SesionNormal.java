
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/SesionNormal"})
public class SesionNormal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String usuarioA,contraA,validar,clave;
            validar="";
            usuarioA=request.getParameter("usuario");
            contraA=request.getParameter("contra");
            Normal normal= new Normal(usuarioA,contraA,validar);
            clave=normal.validarUs();
            PrintWriter out= response.getWriter();
            if(clave.equals(contraA)){
                out.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Bienvenido</title>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        \n" +
                "        <div>\n" +
                "            <h1>Bienvenido</h1>\n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>\n" +
                "");
            }else{
                out.println("<html>\n" +
                    "    <head>\n" +
                    "        <title>Inicio de Sesion</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <p>Error al iniciar sesion</p><br><h1>Inicio de Sesion</h1>\n" +
                    "        \n" +
                    "        <div>\n" +
                    "            <form action=\"SesionNormal\" method=\"post\">\n" +
                    "                <label>Usuario:</label><input type=\"text\" name=\"usuario\"/><br>\n" +
                    "                <label>Contraseña:</label><input type=\"password\" name=\"contra\"/><br>\n" +
                    "                <input type=\"submit\" value=\"Enviar\"/ name=\"Enviar\"/>  \n" +
                    "            </form>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    ""); 
                        
            
            }
            
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SesionAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }


