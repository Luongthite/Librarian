/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Recommendation {
    private String memberId;
    private String bookName;
    private String des;
    private String status;
    private int id;
    private String bookPic;
    private String author;

    public Recommendation(String memberId, String bookName, String des, String status, int id, String bookPic, String author) {
        this.memberId = memberId;
        this.bookName = bookName;
        this.des = des;
        this.status = status;
        this.id = id;
        this.bookPic = bookPic;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Recommendation{" + "memberId=" + memberId + ", bookName=" + bookName + ", des=" + des + ", status=" + status + ", id=" + id + ", bookPic=" + bookPic + ", author=" + author + '}';
    }

    public String getBookPic() {
        return bookPic;
    }

    public void setBookPic(String bookPic) {
        this.bookPic = bookPic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public Recommendation() {
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
