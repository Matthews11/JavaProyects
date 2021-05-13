package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class consulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
"jdbc:mysql://localhost:6666/Guia8_POO1", "root", "12345");

      out.write('\n');
      out.write("\n");
      out.write("<div class=\"row col-md-7\">\n");
      out.write("    <table class=\"table table-striped table-bordered table-hover\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nombres</th>\n");
      out.write("                <th>Apellidos</th>\n");
      out.write("                <th>Telefono</th>\n");
      out.write("                <th>Operaciones</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");
    st = conexion.prepareStatement("select * from Empleados");
                rs = st.executeQuery();
                while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("nombre"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("apellidos"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("telefono"));
      out.write("</td>\n");
      out.write("                <td><a class=\"btn btndanger\"href='eliminar.jsp?id=");
      out.print(rs.getString("codigo"));
      out.write("'>Eliminar</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
                conexion.close();
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
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
