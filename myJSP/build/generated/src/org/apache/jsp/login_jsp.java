package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">myJSP</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                \n");
      out.write("            ");
 
                if (session.getAttribute("username") == null) { 
      out.write("\n");
      out.write("            \n");
      out.write("                <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                <li><a href=\"#\">Page 1</a></li>\n");
      out.write("                <li><a href=\"#\">Page 2</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("                <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            ");
 } else { //visible for logged in users
      out.write("\n");
      out.write("            \n");
      out.write("                <li class=\"active\"><a href=\"welcomePage.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"booking.jsp\">Make a Booking</a></li>\n");
      out.write("                \n");
      out.write("                ");
 if (session.getAttribute("user_type").equals("admin")) { //only admin user can see
      out.write(" \n");
      out.write("                <li><a href=\"approveBooking.jsp\">Approve Booking</a></li>\n");
      out.write("                <li><a href=\"userTable.jsp\">Users Table</a></li>\n");
      out.write("                 ");
 } 
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("                \n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("        ");
 if (session.getAttribute("message") != null) {
      out.write("\n");
      out.write("           <h1 class=\"message\">");
      out.print(session.getAttribute("message"));
      out.write("</h1>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("        <form action=\"loginServlet\" method=\"post\" class=\"login-form\">\n");
      out.write("            <h1>Login</h1>\n");
      out.write("            <input type=\"text\" name=\"username\" placeholder=\"Enter Username\" required>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required> \n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("        </form> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
