package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bean1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String nom_cli = "Rafael";
    String ape_cli = "Torres";
    String dir_cli = "My_House";

      out.write('\n');
      sv.edu.udb.guia9.ClienteBean cli_bean = null;
      synchronized (_jspx_page_context) {
        cli_bean = (sv.edu.udb.guia9.ClienteBean) _jspx_page_context.getAttribute("cli_bean", PageContext.PAGE_SCOPE);
        if (cli_bean == null){
          cli_bean = new sv.edu.udb.guia9.ClienteBean();
          _jspx_page_context.setAttribute("cli_bean", cli_bean, PageContext.PAGE_SCOPE);
        }
      }
      out.write(' ');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("cli_bean"), "nomb_cli",
nom_cli);
      out.write(' ');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("cli_bean"), "ape_cli",
ape_cli);
      out.write(' ');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("cli_bean"), "dir_cli",
dir_cli);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                &nbsp;\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">Datos personales</div> <div class=\"panel-body\">\n");
      out.write("                    ");

                        out.println("<h3>Nombre: " + cli_bean.getNomb_cli() + "</h3>");
                        out.println("<h3>Apellido: " + cli_bean.getApe_cli() + "</h3>");
                        out.println("<h3>Direcci&oacute;n: " + cli_bean.getDir_cli() + "</h3>");
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("    </body>\n");
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
