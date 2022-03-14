package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*
* @author fsoft
 * @param <T>
*/
public abstract class BaseDAO1<T> {
   protected Connection connection;
   public BaseDAO1()
   {
       try {
           String user = "sa";
           String pass = "123456";
           String url = "jdbc:sqlserver://localhost:1433;databaseName=librarian";
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           connection = DriverManager.getConnection(url, user, pass);
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(BaseDAO1.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public abstract ArrayList<T> getAll();
   
}
 