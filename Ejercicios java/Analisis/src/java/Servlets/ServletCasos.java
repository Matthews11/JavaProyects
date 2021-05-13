/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jared
 */
@WebServlet(name = "ServletCasos", urlPatterns = {"/ServletCasos"})
public class ServletCasos extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        ResultSet rs = null;
            Connection conexion = null;
            String ids = request.getParameter("codigo");
            String descripcion = request.getParameter("descripcion");
            String estado = request.getParameter("estado");
            
            if ("".equals(ids) || "".equals(descripcion) || "".equals(estado))
            {
                out.println("Ingrese valores en los campos correspondientes y NO LO DEJE VACIO ");
              response.sendRedirect("Casos.html");
            }
            
            
            
            try {
//Leemos el driver de Mysql
                Class.forName("com.mysql.jdbc.Driver");
// Se obtiene una conexión con la base de datos.
                conexion = DriverManager.getConnection(
                        "jdbc:mysql://localhost:6666/analisis?useSSL=false", "root", "12345");
// Permite ejecutar sentencias SQL sin parámetros
                Statement s = conexion.createStatement();
                s.executeUpdate("Insert into caso "+"values(" + ids + ",\"" + descripcion + "\",\"" + estado  + "\")");
                rs = s.executeQuery("select * from caso");
//Decimos que nos hemos conectado
                out.println("<html>");
                out.println("<body>");
                out.println("<h1>Datos Ingresados Exitosamente</h1>");
                
                out.println("<table align='center' with='75%' border=1>");
                out.println("<tr><th>Codigo</th><th>Descripcion</th><th>Estado</th></tr>");
                
                while (rs.next()) {
                    out.println("<tr><td>" + rs.getInt("Id_Caso") + "</td><td>"
                            + rs.getString("Descripcion") + "</td><td>" + rs.getString("Estado_Caso") + "</td></tr>");
                }
                out.println("</table>");
                out.println("</body>");
                out.println("</html>");
                 out.println("<li><a href=\"index.html\">Atras</a></li> ");
                conexion.close();
            } catch (ClassNotFoundException e1) 
            {
 
                out.println("ERROR:No encuentro el driver de la BD: "
                        + e1.getMessage());
            } catch (SQLException e2) {
 
                out.println("ERROR:Fallo en SQL: " + e2.getMessage());
            } finally {
                out.close();
            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
