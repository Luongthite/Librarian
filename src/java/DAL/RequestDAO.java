/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Book;
import Model.Request;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class RequestDAO extends BaseDAO1<Request>{
     public ArrayList getAll(){
       ArrayList<Request> reqs=new ArrayList<>();
       try {
           String sql ="select * from Request";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Request req=new Request();
               req.setBookId(rs.getInt(2));
               req.setMemberId(rs.getString(1));
               req.setType(rs.getString(3));
               req.setStatus(rs.getString(4));
               reqs.add(req);
           }
       } catch (SQLException ex) {
        
       }
       return reqs;
    }
     
//     public ArrayList getAll2(){
//       ArrayList<Request> reqs=new ArrayList<>();
//       try {
//           String sql ="select * from Request";
//           String sql2="select Title, Availability, Rental_price from Book where"
//                   + "Id=?";
//             PreparedStatement statement = connection.prepareStatement(sql);
//             PreparedStatement statement2 = connection.prepareStatement(sql2);
//              ResultSet rs = statement.executeQuery();
//             statement2.setInt(1, rs.getInt(2));
//          
//           ResultSet rs2 = statement.executeQuery();
//           while(rs.next())
//           {
//               Request req=new Request();
//               req.setBookId(rs.getInt(2));
//               req.setMemberId(rs.getString(1));
//               req.setType(rs.getString(3));
//               req.setStatus(rs.getString(4));
//               req.setTitle(rs2.getString("Title"));
//               req.setAvail(rs2.getInt("Availability"));
//               req.setRentalPrice(rs2.getInt("Rental_price"));
//               reqs.add(req);
//           }
//       } catch (SQLException ex) {
//        
//       }
//       return reqs;
//    }
     
     
     public void addReq(String memberId, int bookId){
     
       try {
           String sql ="insert into Request(MemberId, BookId)\n" +
"values(?, ?)";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, memberId );statement.setInt(2, bookId);
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        
       }
    }
     
     public void delReq(String memberId, int bookId){
     
       try {
           String sql ="delete from Request where MemberId=? and BookId=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, memberId );
             statement.setInt(2, bookId);
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        
       }
    }
     
}
