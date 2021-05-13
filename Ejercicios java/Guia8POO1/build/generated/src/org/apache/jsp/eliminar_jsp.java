package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.*;

public final class eliminar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>INGRESAR USUARIOS</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h3>Usuarios</h3></div>\n");
      out.write("            <div class=\"row col-md-5\">\n");
      out.write("                <form role=\"form\" action=\"EliminarBDD.jsp\" method=\"POST\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <div class=\"well well-sm\"><strong><span class=\"glyphicon glyphiconasterisk\"></span>Ingrese el ID del usuario a Eliminar  </strong></div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"nombre\">ID:</label>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"Id_Usuario\" id=\"Id_Usuario\" placeholder=\"Ingresa el  nombre\" required>\n");
      out.write("                                    <span class=\"input-group-addon\"><span class=\"glyphicon glyphiconasterisk\"></span></span>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                         <input type=\"submit\" class=\"btn btn-info\" value=\"Eliminar\">\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");
if (request.getParameter("resultado") != null) {
                
      out.write("\n");
      out.write("                <div class=\"alert alert-success col-md-10\">\n");
      out.write("                    <b>");
      out.print(request.getParameter("resultado"));
      out.write("</b>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                     \n");
      out.write("            </div>\n");
      out.write("            <!--notese el uso de jsp:include -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "consulta.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("             <!-- /container --></body>\n");
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
