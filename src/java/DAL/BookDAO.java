
package DAL;

import Model.Admin;
import Model.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BookDAO extends BaseDAO1<Book>{
     public ArrayList getAll(){
       ArrayList<Book> books=new ArrayList<>();
       try {
           String sql ="select * from Book";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(1));
               b.setTitle(rs.getString(2));
               b.setPublisher(rs.getString(3));
               b.setYear(rs.getString(4));
               b.setPic(rs.getString(5));
               b.setShelfId(rs.getString(6));
               b.setQuantity(rs.getInt(7));
               b.setAvail(rs.getInt(8));
               b.setCategory(rs.getString(9));
               b.setLanguage(rs.getString(10));
               b.setTimePost(rs.getDate(11));
               b.setRental_price(rs.getLong(12));
               b.setShortDes(rs.getString(13));
               books.add(b);
               
           }
       } catch (SQLException ex) {
        
       }
       return books;
    }
     
     public ArrayList mostBorrowed(int number){
       ArrayList<Book> books=new ArrayList<>();
       try {
           String sql ="SELECT TOP (?) *  FROM book\n" +
"order by (quantity-availability) desc";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setInt(1, number);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(1));
               b.setTitle(rs.getString(2));
               b.setPublisher(rs.getString(3));
               b.setYear(rs.getString(4));
               b.setPic(rs.getString(5));
               b.setShelfId(rs.getString(6));
               b.setQuantity(rs.getInt(7));
               b.setAvail(rs.getInt(8));
               b.setCategory(rs.getString(9));
               b.setLanguage(rs.getString(10));
               b.setTimePost(rs.getDate(11));
               b.setRental_price(rs.getLong(12));
               b.setShortDes(rs.getString(13));
               books.add(b);
               
           }
       } catch (SQLException ex) {
        
       }
       return books;
    }
     
     public Book mostBorrowedByCate(String Cate){
       ArrayList<Book> books=new ArrayList<>();
       try {
           String sql ="SELECT TOP (1) *  FROM book\n" +
"WHERE CategoryId=?\n" +
"order by (quantity-availability) desc";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, Cate);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(1));
               b.setTitle(rs.getString(2));
               b.setPublisher(rs.getString(3));
               b.setYear(rs.getString(4));
               b.setPic(rs.getString(5));
               b.setShelfId(rs.getString(6));
               b.setQuantity(rs.getInt(7));
               b.setAvail(rs.getInt(8));
               b.setCategory(rs.getString(9));
               b.setLanguage(rs.getString(10));
               b.setTimePost(rs.getDate(11));
               b.setRental_price(rs.getLong(12));
               b.setShortDes(rs.getString(13));
               return b;
               
           }
       } catch (SQLException ex) {
        
       }
       return null;
    }
     
     public Book getBookById(String id){
       try {
           String sql ="select * from Book where Id=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, id);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(1));
               b.setTitle(rs.getString(2));
               b.setPublisher(rs.getString(3));
               b.setYear(rs.getString(4));
               b.setPic(rs.getString(5));
               b.setShelfId(rs.getString(6));
               b.setQuantity(rs.getInt(7));
               b.setAvail(rs.getInt(8));
               b.setCategory(rs.getString(9));
               b.setLanguage(rs.getString(10));
               b.setTimePost(rs.getDate(11));
               b.setRental_price(rs.getLong(12));
               b.setShortDes(rs.getString(13));
               return b;
           }
       } catch (SQLException ex) {
        
       }
       return null;
    }
     
     
     
      public ArrayList getBookByCid(String cid){
       ArrayList<Book> books=new ArrayList<>();
       try {
           String sql ="select * from Book where CategoryId=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, cid);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(1));
               b.setTitle(rs.getString(2));
               b.setPublisher(rs.getString(3));
               b.setYear(rs.getString(4));
               b.setPic(rs.getString(5));
               b.setShelfId(rs.getString(6));
               b.setQuantity(rs.getInt(7));
               b.setAvail(rs.getInt(8));
               b.setCategory(rs.getString(9));
               b.setLanguage(rs.getString(10));
               b.setTimePost(rs.getDate(11));
               b.setRental_price(rs.getLong(12));
               b.setShortDes(rs.getString(13));
               books.add(b);
               
           }
       } catch (SQLException ex) {
        
       }
       return books;
    }
      
       public ArrayList getBookByLang(String lang){
       ArrayList<Book> books=new ArrayList<>();
       try {
           String sql ="select * from Book where Language=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, lang);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(1));
               b.setTitle(rs.getString(2));
               b.setPublisher(rs.getString(3));
               b.setYear(rs.getString(4));
               b.setPic(rs.getString(5));
               b.setShelfId(rs.getString(6));
               b.setQuantity(rs.getInt(7));
               b.setAvail(rs.getInt(8));
               b.setCategory(rs.getString(9));
               b.setLanguage(rs.getString(10));
               b.setTimePost(rs.getDate(11));
               b.setRental_price(rs.getLong(12));
               b.setShortDes(rs.getString(13));
               books.add(b);
               
           }
       } catch (SQLException ex) {
        
       }
       return books;
    }
      
      
      
       public ArrayList getBookByPub(String pub){
       ArrayList<Book> books=new ArrayList<>();
       try {
           String sql ="select * from Book where Publisher=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, pub);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(1));
               b.setTitle(rs.getString(2));
               b.setPublisher(rs.getString(3));
               b.setYear(rs.getString(4));
               b.setPic(rs.getString(5));
               b.setShelfId(rs.getString(6));
               b.setQuantity(rs.getInt(7));
               b.setAvail(rs.getInt(8));
               b.setCategory(rs.getString(9));
               b.setLanguage(rs.getString(10));
               b.setTimePost(rs.getDate(11));
               b.setRental_price(rs.getLong(12));
               b.setShortDes(rs.getString(13));
               books.add(b);
               
           }
       } catch (SQLException ex) {
        
       }
       return books;
    }
      
       
     
      
     
     public ArrayList getAllLanguage(){
        ArrayList<String> lang=new ArrayList<>();
       try {
           String sql ="select distinct language from Book";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               lang.add(rs.getString(1));
               
           }
       } catch (SQLException ex) {
        
       }
       return lang; 
     }
     
     public ArrayList getAllPublisher(){
        ArrayList<String> pub=new ArrayList<>();
       try {
           String sql ="select distinct Publisher from Book";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               pub.add(rs.getString(1));
               
           }
       } catch (SQLException ex) {
        
       }
       return pub; 
     }
     
     public int count(){
         int count=0;
       try {
           String sql ="select COUNT (*) from book";
             PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           if(rs.next())
           {
               count=rs.getInt(1);
               
           }
       } catch (SQLException ex) {
        
       }
       return count; 
     }
     
     public void addBook(String title, String pub, int year,String pic, String shelfId, int quantity, int avail, String cate, String lang, Date timePost, int price, String shortDes){
         int count=0;
       try {
           String sql ="insert into Book(Title, Publisher, Year, Pic,ShelfId, Quantity, Availability, CategoryId, Language, timePost, Rental_price, ShortDescription)\n" +
"values (?, ?, ?, ?,?, ?,?, ?,?,?,?, ?)";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, title);
             statement.setString(2, pub);
             statement.setInt(3, year);
             statement.setString(4, pic);
             statement.setString(5, shelfId);
             statement.setInt(6, quantity);
             statement.setInt(7, avail);
             statement.setString(8, cate);
             statement.setString(9, lang);
             statement.setDate(10, (java.sql.Date) timePost);
             statement.setInt(11, price);
             statement.setString(12, shortDes);
             
           statement.executeUpdate();
          
       } catch (SQLException ex) {
        
       } 
     }
     
      public ArrayList<Book> paginationToId (int pageIndex, int pageSize ){
       ArrayList<Book> books = new ArrayList<>();
       try {
           String sql = "select * from\n" +
"(select ROW_NUMBER()  OVER (ORDER BY Id asc) as r, * from [Book]) as x\n" +
"where r between ? and ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, pageIndex*pageSize-(pageSize-1));
           statement.setInt(2, pageIndex*pageSize);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(2));
               b.setTitle(rs.getString(3));
               b.setPublisher(rs.getString(4));
               b.setYear(rs.getString(5));
               b.setPic(rs.getString(6));
               b.setShelfId(rs.getString(7));
               b.setQuantity(rs.getInt(8));
               b.setAvail(rs.getInt(9));
               b.setCategory(rs.getString(10));
               b.setLanguage(rs.getString(11));
               b.setTimePost(rs.getDate(12));
               b.setRental_price(rs.getLong(13));
               b.setShortDes(rs.getString(14));
               books.add(b);
           }
       } catch (SQLException ex) {
           
       }
       return books;
   }
   
       public ArrayList<Book> paginationBestSeller (int pageIndex, int pageSize ){
       ArrayList<Book> books = new ArrayList<>();
       try {
           String sql = "select * from\n" +
"(select ROW_NUMBER()  OVER (ORDER BY (Quantity-Availability) desc) as r, * from [Book]) as x\n" +
"where r between ? and ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, pageIndex*pageSize-(pageSize-1));
           statement.setInt(2, pageIndex*pageSize);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(2));
               b.setTitle(rs.getString(3));
               b.setPublisher(rs.getString(4));
               b.setYear(rs.getString(5));
               b.setPic(rs.getString(6));
               b.setShelfId(rs.getString(7));
               b.setQuantity(rs.getInt(8));
               b.setAvail(rs.getInt(9));
               b.setCategory(rs.getString(10));
               b.setLanguage(rs.getString(11));
               b.setTimePost(rs.getDate(12));
               b.setRental_price(rs.getLong(13));
               b.setShortDes(rs.getString(14));
               books.add(b);
           }
       } catch (SQLException ex) {
           
       }
       return books;
   }
      
       public ArrayList<Book> paginationToTimeOldest (int pageIndex, int pageSize ){
       ArrayList<Book> books = new ArrayList<>();
       try {
           String sql = "select * from\n" +
"(select ROW_NUMBER()  OVER (ORDER BY timePost asc) as r, * from [Book]) as x\n" +
"where r between ? and ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, pageIndex*pageSize-(pageSize-1));
           statement.setInt(2, pageIndex*pageSize);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(2));
               b.setTitle(rs.getString(3));
               b.setPublisher(rs.getString(4));
               b.setYear(rs.getString(5));
               b.setPic(rs.getString(6));
               b.setShelfId(rs.getString(7));
               b.setQuantity(rs.getInt(8));
               b.setAvail(rs.getInt(9));
               b.setCategory(rs.getString(10));
               b.setLanguage(rs.getString(11));
               b.setTimePost(rs.getDate(12));
               b.setRental_price(rs.getLong(13));
               b.setShortDes(rs.getString(14));
               books.add(b);
           }
       } catch (SQLException ex) {
           
       }
       return books;
   }
       
       public ArrayList<Book> paginationToTimeNewest (int pageIndex, int pageSize ){
       ArrayList<Book> books = new ArrayList<>();
       try {
           String sql = "select * from\n" +
"(select ROW_NUMBER()  OVER (ORDER BY timePost desc) as r, * from [Book]) as x\n" +
"where r between ? and ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, pageIndex*pageSize-(pageSize-1));
           statement.setInt(2, pageIndex*pageSize);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Book b = new Book();
               b.setId(rs.getInt(2));
               b.setTitle(rs.getString(3));
               b.setPublisher(rs.getString(4));
               b.setYear(rs.getString(5));
               b.setPic(rs.getString(6));
               b.setShelfId(rs.getString(7));
               b.setQuantity(rs.getInt(8));
               b.setAvail(rs.getInt(9));
               b.setCategory(rs.getString(10));
               b.setLanguage(rs.getString(11));
               b.setTimePost(rs.getDate(12));
               b.setRental_price(rs.getLong(13));
               b.setShortDes(rs.getString(14));
               books.add(b);
           }
       } catch (SQLException ex) {
           
       }
       return books;
   }
       
       public void deleteBook(int id){
           
       try {
           String sql ="delete from book where Id=?";
             PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1,id);
           statement.executeUpdate();
          
       } catch (SQLException ex) {
        
       } 
     }
    
       public void updateBook(int id, String title, String pub, int year,String pic, String shelfId, int quantity, int avail, String cate, String lang, int price, String shortDes){
         
       try {
           String sql ="update Book\n" +
"set Title=?, Publisher=?, Year=?, Pic=?, ShelfId=?, Quantity=?,\n" +
"Availability=?, CategoryId=?, Language=?, Rental_price=?, ShortDescription=?\n" +
"where Id=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, title);
             statement.setString(2, pub);
             statement.setInt(3, year);
             statement.setString(4, pic);
             statement.setString(5, shelfId);
             statement.setInt(6, quantity);
             statement.setInt(7, avail);
             statement.setString(8, cate);
             statement.setString(9, lang);
             statement.setInt(10, price);
             statement.setString(11, shortDes);
             statement.setInt(12, id);
             
           statement.executeUpdate();
          
       } catch (SQLException ex) {
        
       }}
       
       public void updateBookAvail(int id, int avail){
         
       try {
           String sql ="update Book\n" +
"set Availability=? where Id=?";
             PreparedStatement statement = connection.prepareStatement(sql);
            
             statement.setInt(1, avail);
         
             statement.setInt(2, id);
             
           statement.executeUpdate();
          
       } catch (SQLException ex) {
        
       } 
     }
       
       public int takeAvail(String id){
            try {
           String sql ="select Availability from Book where Id=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, id);
           ResultSet rs = statement.executeQuery();
           if(rs.next())
           {
              return rs.getInt(1);
           }
       } catch (SQLException ex) {
        
       }
       return -1;
       }
       
       public String takeBookName(String id){
            try {
           String sql ="select Title from Book where Id=?";
             PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, id);
           ResultSet rs = statement.executeQuery();
           if(rs.next())
           {
              return rs.getString(1);
           }
       } catch (SQLException ex) {
        
       }
       return "invalid ID";
       }
     
}
