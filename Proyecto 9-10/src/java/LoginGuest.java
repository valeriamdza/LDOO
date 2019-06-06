
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LoginGuest"})
public class LoginGuest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        String usuario,nombre,fecha;
        Date registro;
        usuario=request.getParameter("usuario");
        nombre=request.getParameter("nombre");
        registro=new Date();
        fecha=registro.toString();
        if(nombre!= null){
                
            try {
                Invitado invitado=new Invitado(usuario,nombre,fecha);
               invitado.registroInvitado(nombre,fecha);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LoginInvitado.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
                out.println("<html>\n" +
                    "    <head>\n" +
                    "        <title>Log In</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <h1>Inicio de Sesion</h1>\n" +
                    "        \n" +
                    "        <div>\n" +
                    "            <form action=\"SesionInvitado\" method=\"post\">\n" +
                    "                <label>Usuario:</label><input type=\"text\" name=\"usuario\"/><br>\n" +
                    "                <label>Contraseña:</label><input type=\"password\" name=\"contra\"/><br>\n" +
                    "                <input type=\"submit\" value=\"Enviar\"/ name=\"Enviar\"/>  \n" +
                    "            </form>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    ""); 
    }
    }
