package trailers_design;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * @author Frank
 */
public class ConexionTD {
    static String bd= "trailersd";
    static String login= "root";
    static String password= "";
    static String url= "jdbc:mysql://localhost/"+bd;
    static String strcon = url+ "?user=" + login + "&password="
            + password + "&useSSL=false";
    Connection Conectar=null;

        public Connection conexion(){
            try{
                //Class.forName("com.mysql.jdbc.Driver").newInstance();
                Conectar = DriverManager.getConnection(strcon);
                System.out.println("Conexion exitosa...");

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return Conectar;
        }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
