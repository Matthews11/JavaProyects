package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Informacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <title>Datos JSTL</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4 col-sm-offset-4\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <h3>Datos personales</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <form role=\"form\" name=\"persona\" action=\"ProcesarInfo.jsp\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"nombre\">Ingrese su nombre:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"nombre\" placeholder=\"Nombre\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"apellido1\">Ingrese su primer apellido:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"apellido1\" name=\"apellido1\" placeholder=\"Primer \n");
      out.write("                                   apellido\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"apellido2\">Ingrese su segundo apellido:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"apellido2\" name=\"apellido2\" placeholder=\"Segundo \n");
      out.write("                                   apellido\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"edad\">Ingrese su edad:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"edad\" id=\"edad\" placeholder=\"Edad\">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-info\" value=\"Enviar\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
