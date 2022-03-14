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
public class Member {
   private String id;
   private String password;
   private String name;
   private String Address;
   private Date MemberRegistrationDate;
   private Date MemberRegistrationExpDate;
   private String email;
   private String phoneNumber;
   private String cardNumber;
   private String CardExpDate;
   private int CVC;

    public Member() {
    }

    public Member(String id, String password, String name, String Address, Date MemberRegistrationDate, Date MemberRegistrationExpDate, String email, String phoneNumber, String cardNumber, String CardExpDate, int CVC) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.Address = Address;
        this.MemberRegistrationDate = MemberRegistrationDate;
        this.MemberRegistrationExpDate = MemberRegistrationExpDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.CardExpDate = CardExpDate;
        this.CVC = CVC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getMemberRegistrationDate() {
        return MemberRegistrationDate;
    }

    public void setMemberRegistrationDate(Date MemberRegistrationDate) {
        this.MemberRegistrationDate = MemberRegistrationDate;
    }

    public Date getMemberRegistrationExpDate() {
        return MemberRegistrationExpDate;
    }

    public void setMemberRegistrationExpDate(Date MemberRegistrationExpDate) {
        this.MemberRegistrationExpDate = MemberRegistrationExpDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpDate() {
        return CardExpDate;
    }

    public void setCardExpDate(String CardExpDate) {
        this.CardExpDate = CardExpDate;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    
   @Override
   public String toString(){
  return String.format("%-10s\t%-10s\t%-30s\t%-10s\t%-10s\t%-30s\t%-30s\t%-10s\t%-10s\t%-10s\t%-10s", id, password, name,Address,MemberRegistrationDate,MemberRegistrationExpDate,email,phoneNumber,cardNumber,CardExpDate,CVC);
   }
}
