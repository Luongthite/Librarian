/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.MemberDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "UserSignUpController", urlPatterns = {"/USignUp"})
public class UserSignUpController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String Id= request.getParameter("SignID");
       String name=request.getParameter("Name");
       String password=request.getParameter("SignPassword");
       String rePass=request.getParameter("SignRePassword");
       String address=request.getParameter("Address");
       String Email=request.getParameter("Email");
       String phoneNumber=request.getParameter("PhoneNumber");
       String cardNum=request.getParameter("CardNumber");
       String CardExp=request.getParameter("CardExp");
       
       SimpleDateFormat month_date = new SimpleDateFormat("MM/yy");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
Date date1 = null;
        try {
            date1 = sdf.parse(CardExp);
        } catch (ParseException ex) {
            Logger.getLogger(UserSignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
String month_name = month_date.format(date1);
       
       
       int CVC=Integer.parseInt(request.getParameter("CVC"));
//      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        Calendar cal = Calendar.getInstance();
//        Date date = cal.getTime();
//        String todaysdate = dateFormat.format(date);
        
        MemberDAO m=new MemberDAO();
        if(password.equals(rePass)){
             m.addMember(Id, password, name, address , Email, phoneNumber, cardNum, month_name, CVC);
        request.setAttribute("alert", "Successfully create account. Please login!");
        
        }else{
            request.setAttribute("alert", "Different Password field");
        }
       request.getServletContext().getRequestDispatcher("/signIn.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
