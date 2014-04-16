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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Bootply.com - Navbar Static top Template</title>\n");
      out.write("        <meta name=\"generator\" content=\"Bootply\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/bootstrap/img/favicon.ico\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"/bootstrap/img/apple-touch-icon.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"/bootstrap/img/apple-touch-icon-72x72.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"/bootstrap/img/apple-touch-icon-114x114.png\">\n");
      out.write("\n");
      out.write("        <!-- CSS code from Bootply.com editor -->\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            table, td, th\n");
      out.write("            {\n");
      out.write("            border:1px solid green;\n");
      out.write("            }\n");
      out.write("            th\n");
      out.write("            {\n");
      out.write("            background-color:green;\n");
      out.write("            color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <!-- HTML code from Bootply.com editor -->\n");
      out.write("    \n");
      out.write("    <body  >\n");
      out.write("        <div class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Mylan</a>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"#about\">About</a></li>\n");
      out.write("            </ul>\n");
      out.write("            </div><!--/.nav-collapse -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h1>Drug Trends Lookup</h1>\n");
      out.write("                <div class=\"navbar-text\">Drug/Classification</div>\n");
      out.write("\t\t<form class=\"navbar-form\" role=\"search\">\n");
      out.write("\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\n");
      out.write("\t\t\t<div class=\"input-group-btn\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("            ");
 
            String message1 = (String) request.getAttribute("message1");
            if(message1 != null) {
                
                out.println("<div name=\"result\" class=\"container\">");
                out.println("<table border=\"1\" >");
                out.println("<thead><th class=\"text-center\">Results</th></thead>");
                out.println("<tbody><tr><td>");
                out.println("<div class=\"text-center\">");
                out.println("<p class=\"lead\">message1</p>");
                out.println("</div>");
                out.println("</td></tr></tbody>");
                out.println("</table></div>");

            }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div><!-- /.container -->\n");
      out.write("        \n");
      out.write("        <script type='text/javascript' src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("        <script type='text/javascript' src=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- JavaScript jQuery code from Bootply.com editor -->\n");
      out.write("        <script type='text/javascript'>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("\n");
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
