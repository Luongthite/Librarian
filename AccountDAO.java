
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author Admin
 */
public class AccountDAO extends BaseDAO{

    @Override
    public ArrayList getAll() {
       ArrayList<Account> accounts=new ArrayList<>();
       try {
           String sql ="select [username], [password], [displayName] from Account";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Account a = new Account();
               a.setUsername(rs.getString("username"));
               a.setPassword(rs.getString("password"));
               a.setDisplayName(rs.getString("displayName"));
               accounts.add(a);
           }
       } catch (SQLException ex) {
           Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return accounts;
    }
    
    public Account getAccountByUserName(String user){
        
        try {String sql="select [username], [password],[displayName] from Account where username= ?";
                 PreparedStatement statement;
            statement = connection.prepareStatement(sql);
            statement.setString(1, user);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
                Account a = new Account();
               a.setUsername(rs.getString("username"));
               a.setPassword(rs.getString("password"));
               a.setDisplayName(rs.getString("displayName"));
               return a;
           }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           return null;
    }
    
}
