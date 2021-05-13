package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>CRUD</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"estilo1.css\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"estilo.css\">\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"titulo\"> Mantenimiento a Usuarios y Tipo Usuarios</div>\n");
      out.write("\n");
      out.write("        <div> \n");
      out.write("            <form action=\"Usuarios.html\" method=\"POST\">\n");
      out.write("            <table class=\"tabla\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <p>Usuarios </p>\n");
      out.write("                       \n");
      out.write("                             <li><a href=\"mostrarUB.jsp\">ver</a></li>  \n");
      out.write("                            <li><a href=\"modificarUB.jsp\">modificar</a></li> \n");
      out.write("                            <li><a href=\"eliminarUB.jsp\">Eliminar</a></li> \n");
      out.write("                       </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("         <div> \n");
      out.write("            <form action=\"Usuarios.html\" method=\"POST\">\n");
      out.write("            <table class=\"tabla\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <p>Tipo Usuarios </p>\n");
      out.write("                          \n");
      out.write("                             <li><a href=\"mostrarUT.jsp\">ver</a></li>  \n");
      out.write("                            <li><a href=\"modificarUT.jsp\">modificar</a></li> \n");
      out.write("                            <li><a href=\"eliminarUT.jsp\">Eliminar</a></li> \n");
      out.write("                       </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("              <div> \n");
      out.write("            <form action=\"Usuarios.html\" method=\"POST\">\n");
      out.write("            <table class=\"tabla\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <p>Usuarios y Tipo Usuarios </p>\n");
      out.write("                          \n");
      out.write("                             <li><a href=\"mostrarUTU.jsp\">ver</a></li>  \n");
      out.write("                           \n");
      out.write("                       </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </div> \n");
      out.write("        \n");
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
