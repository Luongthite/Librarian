package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/pageTag.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>TEED Admin</title>\r\n");
      out.write("        <!-- Import Boostrap css, js, font awesome here -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">       \r\n");
      out.write("        <link href=\"https://use.fontawesome.com/releases/v5.0.4/css/all.css\" rel=\"stylesheet\">    \r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link href=\"CSS/home.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("        <script src=\"js/index.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div style=\"overflow: scroll; height : 90%; max-height:750px\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminSideBar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--<div class=\"home_content\">\r\n");
      out.write("            <div id=\"main\">\r\n");
      out.write("                <div class=\"headerhome row\">\r\n");
      out.write("                <h2 style=\"padding-left: 10%; display: flexbox; float: right;\" >BOOK INFORMATION</h2>\r\n");
      out.write("             </div>\r\n");
      out.write("              <hr class=\"my-4\">\r\n");
      out.write("                 My Book \r\n");
      out.write("                <div class=\"container d-flex justify-content-center headercontent\">\r\n");
      out.write("                    <table class=\"table-striped table-bordered\" width=\"100%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                ID\r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Name\r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Publisher\r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Year\r\n");
      out.write("                            </th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                12344\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                The Theory of Me\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                NXB Tre\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                2022\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("        </div>-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"table-wrapper\">\r\n");
      out.write("                <div class=\"table-title\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-6\" style=\"padding-top: 40px\">\r\n");
      out.write("                            <h2>Manage <b>Books</b></h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6\" style=\"padding-top: 40px\">\r\n");
      out.write("                            <a href=\"#addEmployeeModal\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i> <span>Add New Book</span></a>\t\t\t\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <table class=\"table table-striped table-hover\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <!--\t\t\t\t\t\t<th>\r\n");
      out.write("                                                                                    <span class=\"custom-checkbox\">\r\n");
      out.write("                                                                                            <input type=\"checkbox\" id=\"selectAll\">\r\n");
      out.write("                                                                                            <label for=\"selectAll\"></label>\r\n");
      out.write("                                                                                    </span>\r\n");
      out.write("                                                                            </th>-->\r\n");
      out.write("                            <th>ID</th>\r\n");
      out.write("                            <th>Title</th>\r\n");
      out.write("                            <th>Publisher</th>\r\n");
      out.write("                            <th>Year</th>\r\n");
      out.write("                            <th>ShelfId</th>\r\n");
      out.write("                            <th>Quantity</th>\r\n");
      out.write("                            <th>Availability</th>\r\n");
      out.write("                            <th>CategoryId</th>\r\n");
      out.write("                            <th>Language</th>\r\n");
      out.write("                            <th>Time Post</th>\r\n");
      out.write("                            <th>Rental Price</th>\r\n");
      out.write("                            <th>Short Description</th>\r\n");
      out.write("                            \r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("                <div class=\"clearfix\">\r\n");
      out.write("                    <div class=\"hint-text\">Showing <input name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> out of <b>25</b> entries</div>\r\n");
      out.write("                    <ul class=\"pagination\">\r\n");
      out.write("                        ");
      if (_jspx_meth_pager_PagerAdmin_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Edit Modal HTML -->\r\n");
      out.write("        <div id=\"addEmployeeModal\" class=\"modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <form action=\"add\">\r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Add Book</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Title</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"title\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Publisher</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"publisher\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Year</label>\r\n");
      out.write("                               <input type=\"number\" class=\"form-control\" name=\"year\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                <label>Photos URL</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"pic\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>ShelfId</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"shelfId\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Quantity</label>\r\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"quantity\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Category</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"category\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Language</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"language\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Rental Price</label>\r\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"price\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                <label>Short Description</label>\r\n");
      out.write("                                <textarea class=\"form-control\" name=\"shortDes\" required></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Edit Modal HTML -->\r\n");
      out.write("        <div id=\"editEmployeeModal\" class=\"modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <form action=\"update\">\r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Edit Book</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Title</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"title\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Publisher</label>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"publisher\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Year</label>\r\n");
      out.write("                               <input type=\"number\" class=\"form-control\" name=\"year\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                <label>Photos URL</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"pic\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>ShelfId</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"shelfId\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Quantity</label>\r\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"quantity\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                               <label>Category</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"category\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Language</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"language\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Rental Price</label>\r\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"price\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                <label>Short Description</label>\r\n");
      out.write("                                <textarea class=\"form-control\" name=\"shortDes\" required></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Delete Modal HTML -->\r\n");
      out.write("<!--        <div id=\"deleteEmployeeModal\" class=\"modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <form action=\"delete\">\r\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                            <h4 class=\"modal-title\">Delete Book</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                            <p>Are you sure you want to delete this Book?</p>\r\n");
      out.write("                            <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>-->\r\n");
      out.write("</div>\r\n");
      out.write("        <script>\r\n");
      out.write("            let btn = document.querySelector(\"#btn\");\r\n");
      out.write("            let sidebar = document.querySelector(\".sidebar\");\r\n");
      out.write("\r\n");
      out.write("            btn.onclick = function () {\r\n");
      out.write("                sidebar.classList.toggle(\"active\");\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("l");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("<!--                            <td>\r\n");
          out.write("                                <span class=\"custom-checkbox\">\r\n");
          out.write("                                    <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\r\n");
          out.write("                                    <label for=\"checkbox1\"></label>\r\n");
          out.write("                                </span>\r\n");
          out.write("                            </td>-->\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.publisher}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.shelfId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.avail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.timePost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.rental_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.getShortDesShort()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                </td>\r\n");
          out.write("                            \r\n");
          out.write("                            \r\n");
          out.write("                            <td>\r\n");
          out.write("                                <a href=\"loadBook?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\"><i class=\"fa fa-plus\" aria-hidden=\"true\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\r\n");
          out.write("                                <a href=\"delete?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" ><i class=\"fa fa-trash\" aria-hidden=\"true\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                     ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_pager_PagerAdmin_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pager:PagerAdmin
    MyCustomTag.PagerAdmin _jspx_th_pager_PagerAdmin_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(MyCustomTag.PagerAdmin.class) : new MyCustomTag.PagerAdmin();
    _jspx_th_pager_PagerAdmin_0.setJspContext(_jspx_page_context);
    _jspx_th_pager_PagerAdmin_0.setPageSize(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageSize}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_pager_PagerAdmin_0.setPageIndex(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageIndex}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_pager_PagerAdmin_0.setEndPage(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_pager_PagerAdmin_0.setUrll((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_pager_PagerAdmin_0.doTag();
    return false;
  }
}
