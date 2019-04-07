import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Usuario usuario = new Usuario(request.getParameter("nombre"), request.getParameter("correo"), request.getParameter("contra"));
        HttpSession sesion= request.getSession();
        sesion.setAttribute("usuario", usuario);
        
        Cookie micookie= new Cookie("id_session", sesion.getId());
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");         
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='Login.html'>Iniciar sesión</a>");
            out.println("</body>");
            out.println("</html>");
    }


}
