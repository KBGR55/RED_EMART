package controlador.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author KBGR55/Hilary-Madelein/Thaisncp/AdrianArtz/ronaldcuenca19
 */
public class SQLclass {

    public SQLclass() {
    }
    
    public static Connection conn(){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("connection to data base");
            Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "USERPY", "grupo1");
            System.out.println("CONEXION EXITOSA");
            return connection;
            
        } catch (Exception e) {
            System.out.println("MALA CONEXION: "+e);
            return null;
        }
    }
}
