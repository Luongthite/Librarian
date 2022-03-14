/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Admin;
import Model.Member;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AdminDAO extends BaseDAO1{
     public ArrayList getAll() {
       ArrayList<Admin> admin=new ArrayList<>();
       try {
           String sql ="select * from Librarian";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Admin m = new Admin();
               m.setId(rs.getString("Id"));
               m.setPassword(rs.getString("Password"));
               m.setName(rs.getString("Name"));
               m.setAddress(rs.getString("Address"));
              
               m.setEmail(rs.getString("Email"));
               m.setPhoneNumber(rs.getString("PhoneNumber"));
              
               admin.add(m);
           }
       } catch (SQLException ex) {
           Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return admin;
    }
    
    public Admin getAdmin(String id, String password){
        try {
           String sql ="select * from Librarian where Id=? and Password=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1,id);
           statement.setString(2, password);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Admin m = new Admin();
               m.setId(rs.getString("Id"));
               m.setPassword(rs.getString("Password"));
               m.setName(rs.getString("Name"));
               m.setAddress(rs.getString("Address"));
               m.setEmail(rs.getString("Email"));
               m.setPhoneNumber(rs.getString("PhoneNumber"));
               return m;
           }
       } catch (SQLException ex) {
           Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }
    
}
