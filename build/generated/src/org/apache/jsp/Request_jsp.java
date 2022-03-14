package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Request_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>TEED Admin</title>\n");
      out.write("    <!-- Import Boostrap css, js, font awesome here -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">       \n");
      out.write("      <link href=\"https://use.fontawesome.com/releases/v5.0.4/css/all.css\" rel=\"stylesheet\">    \n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\">\n");
      out.write("      </script>\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\">\n");
      out.write("      </script>\n");
      out.write("      <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("      <link href=\"CSS/home.css\" rel=\"stylesheet\">\n");
      out.write("      <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("      <script src=\"js/index.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminSideBar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"table-wrapper\">\n");
      out.write("                <div class=\"table-title\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\" style=\"padding-top: 40px\">\n");
      out.write("                            <h2>Manage <b>Issue Request</b></h2>\n");
      out.write("                        </div>\n");
      out.write("<!--                        <div class=\"col-sm-6\" style=\"padding-top: 40px\">\n");
      out.write("                            <a href=\"#addEmployeeModal\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i> <span>Add New Book</span></a>\t\t\t\t\t\n");
      out.write("                        </div>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <table class=\"table table-striped table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <!--                                                                </th>-->\n");
      out.write("                            <th>Member ID</th>\n");
      out.write("                            <th>Book ID</th>\n");
      out.write("                            <th>Type</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("<!--                <div class=\"clearfix\">\n");
      out.write("                    <form action=\"aBookControl\">\n");
      out.write("                    <div class=\"hint-text\">Showing <input name=\"pageSize\" value=\"$pageSize}\"> out of <b>$totalMem}</b> entries</div>\n");
      out.write("                    <input type=\"submit\" value=\"Go\">\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("                        <pager:PagerAdmin pageSize=\"$pageSize}\" pageIndex=\"$pageIndex}\" endPage=\"$endPage}\" urll=\"$url}\"></pager:PagerAdmin>\n");
      out.write("                    </ul>\n");
      out.write("                </div>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  let btn=document.querySelector(\"#btn\");\n");
      out.write("  let sidebar=document.querySelector(\".sidebar\");\n");
      out.write("\n");
      out.write("  btn.onclick=function(){\n");
      out.write("      sidebar.classList.toggle(\"active\");\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listReqs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("l");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("<!--                            <td>\n");
          out.write("                                <span class=\"custom-checkbox\">\n");
          out.write("                                    <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
          out.write("                                    <label for=\"checkbox1\"></label>\n");
          out.write("                                </span>\n");
          out.write("                            </td>-->\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.memberId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.bookId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                            <td>\n");
          out.write("                               \n");
          out.write("                                <a href=\"AcceptRequest?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.bookId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&memberId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.memberId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\"><i class=\"fa fa-check\" aria-hidden=\"true\" data-toggle=\"tooltip\" title=\"Accept\"></i></a>\n");
          out.write("                                <a href=\"DenyRequest?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.bookId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&memberId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.memberId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" ><i class=\"fa fa-trash\" aria-hidden=\"true\" data-toggle=\"tooltip\" title=\"Deny\">&#xE872;</i></a>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
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
}
