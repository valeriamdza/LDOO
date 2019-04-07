import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();       
        HttpSession sesion= request.getSession();
        Usuario usuario= (Usuario)sesion.getAttribute("usuario");
        String email= usuario.getCorreo();
        String password= usuario.getContra();
        Cookie[] micookie= request.getCookies();
        String idSesionCookie= micookie[0].getValue();
        String id_session= sesion.getId();
        String email_r= request.getParameter("correo");
        String password_r= request.getParameter("contra");
        
        if(email_r.equals(email)){
            if(password_r.equals(password)){
                if(id_session.equals(idSesionCookie)){
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");         
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Bienvenido</h1>");
                    out.println("</body>");
                    out.println("</html>");
                }else{
                    out.print("<h1>Datos incorrectos</h1><form action = \"Login\" method = \"post\">\n" +
"         Correo electronico: <input type = \"email\" name = \"correo\" />\n" +
"         Contraseña <input type = \"password\" name = \"contra\" />\n" +
"         <input type = \"submit\" value = \"Entrar\" /><br><br>");
                }
            }else{
                out.print("<h1>Datos incorrectos</h1><form action = \"Login\" method = \"post\">\n" +
"         Correo electronico: <input type = \"email\" name = \"correo\" />\n" +
"         Contraseña <input type = \"password\" name = \"contra\" />\n" +
"         <input type = \"submit\" value = \"Entrar\" /><br><br>");
            }
        }else{
            out.print("<h1>Datos incorrectos</h1><form action = \"Login\" method = \"post\">\n" +
"         Correo electronico: <input type = \"email\" name = \"correo\" />\n" +
"         Contraseña <input type = \"password\" name = \"contra\" />\n" +
"         <input type = \"submit\" value = \"Entrar\" /><br><br>");
        }

    }


}
