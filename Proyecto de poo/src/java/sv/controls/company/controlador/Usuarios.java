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
import sv.controls.company.DAO.UsuarioDao;
import sv.controls.company.model.UsuariosBeans;
import sv.controls.company.Recursos.seleccion;
import sv.controls.company.Recursos.seleccion2;
import sv.controls.company.model.Tipo_UsuarioBeans;

/**
 *
 * @author jared
 */
@WebServlet(name = "Usuarios", urlPatterns = {"/Usuarios"})
public class Usuarios extends HttpServlet {

    int tipo;
    int estado;
    int depar;

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
                      
                       case "ingresartp":
                    ingresartp(request, response);
                    break;

                   case "modificartp":
                          modificartp(request, response);
                         break;
                   case "eliminartp":
                  eliminartp(request, response);
                      break;
                      
                   default :
                       usuarios (request,response);
                       break;
            }
        }
    }

    private void ingresar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        UsuariosBeans UB = new UsuariosBeans();
        UsuarioDao PD = new UsuarioDao();

        String Nombre = request.getParameter("nombre");
        String contra = request.getParameter("contra");
        String TU = request.getParameter("TipoUsuario");
        String ES = request.getParameter("es");
        String depa = request.getParameter("depa");

        if ("".equals(Nombre) || "".equals(contra) || "".equals(TU) || "".equals(ES) || "".equals(depa)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios/ingresaruser.jsp");

        } else {
 
            seleccion s = new seleccion();
            s.eleccion(Nombre, contra, TU, ES, depa);

            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios.jsp");
        }
    }

    

    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        UsuariosBeans UB = new UsuariosBeans();
        UsuarioDao PD = new UsuarioDao();

        String id = request.getParameter("id");
         

        if ("".equals(id) ){
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios/eliminaruser.jsp");

        } else {
 
            int id1 = Integer.parseInt(id);
            
            UB.setId_Usuarios(id1); 

            PD.ELIMINAR(UB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos eliminado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios.jsp");
        }
    }
     
    
     private void modificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        UsuariosBeans UB = new UsuariosBeans();
        UsuarioDao PD = new UsuarioDao();

          String id = request.getParameter("id");
        String Nombre = request.getParameter("nombre");
        String contra = request.getParameter("contra");
        String TU = request.getParameter("TipoUsuario");
        String ES = request.getParameter("es");
        String depa = request.getParameter("depa");

        if ("".equals(id) ||"".equals(Nombre) || "".equals(contra) || "".equals(TU) || "".equals(ES) || "".equals(depa)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios/ingresaruser.jsp");

        } else {

              seleccion2 s = new seleccion2();
            int id1 = Integer.parseInt(id);
            
            UB.setId_Usuarios(id1);
           
           s.eleccion1(id1,Nombre, contra, TU, ES, depa);

            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios.jsp");
        }
    }

    
       private void ingresartp(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        Tipo_UsuarioBeans TPB = new Tipo_UsuarioBeans();
        UsuarioDao PD = new UsuarioDao();

        String DEPA = request.getParameter("DEPA");
       

        if ("".equals(DEPA) ) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios/ingresaruser.jsp");

        } else {
 
             TPB.setTipo_Usuario(DEPA);
             PD.ingresartp(TPB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios.jsp");
        }
    }

    

    private void eliminartp(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
         Tipo_UsuarioBeans TPB = new Tipo_UsuarioBeans();
        UsuarioDao PD = new UsuarioDao(); 
        String id = request.getParameter("id");
         

        if ("".equals(id) ){
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios/eliminaruser.jsp");

        } else {
 
            int id1 = Integer.parseInt(id);
            
            TPB.setId_Tipo_Usuario(id1);  
            PD.ELIMINARtp(TPB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos eliminado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios.jsp");
        }
    }
     
    
     private void modificartp(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        Tipo_UsuarioBeans TPB = new Tipo_UsuarioBeans();
        UsuarioDao PD = new UsuarioDao();

          String id = request.getParameter("id"); 
          String depa = request.getParameter("DEPA");

        if ("".equals(id)|| "".equals(depa)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios/ingresaruser.jsp");

        } else {
 
            int id1 = Integer.parseInt(id);
            
            TPB.setId_Tipo_Usuario(id1);
            TPB.setTipo_Usuario(depa);
            PD.modificartp(TPB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");
            c.println("</script>");
            response.sendRedirect("Admin/Usuarios.jsp");
        }
    }

    
     
     
     
      private void usuarios(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        
              response.sendRedirect("Admin/Usuarios.jsp");

         

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
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
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
