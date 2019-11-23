package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    public static void closeConnection (Connection con){
        
            try {
                if(con!=null){
                con.close();}
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stat){
        
        closeConnection(con);
        
        try {
            
            if(stat!=null){
                stat.close();
            }
        }
        catch (SQLException ex){
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
        
    }
  
        public static void closeConnection(Connection con, PreparedStatement stat, ResultSet rs){
        
        closeConnection(con, stat);
        
        try {
            
            if(rs!=null){
                rs.close();
            }
        }
        catch (SQLException ex){
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
        
    }
}

