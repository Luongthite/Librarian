package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Issued;
import Model.Book;
import java.util.ArrayList;
import DAL.BookDAO;

public final class myRec_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/tlds/pageTag.tld");
    _jspx_dependants.add("/WEB-INF/tlds/getBookById.tld");
  }

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

      out.write("ArrayList<Issued>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Fashi Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Fashi, unica, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>TE ED LIBRARY</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/themify-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/shop.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Page Preloder -->\n");
      out.write("        <div id=\"preloder\">\n");
      out.write("            <div class=\"loader\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("    <div class=\"breacrumb-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"breadcrumb-text product-more\">\n");
      out.write("                        <a href=\"./home.html\"><i class=\"fa fa-home\"></i> Home</a>\n");
      out.write("                        <a href=\"./shop.html\">Shop</a>\n");
      out.write("                        <span>Book Mark List</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("\n");
      out.write("    <!-- Shopping Cart Section Begin -->\n");
      out.write("    <section class=\"shopping-cart spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"cart-table\">\n");
      out.write("                        <form action=\"memRec\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr><TD>Book Name:</TD>\n");
      out.write("                                <TD><input type=\"text\" name=\"bookName\"></TD>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr><TD>Book Pic URL:</TD>\n");
      out.write("                                <TD><input type=\"text\" name=\"bookPic\"></TD>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr><TD>Book Author:</TD>\n");
      out.write("                                <TD><input type=\"text\" name=\"author\"></TD>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Description:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"des\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                            </form>\n");
      out.write("                    </div>\n");
      out.write("<!--                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4\">\n");
      out.write("                            <div class=\"cart-buttons\">\n");
      out.write("                                <a href=\"#\" class=\"primary-btn continue-shop\">Continue shopping</a>\n");
      out.write("                                <a href=\"#\" class=\"primary-btn up-cart\">Update cart</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"discount-coupon\">\n");
      out.write("                                <h6>Discount Codes</h6>\n");
      out.write("                                <form action=\"#\" class=\"coupon-form\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Enter your codes\">\n");
      out.write("                                    <button type=\"submit\" class=\"site-btn coupon-btn\">Apply</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 offset-lg-4\">\n");
      out.write("                            <div class=\"proceed-checkout\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"subtotal\">Subtotal <span>$240.00</span></li>\n");
      out.write("                                    <li class=\"cart-total\">Total <span>$240.00</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <a href=\"#\" class=\"proceed-btn\">PROCEED TO CHECK OUT</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Shopping Cart Section End -->\n");
      out.write("\n");
      out.write("        <!-- Footer Section Begin -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("        <!-- Js Plugins -->\n");
      out.write("        <script src=\"JS/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"JS/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"JS/jquery-ui.min.js\"></script>\n");
      out.write("        <script src=\"JS/jquery.countdown.min.js\"></script>\n");
      out.write("        <script src=\"JS/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"JS/jquery.zoom.min.js\"></script>\n");
      out.write("        <script src=\"JS/jquery.dd.min.js\"></script>\n");
      out.write("        <script src=\"JS/jquery.slicknav.js\"></script>\n");
      out.write("        <script src=\"JS/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"JS/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
