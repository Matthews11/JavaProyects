/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.controlador;

import sv.controls.company.DAO.*;
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
import sv.controls.company.model.UsuariosBeans;

/**
 *
 * @author jared
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
            UsuariosBeans user = new UsuariosBeans();
            LoginDao LDAO = new LoginDao();
         
         int rol=0;
        String nombre = request.getParameter("name");
        String contrasena = request.getParameter("password");
        
     
        user.setNombre_Usuario(nombre);
        user.setContraseña(contrasena);  
        rol= LDAO.comprobar(user);
       
        request.setAttribute("rol", rol);
         request.setAttribute("nombre", nombre);
        RequestDispatcher envio = request.getRequestDispatcher("Login.jsp");
          envio.forward(request,response);
        
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
            
            /*      String action = request.getServletPath();
            try {
            switch(action){
            
            //Si la peticion que viene es un insert
            case "/logearse":
            logearse(request,response);
            break;
            
            
            }
            } catch (Exception e) {
            throw new ServletException(e);
            }
            
        */ } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
     private void logearse(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
          
        
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
