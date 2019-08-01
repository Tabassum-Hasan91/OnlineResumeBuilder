package org.apache.jsp.files.Themes.blue;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blueResume_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<title>Resume</title>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/blue.css\" />\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/print.css\" media=\"print\"/>\n");
      out.write("<!--[if IE 7]>\n");
      out.write("<link href=\"css/ie7.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<![endif]-->\n");
      out.write("<!--[if IE 6]>\n");
      out.write("<link href=\"css/ie6.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<![endif]-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.tipsy.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon.yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/scrollTo.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/myriad.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.colorbox.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/custom.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tCufon.replace('h1,h2');\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Begin Wrapper -->\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("  <div class=\"wrapper-top\"></div>\n");
      out.write("  <div class=\"wrapper-mid\">\n");
      out.write("    <!-- Begin Paper -->\n");
      out.write("    <div id=\"paper\">\n");
      out.write("      <div class=\"paper-top\"></div>\n");
      out.write("      <div id=\"paper-mid\">\n");
      out.write("        <div class=\"entry\">\n");
      out.write("          <!-- Begin Image -->\n");
      out.write("          <img class=\"portrait\" src=\"images/image.jpg\" alt=\"John Smith\" />\n");
      out.write("          <!-- End Image -->\n");
      out.write("          <!-- Begin Personal Information -->\n");
      out.write("          <div class=\"self\">\n");
      out.write("              ");
 out.print(request.getParameter("fname")); 
      out.write("\n");
      out.write("            <h1 class=\"name\">John Smith <br />\n");
      out.write("              <span>Interactive Designer</span></h1>\n");
      out.write("            <ul>\n");
      out.write("              <li class=\"ad\">111 Lorem Street, 34785, Ipsum City</li>\n");
      out.write("              <li class=\"mail\">johnsmith@business.com</li>\n");
      out.write("              <li class=\"tel\">+11 444 555 22 33</li>\n");
      out.write("              <li class=\"web\">www.businessweb.com</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <!-- End Personal Information -->\n");
      out.write("          <!-- Begin Social -->\n");
      out.write("          <div class=\"social\">\n");
      out.write("            <ul>\n");
      out.write("              <li><a class='north' href=\"#\" title=\"Download .pdf\"><img src=\"images/icn-save.jpg\" alt=\"Download the pdf version\" /></a></li>\n");
      out.write("              <li><a class='north' href=\"javascript:window.print()\" title=\"Print\"><img src=\"images/icn-print.jpg\" alt=\"\" /></a></li>\n");
      out.write("              <li><a class='north' id=\"contact\" href=\"contact/index.html\" title=\"Contact Me\"><img src=\"images/icn-contact.jpg\" alt=\"\" /></a></li>\n");
      out.write("              <li><a class='north' href=\"#\" title=\"Follow me on Twitter\"><img src=\"images/icn-twitter.jpg\" alt=\"\" /></a></li>\n");
      out.write("              <li><a class='north' href=\"#\" title=\"My Facebook Profile\"><img src=\"images/icn-facebook.jpg\" alt=\"\" /></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <!-- End Social -->\n");
      out.write("        </div>\n");
      out.write("        <!-- Begin 1st Row -->\n");
      out.write("        <div class=\"entry\">\n");
      out.write("          <h2>OBJECTIVE</h2>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin dignissim viverra nibh sed varius. Proin bibendum nunc in sem ultrices posuere. Aliquam ut aliquam lacus.</p>\n");
      out.write("        </div>\n");
      out.write("        <!-- End 1st Row -->\n");
      out.write("        <!-- Begin 2nd Row -->\n");
      out.write("        <div class=\"entry\">\n");
      out.write("          <h2>EDUCATION</h2>\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>Sep 2005 - Feb 2007</h3>\n");
      out.write("            <p>Academy of Art University, London <br />\n");
      out.write("              <em>Master in Communication Design</em></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>Sep 2001 - Jun 2005</h3>\n");
      out.write("            <p>University of Art &amp; Design, New York <br />\n");
      out.write("              <em>Bachelor of Science in Graphic Design</em></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End 2nd Row -->\n");
      out.write("        <!-- Begin 3rd Row -->\n");
      out.write("        <div class=\"entry\">\n");
      out.write("          <h2>EXPERIENCE</h2>\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>May 2009 - Feb 2010</h3>\n");
      out.write("            <p>Agency Creative, London <br />\n");
      out.write("              <em>Senior Web Designer</em></p>\n");
      out.write("            <ul class=\"info\">\n");
      out.write("              <li>Vestibulum eu ante massa, sed rhoncus velit.</li>\n");
      out.write("              <li>Pellentesque at lectus in <a href=\"#\">libero dapibus</a> cursus. Sed arcu ipsum, varius at ultricies acuro, tincidunt iaculis diam.</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>Jun 2007 - May 2009</h3>\n");
      out.write("            <p>Junior Web Designer <br />\n");
      out.write("              <em>Bachelor of Science in Graphic Design</em></p>\n");
      out.write("            <ul class=\"info\">\n");
      out.write("              <li>Sed fermentum sollicitudin interdum. Etiam imperdiet sapien in dolor rhoncus a semper tortor posuere. </li>\n");
      out.write("              <li>Pellentesque at lectus in libero dapibus cursus. Sed arcu ipsum, varius at ultricies acuro, tincidunt iaculis diam.</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End 3rd Row -->\n");
      out.write("        <!-- Begin 4th Row -->\n");
      out.write("        <div class=\"entry\">\n");
      out.write("          <h2>SKILLS</h2>\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>Software Knowledge</h3>\n");
      out.write("            <ul class=\"skills\">\n");
      out.write("              <li>Photoshop</li>\n");
      out.write("              <li>Illustrator</li>\n");
      out.write("              <li>InDesign</li>\n");
      out.write("              <li>Flash</li>\n");
      out.write("              <li>Fireworks</li>\n");
      out.write("              <li>Dreamweaver</li>\n");
      out.write("              <li>After Effects</li>\n");
      out.write("              <li>Cinema 4D</li>\n");
      out.write("              <li>Maya</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <h3>Languages</h3>\n");
      out.write("            <ul class=\"skills\">\n");
      out.write("              <li>CSS/XHTML</li>\n");
      out.write("              <li>PHP</li>\n");
      out.write("              <li>JavaScript</li>\n");
      out.write("              <li>Ruby on Rails</li>\n");
      out.write("              <li>ActionScript</li>\n");
      out.write("              <li>C++</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End 4th Row -->\n");
      out.write("         <!-- Begin 5th Row -->\n");
      out.write("        <div class=\"entry\">\n");
      out.write("        <h2>WORKS</h2>\n");
      out.write("        \t<ul class=\"works\">\n");
      out.write("        \t\t<li><a href=\"images/1.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t\t<li><a href=\"images/2.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t\t<li><a href=\"images/3.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t\t<li><a href=\"images/1.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t\t<li><a href=\"images/2.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t\t<li><a href=\"images/3.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t\t<li><a href=\"images/1.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t\t<li><a href=\"images/1.jpg\" rel=\"gallery\" title=\"Lorem ipsum dolor sit amet.\"><img src=\"images/image.jpg\" alt=\"\" /></a></li>\n");
      out.write("        \t</ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- Begin 5th Row -->\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("      <div class=\"paper-bottom\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Paper -->\n");
      out.write("  </div>\n");
      out.write("  <div class=\"wrapper-bottom\"></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"message\"><a href=\"#top\" id=\"top-link\">Go to Top</a></div>\n");
      out.write("<!-- End Wrapper -->\n");
      out.write("</body>\n");
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
