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
public class Book {
    private int id;
    private String title;
    private String publisher;
    private String year;
    private String pic;
    private String shelfId;
    private int quantity;
    private int avail;
    private String Category;
    private String Language;
    private Date timePost;
    private long rental_price;
    private String shortDes;
    private String shortDesShort;

    public Book() {
    }

    public Book(int id, String title, String publisher, String year, String pic, String shelfId, int quantity, int avail, String Category, String Language, Date timePost, long rental_price, String shortDes) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.pic = pic;
        this.shelfId = shelfId;
        this.quantity = quantity;
        this.avail = avail;
        this.Category = Category;
        this.Language = Language;
        this.timePost = timePost;
        this.rental_price = rental_price;
        this.shortDes = shortDes;
    }

    public String getShortDesShort() {
        return shortDes.substring(0,(shortDes.length()>=24)?24:shortDes.length()/2)+"...";
    }

    public void setShortDesShort(String shortDesShort) {
        this.shortDesShort = shortDesShort;
    }

    
    
    
    public String getShortDes() {
        return shortDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public Date getTimePost() {
        return timePost;
    }

    public void setTimePost(Date timePost) {
        this.timePost = timePost;
    }

    public long getRental_price() {
        return rental_price;
    }

    public void setRental_price(long rental_price) {
        this.rental_price = rental_price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", publisher=" + publisher + ", year=" + year + ", pic=" + pic + ", shelfId=" + shelfId + ", quantity=" + quantity + ", avail=" + avail + ", Category=" + Category + ", Language=" + Language + ", timePost=" + timePost + ", rental_price=" + rental_price + '}';
    }
    
    
}
