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

@WebServlet(urlPatterns = {"/registro"})
public class registro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try (PrintWriter out = response.getWriter()) {

            String cnombre, ccorreo, ccontra, cnacimiento;
            
            cnombre=request.getParameter("nombre");
            ccorreo=request.getParameter("correo");
            ccontra=request.getParameter("contra");
            cnacimiento=request.getParameter("nacimiento");
            
            HttpSession sesion = request.getSession();
            Usuario us= new Usuario(cnombre, ccorreo, ccontra, cnacimiento);
            sesion.setAttribute("usuario", us);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Iniciar sesión</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='login'>Iniciar sesión</a>");
            out.println("</body>");
            out.println("</html>");
            
            
        }
            
       
        
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
