/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.IssuedDAO;
import DAL.RequestDAO;
import Model.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AcceptRequest", urlPatterns = {"/AcceptRequest"})
public class AcceptRequest extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
       int bookId=Integer.parseInt(request.getParameter("bookId"));
       String memberId=request.getParameter("memberId");
       HttpSession session=request.getSession();
       Admin a=(Admin) session.getAttribute("acc");
       RequestDAO rdao=new RequestDAO();
       rdao.delReq(memberId, bookId);
       
       SimpleDateFormat formDate = new SimpleDateFormat("yyyy-MM-dd");
      String strDate = formDate.format(new Date());
       Date date=null;
        try {
             date=formDate.parse(strDate);
        } catch (Exception ex) {
            
        }
        java.sql.Date dateOfIssued = new java.sql.Date(date.getTime()); 
        Calendar c = Calendar.getInstance();
c.setTime(new Date()); // Using today's date
c.add(Calendar.DATE, 30); // Adding 5 days
String output = formDate.format(c.getTime());

Date date2=null;
        try {
             date2=formDate.parse(strDate);
        } catch (Exception ex) {
            
        }

java.sql.Date dateOfReturn=new java.sql.Date(date2.getTime());

       IssuedDAO idao=new IssuedDAO();
       idao.addIssued(memberId, bookId, a.getId(), dateOfIssued, dateOfReturn, null, 0);
       
       response.sendRedirect("areq");
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AcceptRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AcceptRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
