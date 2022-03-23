/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.BookDAO;
import DAL.IssuedDAO;
import DAL.RequestDAO;
import Model.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "editReturnDate", urlPatterns = {"/editReturn"})
public class editReturnDate extends HttpServlet {

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
            String memberId=request.getParameter("memberId");
             String bookId1=request.getParameter("bookId");
        String adminId=request.getParameter("adminId");
       String dateOfIssue=request.getParameter("dateOfIssued");
       String actualReturnDate=request.getParameter("actualReturnDate");
       String fine=request.getParameter("fine");
        String dateOfReturn=request.getParameter("dateOfReturn");
        request.setAttribute("memberId", memberId);
        request.setAttribute("adminId", adminId);
           request.setAttribute("bookId", bookId1);
        request.setAttribute("dateOfIssued", dateOfIssue);
        request.setAttribute("actualReturnDate", actualReturnDate);
        request.setAttribute("fine", fine);
        request.setAttribute("dateOfReturn", dateOfReturn);
        request.getRequestDispatcher("editReturn.jsp").forward(request, response);
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
                       String memberId=request.getParameter("memberId");
             String bookId1=request.getParameter("bookId");
        String adminId=request.getParameter("adminId");
       String dateOfIssue=request.getParameter("dateOfIssued");
       String actualReturnDate=request.getParameter("actualReturnDate");
       String fine=request.getParameter("fine");
        String dateOfReturn=request.getParameter("dateOfReturn");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet linhtinh</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet linhtinh at " + bookId1 +memberId+ dateOfIssue+"</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
       int bookId=Integer.parseInt(bookId1);   
       HttpSession session=request.getSession();
       Admin a=(Admin) session.getAttribute("acc");
       RequestDAO rdao=new RequestDAO();
       rdao.delReq(memberId, bookId);
       
       SimpleDateFormat formDate = new SimpleDateFormat("yyyy-MM-dd");
//      String strDate = formDate.format(dateOfIssue);
       Date date=null;
       Date date2=null;
       Date date3=null;
        try {
             date=formDate.parse(dateOfIssue);
             date3=formDate.parse(dateOfReturn);
             date2=formDate.parse(actualReturnDate);
             
        } catch (Exception ex) {
            
        }
        java.sql.Date dateOfIssued = new java.sql.Date(date.getTime()); 
        java.sql.Date returnDate1=new java.sql.Date(date3.getTime());
//        Calendar c = Calendar.getInstance();
//c.setTime(new Date()); // Using today's date
//c.add(Calendar.DATE, 30); // Adding 5 days
//String output = formDate.format(c.getTime());
//
//Date date2=null;
//        try {
//             date2=formDate.parse(output);
//        } catch (Exception ex) {
//            
//        }

java.sql.Date returnDate2=new java.sql.Date(date2.getTime());

       IssuedDAO idao=new IssuedDAO();
    idao.editIssued(memberId, Integer.parseInt(bookId1), adminId, dateOfIssued, returnDate1, returnDate2, Integer.parseInt(fine));
       response.sendRedirect("CurrentlyIssued");
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
