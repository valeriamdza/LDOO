
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

@WebServlet(urlPatterns = {"/SesionAdmin"})
public class SesionAdmin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String usuarioA,contraA,numEA,clave,numero;
            usuarioA=request.getParameter("usuario");
            contraA=request.getParameter("contra");
            numEA=request.getParameter("numE");
            Admin Admin=new Admin(usuarioA,contraA,numEA);
            clave=Admin.validarUs();
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
                    "            <h1>Bienvenido Administrador</h1>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    "");
                }else{
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Iniciar sesión</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        <p>Contraseña Incorrecta</p><br><h1>Inicio de Sesion</h1>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <form action=\"SesionAdmin\" method=\"post\">\n" +
                        "                <label>Usuario:</label><input type=\"text\" name=\"user\"/><br><label>Numero de empleado:</label><input type=\"text\" name=\"numE\"/><br>\n" +
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



