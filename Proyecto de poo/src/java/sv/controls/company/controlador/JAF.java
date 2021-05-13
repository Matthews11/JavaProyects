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
import sv.controls.company.Recursos.SeleccionAJF;
import sv.controls.company.model.CasosBeans;

/**
 *
 * @author jared
 */
@WebServlet(name = "JAF", urlPatterns = {"/JAF"})
public class JAF extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
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
        CasosBeans CB = new CasosBeans();
        SeleccionAJF S = new SeleccionAJF();
        JAFDao AF = new JAFDao();

        String descripcion = request.getParameter("mensaje");
        //     String pdf = request.getParameter("pdf");
        String jd = request.getParameter("jd");
        String departamento = request.getParameter("depa");

        if ("".equals(departamento)||"".equals(jd)||"".equals(descripcion)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("Jefe de area funcional/JefeFuncional.jsp");

        } else {

            S.verificar(descripcion, jd, departamento);
            

            //      AF.ingresar(CB);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");

            c.println("</script>");
            response.sendRedirect("Jefe de area funcional/Monitorear.jsp");
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
            Logger.getLogger(JAF.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(JAF.class.getName()).log(Level.SEVERE, null, ex);
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
