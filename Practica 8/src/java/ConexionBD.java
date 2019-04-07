import java.sql.*;

public class ConexionBD {
    public static void Conectar(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "");
            Statement miStatement= conexion.createStatement();
            
            System.out.println("Conectado");
            
        }catch(Exception e){
            System.out.println("No se pudo conectar");
        }
    }
    
    public String[] buscarDatos(){
       String dato[]= new String[3];
       try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "");
       Statement miStatement= conexion.createStatement();
       ResultSet miResult= miStatement.executeQuery("SELECT * FROM usuarios");
       
       while(miResult.next()){
           
           dato[0]= miResult.getString("Nombre");
           dato[1]= miResult.getString("Correo");
           dato[2]= miResult.getString("Contraseña");
       }
       }catch(Exception e){
              
               }
        return dato;
       
    }
    public String insertarDatos(String Nombre, String Correo, String Contra){
        String dato= "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "");
            Statement miStatement= conexion.createStatement();
            PreparedStatement pStm= conexion.prepareStatement("INSERT INTO usuarios VALUES('"+Nombre+"','"+Correo+"','"+Contra+"')");
            pStm.executeUpdate();
        }catch(Exception e){
            
        }
        return dato;
        
    }
}
