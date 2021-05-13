/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sv.controls.company.DAO.PersonalDao;
import sv.controls.company.model.EmpleadoAreaFuncionalBeans;
import sv.controls.company.model.ProgramadoresBeans;

/**
 *
 * @author jared
 */
@WebServlet(name = "Personal", urlPatterns = {"/Personal"})
public class Personal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter c = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("accion");

            switch (action) {

                //Si la peticion que viene es un insert
                case "ingresar":
                    ingresar(request, response);
                    break;

              case "modificar":
                    modificar(request, response);
                    break;
                case "eliminar":
                    eliminar(request, response);
                    break;
                case "ingresarT":
                    ingresarT(request, response);
                    break;     
                    
                     case "modificarT":
                    modificarT(request, response);
                    break;
                    
                      case "eliminarT":
                    eliminarT(request, response);
                    break;
                    
                    
                     default:
                    personal (request,response);
                    break;
                 
            }
        }
    }

    private void ingresar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        ProgramadoresBeans PB = new ProgramadoresBeans();
        PersonalDao PD = new PersonalDao();

        String Nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String correo = request.getParameter("email");
        String Numero = request.getParameter("Numero");

        if ("".equals(Nombre) || "".equals(edad) || "".equals(correo) || "".equals(Numero)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Personal/INP.jsp");

        } else {

            int edad1 = Integer.parseInt(edad);
            int Numero1 = Integer.parseInt(Numero);
            PB.setNombreProgramador(Nombre);
            PB.setIdUsuarios(Numero1);
            PB.setEdad(edad1);
            PB.setCorreo(correo);

            PD.ingresar(PB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Personal.jsp");
        }
    }
    
     private void modificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        ProgramadoresBeans PB = new ProgramadoresBeans();
        PersonalDao PD = new PersonalDao();

        String id = request.getParameter("id");
        String Nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String correo = request.getParameter("email");

        if ("".equals(Nombre) || "".equals(edad) || "".equals(correo) ){
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Personal/INP.jsp");

        } else {

            int edad1 = Integer.parseInt(edad);
            int id1 = Integer.parseInt(id);
            
            PB.setIdProgramador(id1);
            PB.setNombreProgramador(Nombre);
            PB.setEdad(edad1);
            PB.setCorreo(correo);

            PD.modificar(PB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos modificados correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Personal.jsp");
        }
    }

     
     
      private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        ProgramadoresBeans PB = new ProgramadoresBeans();
        PersonalDao PD = new PersonalDao();

        String id = request.getParameter("id");
         

        if ("".equals(id) ){
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Personal/INP.jsp");

        } else {
 
            int id1 = Integer.parseInt(id);
            
            PB.setIdProgramador(id1); 

            PD.eliminar(PB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos eliminado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Personal.jsp");
        }
    }
     
        private void personal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        
              response.sendRedirect("Admin/Personal.jsp");

         

    }
      
        
         private void ingresarT(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
             
        PrintWriter c = response.getWriter();
        EmpleadoAreaFuncionalBeans EAF = new EmpleadoAreaFuncionalBeans();
        PersonalDao PD = new PersonalDao();

        String Nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String correo = request.getParameter("email");
        String Numero = request.getParameter("Numero");

        if ("".equals(Nombre) || "".equals(edad) || "".equals(correo) || "".equals(Numero)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Personal/INP.jsp");

        } else {

            int edad1 = Integer.parseInt(edad);
            int Numero1 = Integer.parseInt(Numero);
            EAF.setNombreEmpleado(Nombre);
            EAF.setIdUsuarios(Numero1);
            EAF.setEdad(edad1);
            EAF.setCorreo(correo);

            PD.ingresarT(EAF);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Personal.jsp");
        }
    }
  
        
        private void modificarT(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
         EmpleadoAreaFuncionalBeans EAF = new EmpleadoAreaFuncionalBeans();
        PersonalDao PD = new PersonalDao();


        String id = request.getParameter("id");
        String Nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String correo = request.getParameter("email");

        if ("".equals(Nombre) || "".equals(edad) || "".equals(correo) ){
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Personal/INP.jsp");

        } else {

            int edad1 = Integer.parseInt(edad);
            int id1 = Integer.parseInt(id);
            
            EAF.setIdEmpleado(id1);
            EAF.setNombreEmpleado(Nombre); 
            EAF.setEdad(edad1);
            EAF.setCorreo(correo);

            PD.modificarT(EAF);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos modificados correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Personal.jsp");
        }
    }

            private void eliminarT(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        ProgramadoresBeans PB = new ProgramadoresBeans();
        PersonalDao PD = new PersonalDao();
        EmpleadoAreaFuncionalBeans EAF = new EmpleadoAreaFuncionalBeans();
        


        String id = request.getParameter("id");
         

        if ("".equals(id) ){
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Personal/INP.jsp");

        } else {
 
            int id1 = Integer.parseInt(id);
            
            EAF.setIdEmpleado(id1); 

            PD.eliminarT(EAF);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos eliminado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Personal.jsp");
        }
    }
    
        
        
        
        
        
      
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
