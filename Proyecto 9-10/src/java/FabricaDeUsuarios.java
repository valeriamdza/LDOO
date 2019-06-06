import java.sql.SQLException;

public class FabricaDeUsuarios {
    private static FabricaDeUsuarios instancia;
    private FabricaDeUsuarios(){}
    private synchronized static void createInstance(){
        if(instancia==null){
                instancia = new FabricaDeUsuarios();
            }
    }
    
    public static FabricaDeUsuarios getInstance(){
        createInstance();
        return instancia;
    }
    
    public Usuarios getUsuarios(String usuario, String contra,String correo,String fecha,String tipoUs){
        if(tipoUs==null){
            return null;
        }
        if(tipoUs.equalsIgnoreCase("admin")){
            return new Admin(usuario, contra, correo, fecha);
        }else if(tipoUs.equalsIgnoreCase("normal")){
            return new Normal(usuario, contra, correo, fecha);
        }else if(tipoUs.equalsIgnoreCase("invitado")){
            return new Invitado(usuario, contra, correo, fecha);
        }
        return null;
    }
    
    public Usuarios validar(String usuario,String contra,String validar, String tipoUs) throws ClassNotFoundException, SQLException {
        if(tipoUs==null){
        return null;
        }
        if(tipoUs.equalsIgnoreCase("admin")){
            return new Admin(usuario, contra, validar);
        }else if(tipoUs.equalsIgnoreCase("normal")){
            return new Normal(usuario, contra, validar);
        }else if(tipoUs.equalsIgnoreCase("invitado")){
            return new Invitado(usuario, contra, validar);
        }
        return null;
    }
}