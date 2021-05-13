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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sv.controls.company.DAO.DepartamentoDao;
import sv.controls.company.model.DepartamentoBeans;

/**
 *
 * @author jared
 */
@WebServlet(name = "departamento", urlPatterns = {"/departamento"})
public class departamento extends HttpServlet {

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
                     default:
                    administrador(request,response);
                    break;
                        

            }
        }
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        DepartamentoBeans DB = new DepartamentoBeans();
        DepartamentoDao DDAO = new DepartamentoDao();

        int id = Integer.parseInt(request.getParameter("id"));
        String departamento = request.getParameter("depa");

        if ("".equals(departamento) || "".equals(id)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');"); 
           
            c.println("</script>");
              response.sendRedirect("Admin/Administrador.jsp");

        } else {
            DB.setIdDepartamento(id);
            DB.setNombreDepartamento(departamento);
            DDAO.modificar(DB);
            
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos modificados correctamente'); "); 
            response.sendRedirect("Admin/Administrador.jsp");
            
            c.println("</script>");

        }

    }
    
     private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        DepartamentoBeans DB = new DepartamentoBeans();
        DepartamentoDao DDAO = new DepartamentoDao();

        int id = Integer.parseInt(request.getParameter("id"));
        String departamento = request.getParameter("depa");

        if ("".equals(departamento) || "".equals(id)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');"); 
            c.println("</script>");
              response.sendRedirect("Admin/Administrador.jsp");

        } else {
            DB.setIdDepartamento(id);
            DB.setNombreDepartamento(departamento);
            DDAO.ELIMINAR(DB);
            
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos eliminado correctamente'); "); 
            response.sendRedirect("Admin/Administrador.jsp");
            
            c.println("</script>");

        }

    }
     
      private void administrador(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        
              response.sendRedirect("Admin/Administrador.jsp");

         

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
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
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
    private void ingresar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        DepartamentoBeans DB = new DepartamentoBeans();
        DepartamentoDao DDAO = new DepartamentoDao();

        String departamento = request.getParameter("depa");

        if ("".equals(departamento)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");
             
           
            c.println("</script>");
             response.sendRedirect("Admin/Departamentos/ingresardepa.jsp");

        } else {

            DB.setNombreDepartamento(departamento);

            DDAO.ingresar(DB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");
           
 
            c.println("</script>");
    response.sendRedirect("Admin/Administrador.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(departamento.class.getName()).log(Level.SEVERE, null, ex);
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
