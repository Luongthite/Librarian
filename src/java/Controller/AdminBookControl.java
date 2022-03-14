/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.BookDAO;
import DAL.CategoryDAO;
import Model.Book;
import Model.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AdminBookControl", urlPatterns = {"/aBookControl"})
public class AdminBookControl extends HttpServlet {

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
         BookDAO bdao = new BookDAO();
      CategoryDAO cdao = new CategoryDAO();
        //        pager
        String page = request.getParameter("page");
        int pageIndex;
        if (page == null) {
            pageIndex = 1;
        } else {
            pageIndex = Integer.parseInt(page);
        }
        request.setAttribute("mess", pageIndex + "");

        String pageS = request.getParameter("pageSize");
        int pageSize;
        if (pageS == null) {
            pageSize = 10;
        } else {
            pageSize = Integer.parseInt(pageS);
        }
        int totalRow = bdao.count();
        int endPage = (totalRow % pageSize == 0) ? (totalRow / pageSize) : (totalRow / pageSize + 1);

        request.setAttribute("endPage", endPage);
        request.setAttribute("pageIndex", pageIndex);
        request.setAttribute("pageSize", pageSize);

      
        ArrayList<Book> listPage=bdao.paginationToTimeNewest(pageIndex, pageSize);
String urll = request.getParameter("urll");
request.setAttribute("urll", urll);

        request.setAttribute("listPage", listPage);
        ArrayList<Category> cates = cdao.getAll();
        request.setAttribute("categoryList", cates);


        int countBook = bdao.count();
        request.setAttribute("countBook", countBook);
        

        request.getRequestDispatcher("adminBook.jsp").forward(request, response);

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
