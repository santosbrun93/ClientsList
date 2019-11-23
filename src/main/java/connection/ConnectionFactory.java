package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {


    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/dbclients";
    private final String USER = "root";
    private final String PASS = "123456";
    
    
    public Connection getConnection(){
        
        
        try{
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
    }
        catch (ClassNotFoundException  ex){
            throw new RuntimeException("Erro na conexão: ",ex);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão: ",ex);
        }
        
        
    }
}
