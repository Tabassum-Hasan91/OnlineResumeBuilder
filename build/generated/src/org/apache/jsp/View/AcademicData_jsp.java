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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"SaveAcademicInfo.jsp\">\n");
      out.write("            <H4>Degree College Information</h4>\n");
      out.write("            College name:\n");
      out.write("            <input type=\"text\" name=\"degClgName\" >\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            College course:\n");
      out.write("            <input type=\"text\" name=\"degClgCourse\" placeholder=\"BCA\">\n");
      out.write("            <br>\n");
      out.write("                     \n");
      out.write("            College City:\n");
      out.write("            <input type=\"text\" name=\"degClgCity\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            College University:\n");
      out.write("            <input type=\"text\" name=\"degClgUniversity\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            College passing year:\n");
      out.write("            <input type=\"text\" name=\"degClgYear\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <H4>Junior College Information</h4>\n");
      out.write("            College name:\n");
      out.write("            <input type=\"text\" name=\"jrClgName\">\n");
      out.write("            <br>\n");
      out.write("          \n");
      out.write("            College Stream:\n");
      out.write("          \n");
      out.write("            <input type=\"text\" name=\"jrClgCourse\" placeholder=\"Science\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            College City:\n");
      out.write("            <input type=\"text\" name=\"jrClgCity\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            College University:\n");
      out.write("            <input type=\"text\" name=\"jrClgUniversity\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            College passing year:\n");
      out.write("            <input type=\"text\" name=\"jrClgYear\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type=\"sumbit\" value=\"Save and Proceed\">\n");
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
