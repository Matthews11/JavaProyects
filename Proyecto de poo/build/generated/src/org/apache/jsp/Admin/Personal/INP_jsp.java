package org.apache.jsp.Admin.Personal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class INP_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/Personal.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/normalize.css\">\n");
      out.write("        <title>Personal | Agregar Programdor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"../img/logo.png\" alt=\"\" srcset=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"espacio\"></div>\n");
      out.write("            <nav class=\"menu-main\">\n");
      out.write(" <a href=\"../Administrador.jsp\" >Departamentos</a> \n");
      out.write("                <a href=\"../Usuarios.jsp\" >Usuarios</a> \n");
      out.write("                <a href=\"../Personal.jsp\" class=\"active\">Personal por Departamentos</a>\n");
      out.write("                <a href=\"../Login.jsp\">Cerrar Sesion</a>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("             <div class=\"cont_user\">\n");
      out.write("                \n");
      out.write("                <h2 class=\"titulo\">Agregar Programador</h2>\n");
      out.write("             <form class=\"form_user\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Personal?accion=ingresar\" target=\"\" method=\"post\" name=\"formDepa\">\n");
      out.write("                <div class=\"user_img\">\n");
      out.write("                    <img src=\"../img/usuario.png\">\n");
      out.write("                </div>\n");
      out.write("                <p class=\"titulo1\" for=\"nombre\">Nombre del programador</p>\n");
      out.write("                <input  class =\"input_login\" type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Ingrese el nombre del departamaneto\"/>\n");
      out.write("                <br>\n");
      out.write("                 <p class=\"titulo1\" for=\"edad\">Edad</p>\n");
      out.write("                <input class =\"input_login\" type=\"text\" name=\"edad\" id=\"edad\" placeholder=\"Ingrese la edad \"/>\n");
      out.write("                <br>\n");
      out.write("                <p class=\"titulo1\" for=\"numero\">Vaya a la tabla usuarios Registre al empleado  para asignar el numero de usuario</p> \n");
      out.write("               <br> <p class=\"titulo1\" for=\"nombre\">Numero de usuario</p>\n");
      out.write("                <input class =\"input_login\" type=\"text\" name=\"Numero\" id=\"Numero\" placeholder=\"Numero de usuario\"/>\n");
      out.write("               <br> \n");
      out.write("                 <p class=\"titulo1\"for=\"correo\">Correo</p>\n");
      out.write("                 <input class =\"input_login\" type=\"email\" id=\"email\" name=\"email\"placeholder=\"Ingrese el correo\" pattern=\"[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}\">\n");
      out.write("\t    <br>\n");
      out.write("            \n");
      out.write("             <a class=\"btn_user\" href=\"../Personal.jsp\"> Atras</a>\n");
      out.write("                <button class=\"btn_user\" type=\"submit\" name=\"accion\" value=\"ingresar\"> Ingresar </a>\n");
      out.write("            </form>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
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
      out.write("                    <img src=\"../img/fc.svg\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dos\">\n");
      out.write("                    <img src=\"../img/ig.svg\" alt=\"\" srcset=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"copy\"></div>\n");
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
