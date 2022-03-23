/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Issued {
    private String memberId;
    private int bookId;
    private String adminId;
    private Date dateOfIssue;
    private Date dateOfReturn;
    private Date actualReturnDate;
    private long fine;
    private boolean empty;
   

    public Issued(String memberId, int bookId, String adminId, Date dateOfIssue, Date dateOfReturn, Date actualReturnDate, long fine) {
        this.memberId = memberId;
        this.bookId = bookId;
        this.adminId = adminId;
        this.dateOfIssue = dateOfIssue;
        this.dateOfReturn = dateOfReturn;
        this.actualReturnDate = actualReturnDate;
        this.fine = fine;
    }

    public Issued() {
    }

    public String getMemberId() {
        return memberId;
    }
    
     public boolean isEmpty(){
        if(dateOfReturn==null)
            return true;
        return false;
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

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Date getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public long getFine() {
        return fine;
    }

    public void setFine(long fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Issued{" + "memberId=" + memberId + ", bookId=" + bookId + ", adminId=" + adminId + ", dateOfIssue=" + dateOfIssue + ", dateOfReturn=" + dateOfReturn + ", actualReturnDate=" + actualReturnDate + ", fine=" + fine + '}';
    }
    
    
    
}
