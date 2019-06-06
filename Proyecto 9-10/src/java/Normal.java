import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Normal implements Usuarios{
    String usuario,contra,correo,fecha,nombre,subs,direccion;
    public Normal(String usuario, String contra, String correo, String fecha) {
        
        this.contra=contra;
        this.correo=correo;
        this.fecha=fecha;
        this.usuario=usuario;
        registrarUs();
        
    }
    public Normal(String usuario,String nombre,String subs,String direccion,String registro){
        this.usuario=usuario;
        registrarNormal(nombre,subs,direccion);
    }
            
    public Normal(String usuario,String nombre,String validarUs) throws ClassNotFoundException, SQLException{
        this.usuario=usuario;
        
    }  

@Override
    public void registrarUs(){
        try {
            Class.forName(clase);
            Connection miconexion= (Connection) DriverManager.getConnection(url,usuario,contra);
            PreparedStatement miSt= miconexion.prepareStatement("INSERT INTO usuarios VALUES('" + usuario + "','" + contra +"','"+ fecha + "','"+ correo +"','Normal')");
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
    public final void registrarNormal(String nombre, String subs,String direccion){
        try {
            Class.forName(clase);
            Connection miconexion= (Connection) DriverManager.getConnection(url,usuario,contra);
            PreparedStatement miSt=miconexion.prepareStatement("INSERT INTO admin VALUES(" + usuario + "','"+ nombre+"," + subs "," + direccion ")");
            miSt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}