
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LoginAdmin"})
public class LoginAdmin extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        String usuario,numE;
        usuario=request.getParameter("usuario");
        numE=request.getParameter("numE");
        if(usuario!= null){
                Admin admin=new Admin(usuario,numE);
        }
                out.println("<html>\n" +
                    "    <head>\n" +
                    "        <title>Iniciar Sesiion</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <h1>Iniciar Sesion</h1>\n" +
                    "        \n" +
                    "        <div>\n" +
                    "            <form action=\"SesionAdmin\" method=\"post\">\n" +
                    "                <label>Usuario:</label><input type=\"text\" name=\"usuario\"/><br><label>Numero de empleado:</label><input type=\"text\" name=\"numE\"/><br>\n" +
                    "                <label>Contraseña:</label><input type=\"password\" name=\"contra\"/><br>\n" +
                    "                <input type=\"submit\" value=\"Enviar\"/ name=\"Enviar\"/>  \n" +
                    "            </form>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    ""); 
            
        
    }
    }

  

