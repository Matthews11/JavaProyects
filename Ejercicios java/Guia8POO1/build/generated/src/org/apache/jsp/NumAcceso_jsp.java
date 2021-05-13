package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public final class NumAcceso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

int numeroAccesos = 0;
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    java.util.Date primerAcceso = new java.util.Date();

    private Date ahora() {
        Date now = new Date();
        return now;
    }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ejemplo</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\"content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\"href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h3>Accesos a la pagina</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">Información del acceso</div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <p>\n");
      out.write("                        ");
      out.print("La página ha sido accedida " + (++numeroAccesos)
        + " veces desde el arranque del servidor");
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        ");
      out.print("El primer acceso a la página se realizó el dia "
        + formatoFecha.format(primerAcceso) + " a las "
        + formatoHora.format(primerAcceso));
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        ");
      out.print("El ultimo acceso fue el " + formatoFecha.format(ahora())
        + " a las " + formatoHora.format(ahora()));
      out.write("\n");
      out.write("                    </p>\n");
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
