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
public class Request {
    private String memberId;
    private int bookId;
    private String type;
    private String status;
    private String title;
    private int avail;
    private long rentalPrice;

    public Request() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public long getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(long rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Request(String memberId, int bookId, String type, String status, String title, int avail, long rentalPrice) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.type = type;
        this.status = status;
        this.title = title;
        this.avail = avail;
        this.rentalPrice = rentalPrice;
    }

  
   
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Request{" + "memberId=" + memberId + ", bookId=" + bookId + ", type=" + type + ", status=" + status + ", title=" + title + ", avail=" + avail + ", rentalPrice=" + rentalPrice + '}';
    }

  
    
    
}
