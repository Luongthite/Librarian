package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminSideBar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"sidebar\">\n");
      out.write("      <div class=\"logo_content\">\n");
      out.write("          <div class=\"logo\">\n");
      out.write("              <i class='bx bx-library'></i>\n");
      out.write("              <div class=\"logo_name\">\n");
      out.write("                  TEED LIBRARY\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <i class='bx bx-menu' id=\"btn\"></i>\n");
      out.write("      </div>\n");
      out.write("      <ul class=\"nav_list\">\n");
      out.write("        <li>\n");
      out.write("            <a href=\"admin.jsp\" >\n");
      out.write("                <i class='bx bx-id-card'></i>\n");
      out.write("                <span class=\"links_name\">My Profile</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">My Profile</span>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"aBookControl\">\n");
      out.write("                <i class='bx bxs-book' ></i>\n");
      out.write("                <span class=\"links_name\">Book Information</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">Book Information</span>\n");
      out.write("        </li>\n");
      out.write("<!--        <li>\n");
      out.write("            <a href=\"addBook.jsp\">\n");
      out.write("                <i class='bx bxs-book-add' ></i>\n");
      out.write("                <span class=\"links_name\">Add Book</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">Add Book</span>\n");
      out.write("        </li>-->\n");
      out.write("<!--        <li>\n");
      out.write("            <a href=\"sendMessage.jsp\">\n");
      out.write("                <i class='bx bx-chat' ></i>\n");
      out.write("                <span class=\"links_name\">Send Message</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">Send Message</span>\n");
      out.write("        </li>-->\n");
      out.write("        <li>\n");
      out.write("            <a href=\"member\">\n");
      out.write("                <i class='bx bxs-user-detail' ></i>\n");
      out.write("                <span class=\"links_name\">Manage User</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">Manage User</span>\n");
      out.write("        </li>\n");
      out.write("         <li>\n");
      out.write("            <a href=\"areq\">\n");
      out.write("                <i class='bx bx-book-reader' ></i>\n");
      out.write("                <span class=\"links_name\">Issue Request</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">Request</span>\n");
      out.write("        </li>\n");
      out.write("<!--        <li>\n");
      out.write("            <a href=\"recommendations.jsp\">\n");
      out.write("                <i class='bx bx-book-heart' ></i>\n");
      out.write("                <span class=\"links_name\">Recommendations</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">Recommendations</span>\n");
      out.write("        </li>-->\n");
      out.write("        <li>\n");
      out.write("            <a href=\"CurrentlyIssued\">\n");
      out.write("                <i class='bx bxs-edit-alt'></i>\n");
      out.write("                <span class=\"links_name\">Currently Issued Books</span>\n");
      out.write("            </a>\n");
      out.write("            <span class=\"tooltip\">Currently Issued</span>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("      <div class=\"profile_content\">\n");
      out.write("          <div class=\"profile\">\n");
      out.write("              <div class=\"profile_details\">\n");
      out.write("                  <img src=\"PHOTOS/reading1.jpg\" alt=\"\">\n");
      out.write("                  <div class=\"name_job\">\n");
      out.write("                      <div class=\"name\">\n");
      out.write("                          Admin 1\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"job\">Administrator</div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("              <a href=\"logout\"><i class='bx bx-log-out' id=\"log_out\" ></i></a>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
