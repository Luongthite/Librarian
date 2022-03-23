
package DAL;

import Model.Issued;
import Model.Recommendation;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class RecDAO extends BaseDAO1<Recommendation>{
    
     public ArrayList getAll(){
       ArrayList<Recommendation> reqs=new ArrayList<>();
       try {
           String sql ="select * from Recommendation";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Recommendation i=new Recommendation();
              i.setId(rs.getInt(1));
               i.setMemberId(rs.getString(2));
               i.setBookName(rs.getString(3));
               i.setBookPic(rs.getString(4));
               i.setAuthor(rs.getString(5));
               i.setDes(rs.getString(6));
               i.setStatus(rs.getString(7));
               reqs.add(i);
           }
       } catch (SQLException ex) {
        
       }
       return reqs;
    }
     
     public ArrayList getAlltoId1(String id){
         ArrayList<Recommendation> iss=new ArrayList<>();
         try {
             String query="select * from Recommendation where MemberId=?";
             PreparedStatement ps=connection.prepareStatement(query);
             ps.setString(1,id);
             ResultSet rs=ps.executeQuery();
             
             while(rs.next()){
                 Recommendation i=new Recommendation();
               i.setId(rs.getInt(1));
               i.setMemberId(rs.getString(2));
               i.setBookName(rs.getString(3));
               i.setBookPic(rs.getString(4));
               i.setAuthor(rs.getString(5));
               i.setDes(rs.getString(6));
               i.setStatus(rs.getString(7));
  
                 iss.add(i);
             }
             
         } catch (Exception e) {
         }
   return iss;  }
    
     
      public void addRec(String memberId, String bookName,String bookPic,String author, String des){
     
       try {
           String sql ="insert into Recommendation(MemberId, BookName,BookPic, Author, Description)\n" +
"values(?, ?, ?,?,?)";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, memberId );
             statement.setString(2, bookName );
             statement.setString(3, bookPic);statement.setString(4, author);
             statement.setString(5, des);
             
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        
       }
    }
      
       public void updateStatus(String memberId, String bookName, String status){
     
       try {
           String sql ="update Recommendation set Status = ? where MemberId=? and BookName=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, status );
             statement.setString(2, memberId );
             statement.setString(3, bookName );
             
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        
       }
    }
     
}
