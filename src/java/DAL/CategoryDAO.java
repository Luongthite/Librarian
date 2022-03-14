/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Book;
import Model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CategoryDAO extends BaseDAO1{
         public ArrayList getAll(){
       ArrayList<Category> cates=new ArrayList<>();
       try {
           String sql ="select * from Category";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Category b = new Category();
             b.setId(rs.getString(1));
             b.setName(rs.getString(2));
               cates.add(b);
               
           }
       } catch (SQLException ex) {
        
       }
       return cates;
    }
         
         public String getCateName(String id){
             try {
           String sql ="select Name from Category where Id=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, id);
           ResultSet rs = statement.executeQuery();
           if(rs.next())
           {
              return rs.getString(1);
               
           }
       } catch (SQLException ex) {
        
       }
       return null;
         }
         
         
     
}
