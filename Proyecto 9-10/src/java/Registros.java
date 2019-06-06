
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Registros"})
public class Registros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
            String correo,contra,usuario,fecha,tipoUs;
            correo=request.getParameter("correo");
            contra=request.getParameter("contra");
            usuario=request.getParameter("usuario");
            fecha= request.getParameter("fecha");
            tipoUs=request.getParameter("tipoUs");
                
            FabricaDeUsuarios fabrica=FabricaDeUsuarios.getInstance();
            Usuarios usuarios=fabrica.getUsuarios(correo,contra,usuario,fecha,tipoUs);
            switch(tipoUs){
                case "Admin":
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>MENU</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <h2>Registro Administrador</h2>\n" +
                        "            <form action='LoginAdmin' method='post'>\n" +
                        "                <label>Usuario</label><input type='text' name=\"usuario\">\n<label>Numero de Empleado</label><input type='text' name=\"numE\">\n" +
                        "                <input type=\"submit\" value=\"Enviar\">\n" +
                        "            </form>\n" +
                        "            \n" +
                        "        </div>\n" +
                        "    </body>\n" +
                        "</html>");
                    break;
                    
                case "Normal":
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>MENU</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <h2>Registro Usuario Normal</h2>\n" +
                        "            <form action='Login' method='post' id=\"registros\">\n" +
                        "                <label>Usuario</label><input type='text' name=\"usuario\">\n<label>Nombre:</label><input type='text'name=\"nombre\" >\n" +
                        "                <select name=\"subs\" form=\"registros\">\n" +
                        "                    <option>Mensual</option>\n" +
                        "                    <option>Semestral</option>\n" +
                        "                    <option>Anual</option>\n" +
                        "                </select>\n" +
                        "                <label>Direccion:</label><input type='text'name=\"direccion\" >\n" +
                        "                <input type=\"submit\" value=\"Enviar\">\n" +
                        "            </form>\n" +
                        "            \n" +
                        "        </div>\n" +
                        "    </body>\n" +
                        "</html>");
                    break;
                
                case "invitado":
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Menu</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "        <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <h2>Registro Invitado</h2>\n" +
                        "            <form action='LoginGuest' method='post' id=\"registros\">\n" +
                        "                <label>Usuario</label><input type='text' name=\"usuario\"><br><label>Nombre:</label><input type='text'name=\"nombre\" >\n" +
                        "                <input type=\"submit\" value=\"Enviar\">\n" +
                        "            </form>\n" +
                        "            \n" +
                        "        </div>\n" +
                        "    </body>\n" +
                        "</html>");
                    break;
            }
                
                
            
    }
    

}
