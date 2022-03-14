
package DAL;

import Model.Member;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemberDAO extends BaseDAO1{
    @Override
    public ArrayList getAll() {
       ArrayList<Member> members=new ArrayList<>();
       try {
           String sql ="select * from Member";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Member m = new Member();
               m.setId(rs.getString("Id"));
               m.setPassword(rs.getString("Password"));
               m.setName(rs.getString("Name"));
               m.setAddress(rs.getString("Address"));
               m.setMemberRegistrationDate(rs.getDate("MemberRegistrationDate"));
               m.setMemberRegistrationExpDate(rs.getDate("MemberExpireDate"));
               m.setEmail(rs.getString("Email"));
               m.setPhoneNumber(rs.getString("PhoneNumber"));
               m.setCardNumber(rs.getString("CardNumber"));
               m.setCardExpDate(rs.getString("CardExpDate"));
               m.setCVC(rs.getInt("CVC"));
               members.add(m);
           }
       } catch (SQLException ex) {
           Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return members;
    }
    
    public Member getMember(String id, String password){
        try {
           String sql ="select * from Member where Id=? and Password=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1,id);
           statement.setString(2, password);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Member m = new Member();
               m.setId(rs.getString("Id"));
               m.setPassword(rs.getString("Password"));
               m.setName(rs.getString("Name"));
               m.setAddress(rs.getString("Address"));
              m.setMemberRegistrationDate(rs.getDate("MemberRegistrationDate"));
               m.setMemberRegistrationExpDate(rs.getDate("MemberExpireDate"));
               m.setEmail(rs.getString("Email"));
               m.setPhoneNumber(rs.getString("PhoneNumber"));
               m.setCardNumber(rs.getString("CardNumber"));
               m.setCardExpDate(rs.getString("CardExpDate"));
               m.setCVC(rs.getInt("CVC"));
               return m;
           }
       } catch (SQLException ex) {
           Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }
    
    
    public void addMember(String id, String password, String name, String address, String Email, String phone, String cardNum, String cardExp, int CVC){
         try {
           String sql ="insert into [Member] (Id, Password, Name, Address, Email, PhoneNumber, CardNumber, CardExpDate, CVC)\n" +
"values (?, ?, ?,?,?, ?, ?,?,?)";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1,id);
           statement.setString(2, password);
            statement.setString(3, name);
             statement.setString(4, address);
               statement.setString(5, Email);
                statement.setString(6, phone);
                 statement.setString(7, cardNum);
                  statement.setString(8, cardExp);
                   statement.setInt(9, CVC);
                   
           statement.executeUpdate();
          
       } catch (SQLException ex) {
           Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public int countMem(){
        int count=0;
         try {
           String sql ="select count * from Member";
           PreparedStatement statement = connection.prepareStatement(sql);
           
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               count=rs.getInt(1);
           }
          
       } catch (SQLException ex) {
           Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
         return count;
    }
}
