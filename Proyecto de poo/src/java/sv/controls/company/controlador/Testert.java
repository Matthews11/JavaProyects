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
import sv.controls.company.DAO.testDao;
import sv.controls.company.Recursos.SeleccionD;
import sv.controls.company.model.Bitacora_TestingBeans;
import sv.controls.company.model.CasosBeans;

/**
 *
 * @author Jared
 */
@WebServlet(name = "Testert", urlPatterns = {"/Testert"})
public class Testert extends HttpServlet {
    
    int avance ;

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

                case "Rechazar":
                    rechazar(request, response);
                    break;
                //   case "eliminar":
                //       eliminar(request, response);
                //       break;
                default:
                    //    kh   administrador(request,response);
                    break;

            }
        }
    }

    private void aceptar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        CasosBeans CB = new CasosBeans();
        testDao t = new testDao();
        Bitacora_TestingBeans BT = new Bitacora_TestingBeans();

        int id = Integer.parseInt(request.getParameter("id"));
        String fecha = request.getParameter("fecha");

        if ("".equals(id) || "".equals(fecha)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("Testert/Aceptar.jsp");

        } else {

            int estado = 6;
            int tester = 1;
            avance=100;
            BT.setIdCaso(id);
            BT.setIdTesting(tester);
            BT.setFechaPuesta(fecha);
            BT.setIdEmpleado(tester);
            CB.setIdEstadoCaso(estado);
            CB.setIdCaso(id);
            CB.setPorcentajeAvance(avance);

            t.aceptar(BT);
            t.barra(CB);
            t.Estado(CB);

            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");

            c.println("</script>");
            response.sendRedirect("Testert/Probador.jsp");
        }
    }

    private void rechazar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        CasosBeans CB = new CasosBeans();
        testDao t = new testDao();
        Bitacora_TestingBeans BT = new Bitacora_TestingBeans();

        int id = Integer.parseInt(request.getParameter("id"));
        String Observaciones = request.getParameter("Observaciones");
        String fecha = request.getParameter("fecha");

        if ("".equals(Observaciones) || "".equals(id) || "".equals(fecha)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("Testert/Rechazar.jsp");

        } else {
            int estado = 7;
            int tester = 1;
            avance=50;
            BT.setObservacion(Observaciones);
             BT.setIdCaso(id);
            BT.setIdTesting(tester);
            BT.setFechaT(fecha);
            BT.setIdEmpleado(tester);
            CB.setIdEstadoCaso(estado);
            CB.setIdCaso(id);
            CB.setPorcentajeAvance(avance);
            t.rechazar(BT);
            t.Estado(CB);
            t.barra(CB);

            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");

            c.println("</script>");
            response.sendRedirect("Testert/Probador.jsp");
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
            Logger.getLogger(Testert.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Testert.class.getName()).log(Level.SEVERE, null, ex);
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
