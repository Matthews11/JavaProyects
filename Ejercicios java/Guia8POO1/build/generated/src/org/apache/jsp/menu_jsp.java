package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 String usuario = "";
 HttpSession sesionOk = request.getSession();
 if (sesionOk.getAttribute("usuario") == null) {

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("login.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("error", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Es obligatorio identificarse", request.getCharacterEncoding()));
        return;
      }
      out.write('\n');

 } else {
 usuario = (String) sesionOk.getAttribute("usuario");
 }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\"content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Menu principal</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\"content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\"content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"href=\"css/bootstrap.min.css\">\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"navbar-header\">\n");
      out.write("<button type=\"button\"class=\"navbar-toggle collapsed\"\n");
      out.write(" data-toggle=\"collapse\" data-target=\"#navbar\"\n");
      out.write(" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("<span class=\"sr-only\">Desplegar navegación</span>\n");
      out.write("<span class=\"icon-bar\"></span>\n");
      out.write("<span class=\"icon-bar\"></span>\n");
      out.write("<span class=\"icon-bar\"></span>\n");
      out.write("</button>\n");
      out.write("<a class=\"navbar-brand\"href=\"#\">Ejemplo POO</a>\n");
      out.write("</div>\n");
      out.write("<div id=\"navbar\"class=\"navbar-collapse collapse\">\n");
      out.write("<ul class=\"nav navbar-nav\">\n");
      out.write("<li class=\"active\"><a href=\"#\">Inicio</a></li>\n");
      out.write("<li><a href=\"ingresaremp.jsp\">Empleados</a></li>\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("<a href=\"#\"class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write(" aria-expanded=\"false\">Usuarios <span class=\"caret\"></span></a>\n");
      out.write("<ul class=\"dropdown-menu\">\n");
      out.write("<li><a href=\"opc1.jsp\">Crear usuario</a></li>\n");
      out.write("<li><a href=\"opc2.jsp\">Borrar usuario</a></li>\n");
      out.write("<li><a href=\"opc3.jsp\">Cambiar clave</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("<li><a href=\"cerrarsesion.jsp\">\n");
      out.print(usuario);
      out.write(" (cerrar sesión)</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"container\">\n");
      out.write("<h3>PROCESO DE IDENTIFICACIÓN</h3>\n");
      out.write("<p>\n");
      out.write("<h5>Menú de administración</h5>\n");
      out.write("<b>Usuario activo:</b>");
      out.print(usuario);
      out.write("\n");
      out.write("</p>\n");
      out.write("</div>\n");
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
