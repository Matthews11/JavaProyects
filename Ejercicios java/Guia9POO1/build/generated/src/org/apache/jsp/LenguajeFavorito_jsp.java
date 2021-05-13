package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LenguajeFavorito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                &nbsp;\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">Uso de JavaBean</div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <h1>P&aacute;gina de prueba del uso de beans</h1> \n");
      out.write("                    <p>Se env&iacute;a el formulario al servicio cuyo fichero es \n");
      out.write("                        <mark>beans.jsp</mark></p>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"row col-md-12\" >\n");
      out.write("                <form role=\"form\" action=\"beans.jsp\" method=\"POST\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"nombre\">Por favor, introduce tu nombre:</label>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"nombre\" \n");
      out.write("                                       placeholder=\"Ingresa tu nombre\">\n");
      out.write("                                <span class=\"input-group-addon\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"lenguaje\">¿Cuál es tu lenguaje de programación favorito? </label>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <select name=\"lenguaje\" class=\"form-control\"> \n");
      out.write("                                    <option value=\"Java\">Java \n");
      out.write("                                    <option value=\"C++\">C++ \n");
      out.write("                                    <option value=\"Perl\">Perl \n");
      out.write("                                </select> \n");
      out.write("                                <span class=\"input-group-addon\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-info\" value=\"Enviar\">\n");
      out.write("                    </div>\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
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
