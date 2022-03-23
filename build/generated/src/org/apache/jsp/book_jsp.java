package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
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
      out.write("        <!-- Breadcrumb Section Begin -->\n");
      out.write("<!--        <div class=\"breacrumb-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"breadcrumb-text\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-home\"></i> Home</a>\n");
      out.write("                            <span>Book List</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("        <!-- Breadcrumb Section Begin -->\n");
      out.write("\n");
      out.write("        <!-- Product Shop Section Begin -->\n");
      out.write("        <section class=\"product-shop spad\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- left-->\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1 produts-sidebar-filter\">\n");
      out.write("                        <div class=\"filter-widget\">\n");
      out.write("                            <h4 class=\"fw-title\">Categories</h4>\n");
      out.write("                            <ul class=\"filter-catagories\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"filter-widget\">\n");
      out.write("                            <h4 class=\"fw-title\">Language</h4>\n");
      out.write("                            <div class=\"fw-brand-check\">\n");
      out.write("                                <form action=\"lang\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <input type=\"submit\" value=\"Search\" class=\"p-input\">\n");
      out.write("                                    </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--                    <div class=\"filter-widget\">\n");
      out.write("                                                <h4 class=\"fw-title\">Price</h4>\n");
      out.write("                                                <div class=\"filter-range-wrap\">\n");
      out.write("                                                    <div class=\"range-slider\">\n");
      out.write("                                                        <div class=\"price-input\">\n");
      out.write("                                                            <input type=\"text\" id=\"minamount\">\n");
      out.write("                                                            <input type=\"text\" id=\"maxamount\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content\"\n");
      out.write("                                                        data-min=\"33\" data-max=\"98\">\n");
      out.write("                                                        <div class=\"ui-slider-range ui-corner-all ui-widget-header\"></div>\n");
      out.write("                                                        <span tabindex=\"0\" class=\"ui-slider-handle ui-corner-all ui-state-default\"></span>\n");
      out.write("                                                        <span tabindex=\"0\" class=\"ui-slider-handle ui-corner-all ui-state-default\"></span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <a href=\"#\" class=\"filter-btn\">Filter</a>\n");
      out.write("                                            </div>-->\n");
      out.write("                        <!--                    <div class=\"filter-widget\">\n");
      out.write("                                                <h4 class=\"fw-title\">Color</h4>\n");
      out.write("                                                <div class=\"fw-color-choose\">\n");
      out.write("                                                    <div class=\"cs-item\">\n");
      out.write("                                                        <input type=\"radio\" id=\"cs-black\">\n");
      out.write("                                                        <label class=\"cs-black\" for=\"cs-black\">Black</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"cs-item\">\n");
      out.write("                                                        <input type=\"radio\" id=\"cs-violet\">\n");
      out.write("                                                        <label class=\"cs-violet\" for=\"cs-violet\">Violet</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"cs-item\">\n");
      out.write("                                                        <input type=\"radio\" id=\"cs-blue\">\n");
      out.write("                                                        <label class=\"cs-blue\" for=\"cs-blue\">Blue</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"cs-item\">\n");
      out.write("                                                        <input type=\"radio\" id=\"cs-yellow\">\n");
      out.write("                                                        <label class=\"cs-yellow\" for=\"cs-yellow\">Yellow</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"cs-item\">\n");
      out.write("                                                        <input type=\"radio\" id=\"cs-red\">\n");
      out.write("                                                        <label class=\"cs-red\" for=\"cs-red\">Red</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"cs-item\">\n");
      out.write("                                                        <input type=\"radio\" id=\"cs-green\">\n");
      out.write("                                                        <label class=\"cs-green\" for=\"cs-green\">Green</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>-->\n");
      out.write("                        <!--                    <div class=\"filter-widget\">\n");
      out.write("                                                <h4 class=\"fw-title\">Size</h4>\n");
      out.write("                                                <div class=\"fw-size-choose\">\n");
      out.write("                                                    \n");
      out.write("                                                    <div class=\"sc-item\">\n");
      out.write("                                                        <input type=\"radio\" id=\"\">\n");
      out.write("                                                        <label for=\"\"></label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>-->\n");
      out.write("                        <div class=\"filter-widget\">\n");
      out.write("                            <h4 class=\"fw-title\">Publishers</h4>\n");
      out.write("                            <div class=\"fw-tags\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--right-->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-9 order-1 order-lg-2\">\n");
      out.write("                        <div class=\"product-show-option\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-7 col-md-7\">\n");
      out.write("                                    <div class=\"select-option\">\n");
      out.write("                                        <form action=\"BookControl\" method=\"\">\n");
      out.write("                                            <select class=\"sorting\" name=\"sortSelection\">\n");
      out.write("                                                <option value=\"Default\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sortSelection==\"Default\"?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Default</option>\n");
      out.write("                                                <option value=\"Newest\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sortSelection==\"Newest\"?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Newest</option>\n");
      out.write("                                                <option value=\"Oldest\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sortSelection==\"Oldest\"?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Oldest</option>\n");
      out.write("                                                <option value=\"Hottest\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sortSelection==\"Hottest\"?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Hottest</option>\n");
      out.write("                                            </select>\n");
      out.write("                                            <span class=\"p-input-field\">Show:</span>\n");
      out.write("                                            <input class=\"p-input\" type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"pageSize\">\n");
      out.write("                                            <input class=\"p-input\" type=\"submit\" value=\"GO\">\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-5 col-md-5 text-right\">\n");
      out.write("                                    <p>Show ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Of ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${countBook}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Product</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-list\">\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"loading-more\">\n");
      out.write("<!--                            <i class=\"icon_loading\"></i>-->\n");
      if (_jspx_meth_pager_PageTag_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Product Shop Section End -->\n");
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
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function ShowMess(id) {\n");
      out.write("     var option=confirm(\"Do you want to request an issue of this book ?\");\n");
      out.write("           if(option===true){\n");
      out.write("                           window.location.href=\"request?bookId=\"+id;\n");
      out.write("      \n");
      out.write("           }\n");
      out.write("\n");
      out.write("}\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li><a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ccid==c.getId()?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                    ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${langList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"bc-item\">\n");
          out.write("                                        <label for=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            <input type=\"radio\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"langCheck\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${langCheck==o?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">\n");
          out.write("                                            <span class=\"checkmark\"></span>\n");
          out.write("                                        </label>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pubList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pubb==o?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"publisher?pub=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"col-lg-4 col-sm-6\">\n");
          out.write("                                        <div class=\"product-item\">\n");
          out.write("                                            <div class=\"pi-pic\">\n");
          out.write("                                                <div class=\"frame\">\n");
          out.write("                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getPic()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                </div>\n");
          out.write("\n");
          out.write("                                                <div class=\"sale pp-sale\">HOT</div>\n");
          out.write("                                                <div class=\"icon\">\n");
          out.write("<!--                                                    <i class=\"fa fa-plus-square-o\" aria-hidden=\"true\"></i>-->\n");
          out.write("                                                </div>\n");
          out.write("                                                <ul>\n");
          out.write("                                                    <li class=\"w-icon active\">\n");
          out.write("                                                        <a href=\"#\" onclick=\"ShowMess(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">  <i class=\"fa fa-plus-square-o\" aria-hidden=\"true\"></i></a></li>\n");
          out.write("                                                    <li class=\"quick-view\">\n");
          out.write("                                                        <a href=\"detail?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">+ More Details</a></li>\n");
          out.write("<!--                                                    <li class=\"w-icon\"><a href=\"#\"><i class=\"fa fa-random\"></i></a></li>-->\n");
          out.write("                                                </ul>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"pi-text\">\n");
          out.write("                                                <div class=\"catagory-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getCategory()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                <a href=\"#\">\n");
          out.write("                                                    <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                </a>\n");
          out.write("                                                <div class=\"product-price\">\n");
          out.write("                                                    Free\n");
          out.write("                                                    <span>$3.00</span>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_pager_PageTag_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pager:PageTag
    MyCustomTag.PageTag _jspx_th_pager_PageTag_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(MyCustomTag.PageTag.class) : new MyCustomTag.PageTag();
    _jspx_th_pager_PageTag_0.setJspContext(_jspx_page_context);
    _jspx_th_pager_PageTag_0.setEndPage(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_pager_PageTag_0.setPageIndex(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageIndex}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_pager_PageTag_0.setPageSize(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageSize}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_pager_PageTag_0.setSortSelection((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sortSelection}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_pager_PageTag_0.doTag();
    return false;
  }
}
