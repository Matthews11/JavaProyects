package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class MostrarTester_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/conexion.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write(" \n");

 Connection conexion = null;
PreparedStatement st = null;ResultSet rs = null;
//Leemos el driver de Mysql
Class.forName("com.mysql.jdbc.Driver");
// Se obtiene una conexión con la base de datos.
conexion = DriverManager.getConnection(
"jdbc:mysql://localhost:6666/pooo", "root", "12345");

      out.write('\n');
      out.write("\n");
      out.write("   \n");
      out.write("                  \n");
      out.write("<link rel=\"stylesheet\" href=\"estilo1.css\">\n");
      out.write("<title>Mostrar  Usuarios</title>\n");
      out.write("\n");
      out.write("<div class=\"contenedor\">\n");
      out.write("\n");
      out.write("    <div class=\"aaa\">\n");
      out.write("        <table >\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Nombres</th>\n");
      out.write("                    <th>Apellido</th>\n");
      out.write("                    <th>Edad</th>\n");
      out.write("                    <th>Correo</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
    st = conexion.prepareStatement("select * from Listado_Tester");
                    rs = st.executeQuery();
                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                    <td>");
      out.print(rs.getString("id_Tester"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Nombre"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Apellido"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Edad"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Correo"));
      out.write("</td>\n");
      out.write("                  ");
      beans.Listado_TesterBean Tester = null;
      synchronized (request) {
        Tester = (beans.Listado_TesterBean) _jspx_page_context.getAttribute("Tester", PageContext.REQUEST_SCOPE);
        if (Tester == null){
          Tester = new beans.Listado_TesterBean();
          _jspx_page_context.setAttribute("Tester", Tester, PageContext.REQUEST_SCOPE);
          out.write("\n");
          out.write("                     ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("Tester"), request);
          out.write(" \n");
          out.write("                     ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("Tester"), "id_Tester", request.getParameter("Id_Tester"), request, "Id_Tester", false);
          out.write("\n");
          out.write("                     ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("Tester"), "nombre", request.getParameter("Nombre"), request, "Nombre", false);
          out.write("\n");
          out.write("                     ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("Tester"), "apellido", request.getParameter("Apellido"), request, "Apellido", false);
          out.write("\n");
          out.write("                     ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("Tester"), "edad", request.getParameter("Edad"), request, "Edad", false);
          out.write("\n");
          out.write("                     ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("Tester"), "correo", request.getParameter("Correo"), request, "Correo", false);
          out.write("\n");
          out.write("                     ");
        }
      }
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div> \n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    <a class=\"le\" href='index.jsp'>Atras</a> \n");
      out.write("    ");
   conexion.close();
      out.write("\n");
      out.write("</div>\n");
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
