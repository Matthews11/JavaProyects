package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JefeAreaFuncional_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\" style=\"color: white\">Telecomunicaciones SV</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\" style=\"color: white\" >Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\" style=\"color: white\">Información</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\" >\n");
      out.write("                            <a class=\"nav-link\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\" style=\"color: white\">Desarrolladores</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger\">Iniciar sesión</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            \n");
      out.write("         <div class=\"container\">\n");
      out.write("        <table border=\"1\" width=\"90%\" class=\"table\">\n");
      out.write("            <tr><th>Nombre</th><th>Apellido</th><th>Descripcion</th><th>Estado</th><th>Editar</th></tr>\n");
      out.write("                \n");
      out.write("                <tr><td>jose </td><td>hernandez</td><td>creacion de view</td><td>activo</td><td><a  href=\"modificarEstado.jsp\" class=\"btn btn-primary\">Modificar Estado</a></td><td><a href=\"CrearEstado.jsp\"  class=\"btn btn-info\">Crear Estado</a></td></tr>\n");
      out.write("                <tr><td>jose </td><td>hernandez</td><td>creacion de view</td><td>activo</td><td><a href=\"modificarEstado.jsp\" class=\"btn btn-primary\">Modificar Estado</a></td><td><a href=\"CrearEstado.jsp\"  class=\"btn btn-info\">Crear Estado</a></td></tr>\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <footer style=\"background-color: #212529; color: white; text-align: center;position: relative\">\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <p>Universidad Don Bosco</p>\n");
      out.write("            \n");
      out.write("            <p>Copyright © 2021 Esdras Cortez, José Hernandez, Kevin Rodriguez, Nicolas Alas, Fernando Merlos todos los reservados.</p>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        \n");
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
