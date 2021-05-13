package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sv.controls.company.controlador.Login;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilo.css\">\n");
      out.write("        <link rsel=\"stylesheet\" href=\"normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Loginestilo.css\">\n");
      out.write("        <title>Inicio de Sesion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"img/logo.png\" alt=\"\" srcset=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"espacio\"></div>\n");
      out.write("            <nav class=\"menu-main\">\n");
      out.write("               \n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"login\">\n");
      out.write("                <h1 class=\"titulo_login\">INGRESE SUS CREDENCIALES</h1>\n");
      out.write("            <form class=\"f_log\"action=\"Login\" target=\"\" method=\"get\" name=\"Login\"> \n");
      out.write("                <div class=\"user_img\">\n");
      out.write("                    <img src=\"img/logo.png\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("               <!-- <label class=\"label_login\" for=\"name\">Nombre</label> -->\n");
      out.write("                <input class=\"input_login\" type=\"text\" name=\"name\" id=\"name\" placeholder=\"Usuario\" required/>\n");
      out.write("              <!--  <label  class=\"label_login\" for=\"password\" />Contraseña</label>-->\n");
      out.write("           \n");
      out.write("                <input class=\"input_login\" type=\"password\" name=\"password\" id=\"password\" placeholder=\"Contraseña\" required />\n");
      out.write("                <input class=\"btn_login\" type=\"submit\" name=\"Iniciar Sesion\" value=\"Iniciar Sesion\"/>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"fin\">\n");
      out.write("            <div class=\"Contactos\">\n");
      out.write("                <H2>¿Quienes Somos?</H2>\n");
      out.write("                <P>Somos un equipo de creativos y redactores que produce contenidos innovadores para lograr objetivos de comunicación. Convertimos en palabras cualquier formato de ideas. Somos especialistas en redactar soluciones a la medida de un mensaje. Incorporamos constantemente las últimas tendencias de la comunicación y las tecnologías para ayudar a nuestros clientes a alcanzar el éxito.\n");
      out.write("                    Los contenidos se convierten en una fuente de innovación que marca la diferencia, actúan como facilitadores y catalizadores del éxito. Ya no se trata de tener un mensaje sino de que sea inolvidable. Nuestra responsabilidad es descubrir lo que necesita el cliente y  decirlo sin que falte o sobre una palabra.</P>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"Areas\">\n");
      out.write("                <H2>Servicios</H2>\n");
      out.write("                <p>Administrar</p>\n");
      out.write("                <p>Jefes Funcionales</p>\n");
      out.write("                <p>Jefes en Areas</p>\n");
      out.write("                <p>Testers </p>\n");
      out.write("                <p>Programadores</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"Redes\">\n");
      out.write("                <H2>Redes</H2>\n");
      out.write("                <div class=\"uno\">\n");
      out.write("                    <img src=\"img/fc.svg\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dos\">\n");
      out.write("                    <img src=\"img/ig.svg\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"copy\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            // manejo de sesiones
            HttpSession sesion = request.getSession();
            int rol = 0;

            if (request.getAttribute("rol") != null) {
                rol = (Integer) request.getAttribute("rol");

                if (rol == 1) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Admin/Administrador.jsp");
                }
                if (rol == 2) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Jefe de area funcional/JefeFuncional.jsp");
                }
                if (rol == 3) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Testert/Probador.jsp");
                }
                if (rol == 4) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Jefe de desarrollo/JefeDesarrollo.jsp");
                }
                if (rol == 5) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Programador/Programador.jsp");
                } else {
        
      out.write(" <script >alert(\"Usuario Invalido, Ingrese el usuario o la contraseña correctamente\");</script>\n");
      out.write("        ");
 }
            }


        
      out.write("     \n");
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
