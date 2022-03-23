/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Issued;
import Model.Request;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class IssuedDAO extends BaseDAO1<Issued>{

   public ArrayList<Issued> getAll(){
         ArrayList<Issued> iss=new ArrayList<>();
         try {
             String query="select * from Issued";
             PreparedStatement ps=connection.prepareStatement(query);
             ResultSet rs=ps.executeQuery();
             
             while(rs.next()){
                 Issued i=new Issued();
                 i.setMemberId(rs.getString(1));
                 i.setBookId(rs.getInt(2));
                 i.setAdminId(rs.getString(3));
                 i.setDateOfIssue(rs.getDate(4));
                 i.setDateOfReturn(rs.getDate(5));
                 i.setActualReturnDate(rs.getDate(6));
                 i.setFine(rs.getInt(7));
                 iss.add(i);
             }
             
         } catch (Exception e) {
         }
   return iss;  }
     
     public ArrayList getAlltoId1(String id){
         ArrayList<Issued> iss=new ArrayList<>();
         try {
             String query="select * from Issued where MemberId=?";
             PreparedStatement ps=connection.prepareStatement(query);
             ps.setString(1,id);
             ResultSet rs=ps.executeQuery();
             
             while(rs.next()){
                 Issued i=new Issued();
                 i.setMemberId(rs.getString(1));
                 i.setBookId(rs.getInt(2));
                 i.setAdminId(rs.getString(3));
                 i.setDateOfIssue(rs.getDate(4));
                 i.setDateOfReturn(rs.getDate(5));
                 i.setActualReturnDate(rs.getDate(6));
                 i.setFine(rs.getInt(7));
                 iss.add(i);
             }
             
         } catch (Exception e) {
         }
   return iss;  }
     
     public ArrayList getCur(){
       ArrayList<Issued> reqs=new ArrayList<>();
       try {
           String sql ="select * from Issued where ActualReturnDate is null";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Issued req=new Issued();
               req.setBookId(rs.getInt(2));
               req.setMemberId(rs.getString(1));
               req.setAdminId(rs.getString(3));
               req.setDateOfIssue(rs.getDate(4));
               req.setDateOfIssue(rs.getDate(5));
               req.setActualReturnDate(rs.getDate(5));
               req.setFine(rs.getInt(6));
               reqs.add(req);
           }
       } catch (SQLException ex) {
        
       }
       return reqs;
    }
     
     public void return1(String memberId, int bookId, Date dateOfIssue, Date returnDate){
         try {
             String query="update Issued\n" +
"set ActualReturnDate =?\n" +
"where bookId=? and MemberId=? and DateOfIssue=?";
             PreparedStatement ps=connection.prepareStatement(query);
             ps.setString(3, memberId);
             ps.setDate(4, dateOfIssue);
             ps.setInt(2, bookId);
             ps.setDate(1, returnDate);
             ps.executeUpdate();
         } catch (Exception e) {
         }
     }
     
      public void addIssued(String memberId, int bookId, String adminId, Date dateOfIssue, Date dateOfReturn, Date actualReturn, int fine ){
     
       try {
           String sql ="insert into Issued values (?,?,?,?,?,?,?)";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, memberId );
             statement.setInt(2, bookId);
             statement.setString(3, adminId);
             statement.setDate(4, dateOfIssue);
             statement.setDate(5, dateOfReturn);
             statement.setDate(6, actualReturn);
             statement.setInt(7, fine);
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        
       }
    }
      
      public void editIssued(String memberId, int bookId, String adminId, Date dateOfIssue, Date dateOfReturn, Date actualReturn, int fine ){
     
       try {
           String sql ="update Issued set DateOfIssue=?, DateOfReturn=?, ActualReturnDate=?, Fine=?\n" +
"where memberId=? and BookId=? and DateOfIssue=? and AdminId=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setDate(1, dateOfIssue);
             statement.setDate(2, dateOfReturn);
             statement.setDate(3, actualReturn);
             
             statement.setInt(4, fine);
             statement.setString(5, memberId);
             statement.setInt(6, bookId);
             statement.setDate(7, dateOfIssue);
             statement.setString(8, adminId);
           statement.executeUpdate();
           
       } catch (SQLException ex) {
        
       }
    }
     
   
}
