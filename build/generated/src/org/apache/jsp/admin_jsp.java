package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>TEED Admin</title>\r\n");
      out.write("    <!-- Import Boostrap css, js, font awesome here -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">       \r\n");
      out.write("      <link href=\"https://use.fontawesome.com/releases/v5.0.4/css/all.css\" rel=\"stylesheet\">    \r\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\">\r\n");
      out.write("      </script>\r\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\">\r\n");
      out.write("      </script>\r\n");
      out.write("      <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("      <link href=\"CSS/home.css\" rel=\"stylesheet\">\r\n");
      out.write("      <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("      <script src=\"js/index.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminSideBar.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("<div class=\"home_content\">\r\n");
      out.write("     <div id=\"main\">\r\n");
      out.write("      <div class=\"headerhome row\" >\r\n");
      out.write("    <h2 style=\"padding-left: 10%; display: flexbox; float: right;\" >MY PROFILE</h2>\r\n");
      out.write("   </div>\r\n");
      out.write("    <hr class=\"my-4\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("      <!-- My Profile -->\r\n");
      out.write("      <div class=\"container-fluid d-flex justify-content-center myprofile\">\r\n");
      out.write("          <div class=\"col-xs-12 col-sm-6 col-md-5\" style=\"box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);\" >\r\n");
      out.write("              <div class=\"text-center\" style=\"padding: 5%;\"> <img src=\"PHOTOS/reading1.jpg\" width=\"200\" height=\"200\" class=\"rounded-circle\" \">\r\n");
      out.write("                  <h3 class=\"mt-2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3> <span class=\"mt-1 clearfix\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                 \r\n");
      out.write("                  <hr class=\"line\"> <small class=\"mt-4\">I am a Librarian at TEED Library. I love reading books</small>\r\n");
      out.write("      \r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\" col-xs-12 col-sm-6 col-md-7\" style=\"margin-top: 20px;\"> \r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Full Name</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Email</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Phone</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.getPhoneNumber()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("<!--                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Mobile</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      (320) 380-4539\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>-->\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <h6 class=\"mb-0\">Address</h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\r\n");
      out.write("                      ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                      <a style=\"color: white;\" class=\"btn btn-block \" target=\"__blank\" href=\"https://www.bootdey.com/snippets/view/profile-edit-data-and-skills\">Edit</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("             \r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  let btn=document.querySelector(\"#btn\");\r\n");
      out.write("  let sidebar=document.querySelector(\".sidebar\");\r\n");
      out.write("\r\n");
      out.write("  btn.onclick=function(){\r\n");
      out.write("      sidebar.classList.toggle(\"active\");\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
