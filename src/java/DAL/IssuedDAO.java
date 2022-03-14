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

     public ArrayList getAll(){
       ArrayList<Issued> reqs=new ArrayList<>();
       try {
           String sql ="select * from Issued";
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
     
     
     
}
