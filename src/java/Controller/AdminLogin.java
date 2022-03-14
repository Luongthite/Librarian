/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.AdminDAO;
import DAL.MemberDAO;
import Model.Admin;
import Model.Member;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.print.Printer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AdminLogin", urlPatterns = {"/aLogin"})
public class AdminLogin extends HttpServlet {

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

        Cookie cookie[] = request.getCookies();
 
        if (cookie != null) {
            for (Cookie cookie1 : cookie) {
                if (cookie1.getName().equals("aID")) {
                    request.setAttribute("adminID", cookie1.getValue()); 
                  
                }
                if (cookie1.getName().equals("aPass")) {
                    request.setAttribute("adminPass", cookie1.getValue());
                
                }
                if (cookie1.getName().equals("uID")) {
                    request.setAttribute("userID", cookie1.getValue()); 
               
                }
                if (cookie1.getName().equals("uPass")) {
                    request.setAttribute("userPass", cookie1.getValue());
              
                }
            }
        }
      
request.getServletContext().getRequestDispatcher("/signIn.jsp").forward(request, response);
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
        String who = request.getParameter("submitB");
        String rememberMeAd = request.getParameter("rememberMeAd");
        String rememberMeU = request.getParameter("rememberMeU");

        if (who.equals("admin")) {
            String aID = request.getParameter("aID");
            String aPass = request.getParameter("aPass");

            AdminDAO m = new AdminDAO();
            Admin admin = m.getAdmin(aID, aPass);
            if (admin != null) {
                //            cookie
            Cookie aIDc = new Cookie("aID", aID);
            Cookie aPassc = new Cookie("aPass", aPass);
            aIDc.setMaxAge(60);
            if (rememberMeAd != null) {
                aPassc.setMaxAge(60);
            } else {
                aPassc.setMaxAge(0);
            }
            response.addCookie(aIDc);
            response.addCookie(aPassc);
            
            HttpSession session=request.getSession();
            session.setAttribute("acc", admin);
            
            
                request.getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "Password or Username invalid. Please re-login");
                request.getServletContext().getRequestDispatcher("/signIn.jsp").forward(request, response);
            }



        } else {
            String uID = request.getParameter("uID");
            String uPass = request.getParameter("uPass");

            MemberDAO m = new MemberDAO();
            Member member = new Member();
            member = m.getMember(uID, uPass);
            if (member != null) {
                 Cookie uIDc = new Cookie("uID", uID);
            Cookie uPassc = new Cookie("uPass", uPass);
            uIDc.setMaxAge(60);
            if (rememberMeU != null) {
                uPassc.setMaxAge(60);
            } else {
                uPassc.setMaxAge(0);
            }
            response.addCookie(uIDc);
            response.addCookie(uPassc);
            HttpSession session=request.getSession();
            session.setAttribute("acc", member);
                request.getRequestDispatcher("BookControl").forward(request, response);
            } else {

                request.setAttribute("message", "Password or Username invalid. Please re-login");
                request.getServletContext().getRequestDispatcher("/signIn.jsp").forward(request, response);
            }
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
