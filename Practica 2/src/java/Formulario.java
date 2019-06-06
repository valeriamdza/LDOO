
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Formulario"})
public class Formulario extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter(); 

        out.println("<html><body>");
        out.println("Nombre: " + request.getParameter("nombre"));
        out.println("<br>");
        out.println("Correo electronico: " + request.getParameter("correo"));
        out.println("<br>");
        out.println("Contraseña: " + request.getParameter("contra"));
        out.println("<br>");
        out.println("Fecha de Nacimiento: " + request.getParameter("nacimiento"));
        out.println("</html></body>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
