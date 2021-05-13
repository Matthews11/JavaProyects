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
import sv.controls.company.DAO.ProgramadorDao;
import sv.controls.company.model.Bitacora_DeveloperBeans;
import sv.controls.company.model.CasosBeans;

/**
 *
 * @author jared
 */
@WebServlet(name = "Programador", urlPatterns = {"/Programador"})
public class Programador extends HttpServlet {

    int estado = 0;
    int idprogra =1;
    int avance=75;
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

                //   case "modificar":
                //       modificar(request, response);
                //       break;
                //   case "eliminar":
                //       eliminar(request, response);
                //       break;
                default:
                    //       administrador(request,response);
                    break;

            }
        }
    }

    private void ingresar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();

        Bitacora_DeveloperBeans BDB = new Bitacora_DeveloperBeans();
        ProgramadorDao PD = new ProgramadorDao();
        CasosBeans CB = new CasosBeans();

        String actua = request.getParameter("actua");
        String mensaje = request.getParameter("mensaje");
        String Estado = request.getParameter("EC");
        int id = Integer.parseInt(request.getParameter("id"));

        if ("".equals(mensaje) || "".equals(actua) || "".equals(Estado)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("Programador/Programador.jsp");

        } else {

            switch (Estado) {
                case "en desarrollo":
                    estado = 3;
                    

                    BDB.setTitulo(actua);
                    BDB.setDescripcion(mensaje);
                    BDB.setIdCaso(id);
                    BDB.setIdProgramador(idprogra);
                    CB.setIdCaso(id);
                    CB.setIdEstadoCaso(estado);

                    PD.estado(CB);
                    PD.ingresar(BDB);

                    break;

                case "Esperando aprobación de área solicitante":
                    estado = 5;

                    BDB.setTitulo(actua);
                    BDB.setDescripcion(mensaje);
                    BDB.setIdProgramador(idprogra);
                    BDB.setIdCaso(id);
                    CB.setPorcentajeAvance(avance);
                    CB.setIdCaso(id);
                    CB.setIdEstadoCaso(estado);

                    PD.ingresar(BDB);
                    PD.estado(CB);
                    PD.barra(CB);
                    break;

            }

            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");

            c.println("</script>");
            response.sendRedirect("Programador/Programador.jsp");

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
            Logger.getLogger(Programador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Programador.class.getName()).log(Level.SEVERE, null, ex);
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
