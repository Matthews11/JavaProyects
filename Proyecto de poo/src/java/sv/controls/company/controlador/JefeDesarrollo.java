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
import sv.controls.company.DAO.JAFDao;
import sv.controls.company.Recursos.SeleccionD;
import sv.controls.company.model.CasosBeans;

/**
 *
 * @author jared
 */
@WebServlet(name = "JefeDesarrollo", urlPatterns = {"/JefeDesarrollo"})
public class JefeDesarrollo extends HttpServlet {

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
                case "aceptar":
                    aceptar(request, response);
                    break;

                case "rechazar":
                    rechazar(request, response);
                    break;
                //   case "eliminar":
                //       eliminar(request, response);
                //       break;
                default:
                    //       administrador(request,response);
                    break;

            }
        }
    }

    private void aceptar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();

        SeleccionD S = new SeleccionD();
        String id = request.getParameter("id");
        String mensaje = request.getParameter("mensaje");
        //     String pdf = request.getParameter("pdf");
        String progra = request.getParameter("progra");
        String fecha = request.getParameter("fecha");
         String testert = request.getParameter("test");

        if ("".equals(mensaje) || "".equals(progra) || "".equals(fecha)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("Jefe de desarrollo/Aceptar.jsp");

        } else {

            S.verificar(mensaje, progra, fecha, id, testert);

            //      AF.ingresar(CB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");

            c.println("</script>");
            response.sendRedirect("Jefe de desarrollo/MonitorearP.jsp");
        }
    }

    private void rechazar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        
        CasosBeans CB = new CasosBeans(); 
        JAFDao AF = new JAFDao();

        int id = Integer.parseInt( request.getParameter("id"));
        String mensaje = request.getParameter("mensaje");

        if ("".equals(mensaje) || "".equals(id)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("Jefe de desarrollo/Aceptar.jsp");

        } else {
            int estado=2; 
            int avance=0;
            CB.setRazonRechazo(mensaje);
            CB.setIdEstadoCaso(estado);
            CB.setIdCaso(id); 
            CB.setPorcentajeAvance(avance);
            
            AF.rechazar(CB);
            
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");

            c.println("</script>");
            response.sendRedirect("Jefe de desarrollo/MonitorearP.jsp");
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
            Logger.getLogger(JefeDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(JefeDesarrollo.class.getName()).log(Level.SEVERE, null, ex);
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
