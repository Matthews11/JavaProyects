/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Dao.ventasDao;
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
import model.ventass;

/**
 *
 * @author jared
 */
@WebServlet(name = "ventas", urlPatterns = {"/ventas"})
public class ventas extends HttpServlet {

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

                case "modificar":
                    modificar(request, response);
                    break;
                case "eliminar":
                    eliminar(request, response);
                    break;
                default:
                    index(request, response);
                    break;

            }
        }
    }

    private void ingresar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        ventass v = new ventass();
        ventasDao VD = new ventasDao();

        String linea = request.getParameter("tl");

        String fecha = request.getParameter("fecha");

        String descripcion = request.getParameter("mensaje");

        if ("".equals(linea) || "".equals(fecha) || "".equals(descripcion)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("IngresarV.jsp");

        } else {

            switch (linea) {
                case "Linea Blanca":
                    int l = 1;
                    v.setId_linea(l);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                    VD.ingresar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

                case "Electronica":
                    int l1 = 2;
                    v.setId_linea(l1);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                    VD.ingresar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

                case "Ferreteria":
                    int l1l = 3;
                    v.setId_linea(l1l);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                    VD.ingresar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

                case "Hogar":
                    int l1ll = 4;
                    v.setId_linea(l1ll);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                    VD.ingresar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

            }

        }
    }

    private void modificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        ventass v = new ventass();
        ventasDao VD = new ventasDao();

        String id = request.getParameter("id");
        String linea = request.getParameter("tl");

        String fecha = request.getParameter("fecha");

        String descripcion = request.getParameter("mensaje");

        if ("".equals(linea) || "".equals(fecha) || "".equals(descripcion) || "".equals(id)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("modificarV.jsp");

        } else {
            switch (linea) {
                case "Linea Blanca":
                    int l = 1;
                    int id1 = Integer.parseInt(id); 
                    v.setId_venta(id1);
                    v.setId_linea(l);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                    VD.modificar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

                case "Electronica":
                    int l1 = 2;
                    
                     int id2 = Integer.parseInt(id); 
                    v.setId_venta(id2);
                    v.setId_linea(l1);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                     VD.modificar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

                case "Ferreteria":
                    int l1l = 3;
                     int id3 = Integer.parseInt(id); 
                    v.setId_venta(id3);
                    v.setId_linea(l1l);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                     VD.modificar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

                case "Hogar":
                    int l1ll = 4;
                     int id4 = Integer.parseInt(id); 
                    v.setId_venta(id4);
                    v.setId_linea(l1ll);
                    v.setFecha_venta(fecha);
                    v.setDescripcion(descripcion);

                     VD.modificar(v);
                    c.println("<script type=\"text/javascript\">");
                    c.println("< alert('Datos ingresado correctamente'); ");

                    c.println("</script>");
                    response.sendRedirect("mostrarV.jsp");
                    break;

            }

        }
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();
        ventass v = new ventass();
        ventasDao VD = new ventasDao();

        String id = request.getParameter("id");

        if ("".equals(id)) {
            c.println("<script type=\"text/javascript\">");
            c.println("alert('No deje vacio los campos');");

            c.println("</script>");
            response.sendRedirect("eliminarV.jsp");

        } else {

            int id1 = Integer.parseInt(id);
            v.setId_venta(id1);

            VD.ELIMINAR(v);
            c.println("<script type=\"text/javascript\">");
            c.println("< alert('Datos ingresado correctamente'); ");

            c.println("</script>");
            response.sendRedirect("mostrarV.jsp");
        }
    }

    private void index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter c = response.getWriter();

        response.sendRedirect("index.jsp");

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
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
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
