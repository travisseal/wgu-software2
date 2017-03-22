/*
 * Build a connection object, and return pass it to the calling classes
 */
package Controller;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Travis
 */
public class ConnectionBuilderDAO {
    private static ConnectionBuilderDAO instance;
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String db = "U04hfs";
    private static String url = "jdbc:mysql://52.206.157.109/" + db;
    private static String user = "U04hfs";
    private static String pass = "53688243567";
    private static Connection conn = null;
    
    private ConnectionBuilderDAO() throws ClassNotFoundException
    {
        makeConnection();
    }
    
    public static ConnectionBuilderDAO getInstance() throws ClassNotFoundException  {
    if(instance == null) {
        synchronized(ConnectionBuilderDAO.class) {
              if(instance == null) {
                 instance = new ConnectionBuilderDAO();
              }
        }
    }
    return instance;
    }
    
    private static boolean makeConnection() throws ClassNotFoundException
    {
    try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected to database : " + db);
            return true;
        }
        catch (SQLException e) 
        {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
            return false;
        }
    }
    
    public static Connection connection()
    {
        try
        {
            return conn;
        }
        catch(Exception ex)
        {
            System.err.println(ex.toString());
            
            return null;
        }
    }
}  