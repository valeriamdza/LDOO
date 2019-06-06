import com.mysql.jdbc.onnection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Admin implements Usuarios{
    String usuario,contra,correo,fecha,numE;
    public Admin(String usuario, String contra, String correo, String fecha, String numE) {
        
        this.contra=contra;
        this.correo=correo;
        this.fecha=fecha;
        this.usuario=usuario;
        registrarUs();
        
    }
    
    public Admin(String usuario,String numE){
        this.usuario=usuario;
        registrarAdmin(usuario,numE);
    }
    public Admin(String usuario,String contra,String validarUs) throws ClassNotFoundException, SQLException {
        this.contra=contra;
        this.usuario=usuario;
        
    }


@Override
    public void registrarUs(){
        try {
            Class.forName(clase);
            Connection miconexion= (Connection) DriverManager.getConnection(url,usuario,contra);
            PreparedStatement miSt= miconexion.prepareStatement("INSERT INTO usuarios VALUES('" + usuario + "','" + contra +"','"+ fecha + "','"+ correo +"','Admin')");
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
    public void registrarAdmin(String usuario,String numE){
        try {
            Class.forName(clase);
            Connection miconexion= (Connection) DriverManager.getConnection(url,usuario,contra);
            PreparedStatement miSt=miconexion.prepareStatement("INSERT INTO admin VALUES('" + usuario + "','"+ numE+"");
            miSt.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}