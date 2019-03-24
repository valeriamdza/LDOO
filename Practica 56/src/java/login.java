import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cnombre, ccorreo, ccontra;

            ccorreo=request.getParameter("correo");
            ccontra=request.getParameter("contra");

            
            HttpSession sesion = request.getSession();
            Usuario us = (Usuario) sesion.getAttribute("usuario");
       
            Cookie micookie = new Cookie("nombre", "usuario");
            response.addCookie(micookie);
            
        try (PrintWriter out = response.getWriter()) {
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Iniciar sesión</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form><br>"+
                    "Correo electronico: <input type = \"email\" name = \"correo\" />\n" +
                    "<br><br>\n" +
                    "Contraseña <input type = \"password\" name = \"contra\" />\n" +
                    "<br><br>\n" +
                    "<input type = \"submit\" value = \"Entrar\" /><br><br></form>");
            out.println("</body>");
            out.println("</html>");

            
        }
        if(ccorreo.equals(us)){
            out.println("Bienvenido "+us.getCnombre());
            
        }else{
            out.println("Datos incorrectos");
            out.println("<form><br>"+
                    "Correo electronico: <input type = \"email\" name = \"correo\" />\n" +
                    "<br><br>\n" +
                    "Contraseña <input type = \"password\" name = \"contra\" />\n" +
                    "<br><br>\n" +
                    "<input type = \"submit\" value = \"Entrar\" /><br><br></form>");
        }
        if(ccontra.equals(us)){
            out.println("Bienvenido "+us.getCnombre());
            
        }else{
            out.println("Datos incorrectos");
            out.println("<form><br>"+
                    "Correo electronico: <input type = \"email\" name = \"correo\" />\n" +
                    "<br><br>\n" +
                    "Contraseña <input type = \"password\" name = \"contra\" />\n" +
                    "<br><br>\n" +
                    "<input type = \"submit\" value = \"Entrar\" /><br><br></form>");
        }
       
    }
    

}
