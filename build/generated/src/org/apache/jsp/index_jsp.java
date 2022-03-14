package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>TEED Library</title>\n");
      out.write("    <!-- Import Boostrap css, js, font awesome here -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">       \n");
      out.write("      <link href=\"https://use.fontawesome.com/releases/v5.0.4/css/all.css\" rel=\"stylesheet\">    \n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\">\n");
      out.write("      </script>\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\">\n");
      out.write("      </script>\n");
      out.write("      <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("      <link href=\"CSS/style.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("<!-- Navigation -->\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-light bg-light sticky-top\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<a class=\"navbar-branch\" href=\"#\">\n");
      out.write("\t\t\t<img src=\"PHOTOS/TE ED library.png\" height=\"50\">\n");
      out.write("\t\t</a>\n");
      out.write("\n");
      out.write("<!-- <form>\n");
      out.write(" <select name=\"category\" id=\"category\">\n");
      out.write("   <option value=\"IT\" selected>IT</option>\n");
      out.write("  <option value=\"Marketing\">Marketing</option>\n");
      out.write("  <option value=\"Management Skill\">Management Skill</option>\n");
      out.write("  <option value=\"Self-help\">Self-help</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"text\" placeholder=\"Type in the book's name\">\n");
      out.write("  <input type=\"submit\" value=\"Search\" name=\"Search\">\n");
      out.write("</form> -->\n");
      out.write("\n");
      out.write("<!--<form class=\"form-inline\">\n");
      out.write("  <select name=\"category\" id=\"category\" class=\"form-control mr-sm-2\">\n");
      out.write("    <option value=\"IT\" selected>IT</option>\n");
      out.write("   <option value=\"Marketing\">Marketing</option>\n");
      out.write("   <option value=\"Management Skill\">Management Skill</option>\n");
      out.write("   <option value=\"Self-help\">Self-help</option>\n");
      out.write("   </select>\n");
      out.write("  <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("  <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\" style=\"border-color: white; color: white;\">Search</button>\n");
      out.write("</form>-->\n");
      out.write("\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" \n");
      out.write("\t\t\tdata-target=\"#navbarResponsive\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse menu\" id=\"navbarResponsive\">\n");
      out.write("\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t<a class=\"nav-link active\" href=\"#\">Home</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t<a class=\"nav-link\" href=\"#\">About</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t<a class=\"nav-link\" href=\"#\">Services</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t<a class=\"nav-link\" href=\"aLogin\">Login/ Sign up</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Carousel -->\n");
      out.write("<div id=\"slides\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t<ul class=\"carousel-indicators\">\n");
      out.write("\t\t<li data-target=\"#slides\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t<li data-target=\"#slides\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t<li data-target=\"#slides\" data-slide-to=\"2\"></li>\t\t\n");
      out.write("\t\t<li data-target=\"#slides\" data-slide-to=\"3\"></li>\n");
      out.write("\t</ul>\n");
      out.write("\t<div class=\"carousel-inner\">\n");
      out.write("\t\t<div class=\"carousel-item active\">\n");
      out.write("\t\t\t<img src=\"PHOTOS/reading1.jpg\">\n");
      out.write("\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t<h1 class=\"display-2\">TEED LIBRARY</h1>\n");
      out.write("\t\t\t\t<h3>A place of mind-blowing</h3>\n");
      out.write("        <br>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-outline-light btn-lg\">\n");
      out.write("\t\t\t\t\tVIEW BOOKS\n");
      out.write("\t\t\t\t</button>\n");
      out.write("        <a href=\"signIn.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Login</button></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t<img src=\"PHOTOS/reading2.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t<img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t<img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#slides\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#slides\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("<!-- jumbotron -->\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t<div class=\"jumbotron\">\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t<p>Welcome to the poorest library in the world. Here we have every books availabe in a minute, or not!</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-outline-secondary\">Explore Books</button>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"TOP 3 MOST BORROWED\">\n");
      out.write("<div class=\"container-fluid padding\">\n");
      out.write("  <!-- Top 3 best issued -->\n");
      out.write("\t<div class=\"row welcome text-center\">\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t<h1 class=\"display-4\">Top 3 Most Borrowed Books</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Horizontal Rule -->\n");
      out.write("\t\t<hr> \n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t<p>Let's take a look at our 3 \"Best-Seller\" Books</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- LIST 3 MOST BORROW BOOKS -->\n");
      out.write("<div class=\"container-fluid padding mostborrow\">\n");
      out.write("\t<div class=\"row text-center padding\">\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 \">\n");
      out.write("\t\t\t<img src=\"PHOTOS/reading1.jpg\" alt=\"1st book\">\t\n");
      out.write("\t\t\t<h3>BOOK1</h3>\n");
      out.write("\t\t\t<p>TAG1</p>\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-12 col-sm-6 col-md-4\">\n");
      out.write("      <img src=\"PHOTOS/reading2.jpg\" alt=\"1st book\">\t\t\n");
      out.write("\t\t\t<h3>BOOK2</h3>\n");
      out.write("\t\t\t<p>TAG2</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-12 col-md-4\">\n");
      out.write("      <img src=\"PHOTOS/reading3.jpg\" alt=\"1st book\">\t\n");
      out.write("\t\t\t<h3>BOOK3</h3>\n");
      out.write("\t\t\t<p>TAG3</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("\t<hr class=\"my-4\">\t\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Hot IT Books -->\n");
      out.write("<div class=\"container-fluid padding\">\n");
      out.write("\t<div class=\"row padding\">\n");
      out.write("\t\t<div class=\"col-md-12 col-lg-6 text-center\">\n");
      out.write("      <br>\n");
      out.write("      <h2>Hot IT Books</h2>\n");
      out.write("      <br>\n");
      out.write("\t\t\t<p>Wanna become a fullstack developer in just 1 day?</p>\n");
      out.write("      <p>Wanna fulfill your dream of indulging the world into automation and robotics?</p>\n");
      out.write("\t\t\t<p>Or just simply wanna hack NASA by HTML?</p>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <h4><span class=\"badge badge-warning\">Warning</span> These are must-read books!</h4>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t<!-- carousel book -->\n");
      out.write("      <div id=\"hotIT\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ul class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#hotIT\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#hotIT\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#hotIT\" data-slide-to=\"2\"></li>\t\t\n");
      out.write("          <li data-target=\"#hotIT\" data-slide-to=\"3\"></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"carousel-item active\">\n");
      out.write("            <img src=\"PHOTOS/reading1.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading2.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#hotIT\" data-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#hotIT\" data-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<!-- Hot Marketing Books -->\n");
      out.write("<div class=\"container-fluid padding\">\n");
      out.write("\t<div class=\"row padding\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t<!-- carousel book -->\n");
      out.write("      <div id=\"hotMa\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ul class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#hotMa\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#hotMa\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#hotMa\" data-slide-to=\"2\"></li>\t\t\n");
      out.write("          <li data-target=\"#hotMa\" data-slide-to=\"3\"></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"carousel-item active\">\n");
      out.write("            <img src=\"PHOTOS/reading1.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading2.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#hotMa\" data-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#hotMa\" data-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\t\t</div>\n");
      out.write("    <div class=\"col-md-12 col-lg-6 text-center\">\n");
      out.write("      <br>\n");
      out.write("      <h2>Hot Marketing Books</h2>\n");
      out.write("      <br>\n");
      out.write("\t\t\t<p>Wanna become a fullstack developer in just 1 day?</p>\n");
      out.write("      <p>Wanna fulfill your dream of indulging the world into automation and robotics?</p>\n");
      out.write("\t\t\t<p>Or just simply wanna hack NASA by HTML?</p>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <h4><span class=\"badge badge-warning\">Warning</span> These are must-read books!</h4>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<!-- Hot Self-help Books -->\n");
      out.write("<div class=\"container-fluid padding\">\n");
      out.write("\t<div class=\"row padding\">\n");
      out.write("\t\t<div class=\"col-md-12 col-lg-6 text-center\">\n");
      out.write("      <br>\n");
      out.write("      <h2>Hot Self-help Books</h2>\n");
      out.write("      <br>\n");
      out.write("\t\t\t<p>Wanna become a fullstack developer in just 1 day?</p>\n");
      out.write("      <p>Wanna fulfill your dream of indulging the world into automation and robotics?</p>\n");
      out.write("\t\t\t<p>Or just simply wanna hack NASA by HTML?</p>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <h4><span class=\"badge badge-warning\">Warning</span> These are must-read books!</h4>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t<!-- carousel book -->\n");
      out.write("      <div id=\"hotSe\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ul class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#hotSe\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#hotSe\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#hotSe\" data-slide-to=\"2\"></li>\t\t\n");
      out.write("          <li data-target=\"#hotSe\" data-slide-to=\"3\"></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"carousel-item active\">\n");
      out.write("            <img src=\"PHOTOS/reading1.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading2.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"PHOTOS/reading3.jpg\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <a href=\"#\"><button type=\"button\" class=\"btn btn-primary btn-lg\">Request an issue</button></a>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#hotSe\" data-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#hotSe\" data-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<hr class=\"my-2\">\n");
      out.write("<!-- <button class=\"fun\" data-toggle=\"collapse\" data-target=\"#emoji\">\n");
      out.write("\tClick for fun\n");
      out.write("</button>\n");
      out.write("<div id=\"emoji\" class=\"collapse\">\n");
      out.write("\t<div class=\"container-fluid padding\">\n");
      out.write("\t\t<div class=\"row text-center\">\n");
      out.write("\t\t\t<div class=\"col-sm-6 col-md-3\">\n");
      out.write("\t\t\t\t<img class=\"gif\" src=\"./images/gif/blinkEyes.gif\" width=\"100\" height=\"100\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-6 col-md-3\">\n");
      out.write("\t\t\t\t<img class=\"gif\" src=\"./images/gif/blinkGirl.gif\" width=\"100\" height=\"100\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-6 col-md-3\">\n");
      out.write("\t\t\t\t<img class=\"gif\" src=\"./images/gif/faceHaha.gif\" width=\"100\" height=\"100\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-6 col-md-3\">\n");
      out.write("\t\t\t\t<img class=\"gif\" src=\"./images/gif/haha.gif\" width=\"100\" height=\"100\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div> -->\n");
      out.write(" \n");
      out.write("<!-- Team member -->\n");
      out.write("<div class=\"container-fluid padding\">\n");
      out.write("\t<div class=\"row welcome text-center\">\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("      <br>\n");
      out.write("\t\t\t<h1 class=\"display-4\">Benefits of Membership</h1>\n");
      out.write("      <br><br>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid padding\">\n");
      out.write("\t<div class=\"row padding container-fluid\">\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t<img class=\"card-img-top\" src=\"PHOTOS/reading1.jpg\">\n");
      out.write("\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t<h4 class=\"card-title\">Zero-fee book events</h4>\n");
      out.write("\t\t\t\t\t<p class=\"card-text\">Each month, 3 voluntary members go on stage sharing what they learn from books; and organize \n");
      out.write("            debates.\n");
      out.write("          </p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t<img class=\"card-img-top\" src=\"PHOTOS/reading2.jpg\">\n");
      out.write("\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\tFree Unlimited access to books\t\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t<p class=\"card-text\">We have over 1,000,000 paper books and 3,700,000 ebooks availabe for our members</p>\n");
      out.write("\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t<img class=\"card-img-top\" src=\"PHOTOS/reading3.jpg\">\n");
      out.write("\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t<h4 class=\"card-title\">\n");
      out.write("\t\t\t\t\t\tDiverse kinds of documents\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t<p class=\"card-text\">From historical, documentary, geographical to non-scientific, romantic and etc types of contents are available </p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid padding\">\n");
      out.write("\t<div class=\"row padding login_signup text-center\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("      <img src=\"https://live.staticflickr.com/7306/26816592484_2ab3e30843_b.jpg\" alt=\"\" class=\"bg\">\n");
      out.write("      <br>\n");
      out.write("      <div class=\"content\">\t<h2>Open a membership plan</h2>\n");
      out.write("        <p>All our work is for customer satisfaction with high quality Services</p>\n");
      out.write("        <p>\n");
      out.write("          <a href=\"signIn.jsp\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary btn-lg\">\n");
      out.write("              Login/ Sign up</button>\n");
      out.write("          </a>\n");
      out.write("        </p>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<hr class=\"my-4\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- contact us -->\n");
      out.write("<div class=\"container-fluid padding\">\t\n");
      out.write("\t<div class=\"row text-center padding\">\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t<h2>Contact us</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-12 social padding\">\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("    <br><br>\n");
      out.write("\t</div>\n");
      out.write("</div>\t\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer>\n");
      out.write("\t<div class=\"container-fluid padding\">\t\n");
      out.write("\t\t<div class=\"row text-center\">\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<img src=\"PHOTOS/TE ED library.png\">\n");
      out.write("\t\t\t\t<hr class=\"light\">\n");
      out.write("\t\t\t\t<p>111-222-3333</p>\n");
      out.write("\t\t\t\t<p>anhlnhe163541@fpt.edu.vn</p>\n");
      out.write("\t\t\t\t<p>Cao Bang, Vietnam</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\t\t\t\t\n");
      out.write("\t\t\t\t<hr class=\"light\">\n");
      out.write("\t\t\t\t<h5>Working hours</h5>\n");
      out.write("\t\t\t\t<hr class=\"light\">\n");
      out.write("\t\t\t\t<p>Monday-Friday: 8am - 5pm</p>\n");
      out.write("\t\t\t\t<p>Weekend: 8am - 9pm</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\t\t\t\t\n");
      out.write("\t\t\t\t<hr class=\"light\">\n");
      out.write("\t\t\t\t<h5>Services</h5>\n");
      out.write("\t\t\t\t<hr class=\"light\">\n");
      out.write("\t\t\t\t<p>Outsourcing</p>\n");
      out.write("\t\t\t\t<p>Website development</p>\n");
      out.write("\t\t\t\t<p>Mobile applications</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t<hr class=\"light-100\">\n");
      out.write("\t\t\t\t<h5>&copy; TEED Library 2022</h5>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\t\n");
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
