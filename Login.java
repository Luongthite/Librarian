/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author Admin
 */
public class Login extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        response.sendRedirect("Login.jsp");
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
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        String remember = request.getParameter("remember");
        AccountDAO acc = new AccountDAO();
        Account ac = acc.getAccountByUserName(username);
        PrintWriter out = response.getWriter();
        if (ac != null) {

            if (ac.getPassword().equals(password)) {

                Cookie userC = new Cookie("userC", username);
                Cookie passC = new Cookie("passC", password);

//                session.setAttribute("displayN", ac.getDisplayName());
                if (remember == null) {
                    userC.setMaxAge(0);
                    passC.setMaxAge(0);
                } else {
                    userC.setMaxAge(3600 * 24 * 30);
                    passC.setMaxAge(3600 * 24 * 30);
                    response.addCookie(passC);
                    response.addCookie(userC);
                }
                HttpSession session = request.getSession();
            session.setAttribute("account", ac);
            request.getServletContext().getRequestDispatcher("/Detail.jsp").forward(request, response);
//                Cookie[] cookies = request.getCookies();
//                if (cookies != null) {
//                    for (Cookie cooky : cookies) {
//                        if (cooky.getName().equals("userC")) {
//                            session.setAttribute("displayN", ac.getDisplayName());
//                        } else {
//                            out.println(cooky.getName());
//                        }
//                    }
//                    out.print(" DHS ak");
//                } else {
//                    session.setAttribute("displayN", null);
//                    out.print(" Null nekkkkk");
//                }
//                out.print((String) session.getAttribute("displayN"));

            } else {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<body>");
                out.println("<p>Password not valid" + "</p>");
                out.println("<a href=\"Login\">Re-Login</a>");
                out.println("</body>");
                out.println("</html>");

            }
        } else {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<p>Username not existed" + "</p>");
            out.println("<a href=\"Login\">Re-Login</a>");
            out.println("</body>");
            out.println("</html>");

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
