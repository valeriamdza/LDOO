import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Invitado implements Usuarios {
    String usuario,contra,nombre,fecha,correo;

    public Invitado(String usuario, String contra,String correo,String fecha) {
        this.contra=contra;
        this.correo=correo;
        this.fecha=fecha;
        this.usuario=usuario;
        registrarUs();
        
    }
    
    public Invitado(String usuario,String contra){
        this.usuario=usuario;
        this.contra=contra;
        registrarInvitado(nombre,fecha);
    }
            
    public Invitado(String usuario,String nombre,String fecha) throws ClassNotFoundException, SQLException{
        this.usuario=usuario;
        this.nombre=nombre;
        this.fecha=fecha;
        
    }  

    
    @Override
    public void registrarUs(){
        try {
            Class.forName(clase);
            Connection miconexion= (Connection) DriverManager.getConnection(url,usuario,contra);
            PreparedStatement miSt= miconexion.prepareStatement("INSERT INTO usuarios VALUES('" + usuario + "','" + contra +"','"+ fecha + "','"+ correo +"','Invitado')");
            miSt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String validarUs()throws ClassNotFoundException, SQLException{
       
            String salida="";
            Class.forName(clase);
            Connection miconexion= (Connection) DriverManager.getConnection(url,usuario,contra);
            Statement St=miconexion.createStatement();
            ResultSet result= St.executeQuery("SELECT * FROM usuarios WHERE nombre='"+ usuario +"");
            while(result.next()){
                salida=result.getString("contra");
            }
            return salida;
        
    }
    public final void registrarInvitado(String nombre, String nRegistro){
        try {
            Class.forName(clase);
            Connection miconexion= (Connection) DriverManager.getConnection(url,usuario,contra);
            PreparedStatement miSt=miconexion.prepareStatement("INSERT INTO admin VALUES('" + usuario + "','"+ nRegistro+"");
            miSt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
    

