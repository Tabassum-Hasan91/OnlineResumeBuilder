package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AcademicData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Academic Information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h2>Welcome to online Resume Builder</h2>\n");
      out.write("        <h4>Please Enter your Academic Information</h4>\n");
      out.write("\n");
      out.write("        <form action=\"SaveAcademicInfo.jsp\">\n");
      out.write("            <H4>Degree College Information</h4>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College name:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"degClgName\" CLASS=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                  \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College course:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"degClgCourse\" placeholder=\"BCA\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("                     \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College City:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"degClgCity\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College University:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"degClgUniversity\">\n");
      out.write("                </DIV>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College passing year:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"degClgYear\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <H4>Junior College Information</h4>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College name:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"jrClgName\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("          \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College Stream:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"jrClgCourse\" placeholder=\"Science\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College City:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" name=\"jrClgCity\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College University:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"jrClgUniversity\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">College passing year:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"jrClgYear\">\n");
      out.write("                </div>\n");
      out.write("           </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                     \n");
      out.write("                <input type=\"submit\" class=\"btn btn-default\" value=\"Save and Proceed\">\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
