import java.sql.SQLException;

public interface Usuarios{    
    public static final String url="jdbc:mysql://localhost:3306/patterns";
    public static final String usuario="root";
    public static final String contra="";
    public static final String clase="com.mysql.jdbc.Driver";
    void registrarUs();
    String validarUs()throws ClassNotFoundException, SQLException;
}