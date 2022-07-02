package sv.edu.udb.www.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sv.edu.udb.www.model.AutoresModel;
import sv.edu.udb.www.model.EditorialesModel;
import sv.edu.udb.www.model.GenerosModel;
import sv.edu.udb.www.model.LibrosModel;

/**
 * Servlet implementation class IndexController 
 * Autor Jared
 */
@WebServlet(name = "IndexController", urlPatterns = { "/index.do" })
public class IndexController extends HttpServlet {

	AutoresModel autor = new AutoresModel();
	EditorialesModel editorial = new EditorialesModel();
	GenerosModel generos = new GenerosModel();
	LibrosModel libros = new LibrosModel();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			if (request.getParameter("op") == null) {
				mostrar(response, request);
				return;
			}

		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	public void mostrar(HttpServletResponse response, HttpServletRequest request) {

		try {
			request.setAttribute("totalAutores", autor.totalAutores());
			 
			request.getRequestDispatcher("index.jsp").forward(request, response);

		} catch (SQLException | ServletException | IOException ex) {
			Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
