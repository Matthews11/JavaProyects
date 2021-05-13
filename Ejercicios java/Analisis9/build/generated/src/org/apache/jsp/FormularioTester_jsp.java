package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormularioTester_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"estilo1.css\">\n");
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
      out.write("        <title>Ingresar Tester</title>\n");
      out.write("        <div class=\"titulo\"> Ingresar Tester</div>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h3>Usuarios</h3></div>\n");
      out.write("            <div class=\"row col-md-5\">\n");
      out.write("                <form role=\"form\" action=\"InsertarTester.jsp\" method=\"POST\">\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <div class=\"well well-sm\"><strong><span class=\"glyphicon glyphiconasterisk\"></span>Campos requeridos</strong></div>\n");
      out.write("             \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                             <br>\n");
      out.write("                            <label for=\"apellido\">Nombre:</label>\n");
      out.write("                             <br>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"info\" id=\"Nombre\" name=\"Nombre\" placeholder=\"Ingresa  el Nombre\" required>\n");
      out.write("                                <span class=\"input-group-addon\"><span class=\"glyphicon glyphiconasterisk\"></span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                             <br>\n");
      out.write("                            <label for=\"telefono\">Apellido:</label>\n");
      out.write("                             <br>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"info\" id=\"Apellido\" name=\"Apellido\" placeholder=\"Ingresa el Apellido\" required>\n");
      out.write("                                <span class=\"input-group-addon\"><span class=\"glyphicon glyphiconasterisk\"></span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                              <br>\n");
      out.write("                            <label for=\"telefono\">Edad:</label>\n");
      out.write("                             <br> \n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"int\" class=\"info\" id=\"Edad\" name=\"Edad\" placeholder=\"Ingresa la Edad\" required>\n");
      out.write("                                <span class=\"input-group-addon\"><span class=\"glyphicon glyphiconasterisk\"></span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                              <br>\n");
      out.write("                            <label for=\"telefono\">Correo:</label>\n");
      out.write("                             <br> \n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"int\" class=\"info\" id=\"Correo\" name=\"Correo\" placeholder=\"Ingresa el Correo\" required>\n");
      out.write("                                <span class=\"input-group-addon\"><span class=\"glyphicon glyphiconasterisk\"></span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <input type=\"submit\" class=\"btn btn-info\" value=\"Ingresar\">\n");
      out.write("                    </div>\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MostrarTester.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("             <!-- /container --></body>\n");
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
