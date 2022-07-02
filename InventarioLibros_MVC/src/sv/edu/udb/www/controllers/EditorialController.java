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

import sv.edu.udb.www.beans.Editorial;
import sv.edu.udb.www.model.EditorialesModel;
import sv.edu.udb.www.utils.Validaciones;

/**
 * Servlet implementation class EditorialController
 * Autor Jared
 */
@WebServlet(name = "EditorialController", urlPatterns = { "/editoriales.do" })

public class EditorialController extends HttpServlet {
	ArrayList<String> errores = new ArrayList<>();
	EditorialesModel md = new EditorialesModel();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		try (PrintWriter c = response.getWriter()) {
			if (request.getParameter("op") == null) {
				listar(request, response);
				return;
			}
			String operacion = request.getParameter("op");

			switch (operacion) {
			case "listar":
				listar(request, response);
				break;
			case "nuevo":
				request.getRequestDispatcher("/editoriales/nuevoEditorial.jsp").forward(request, response);
				break;

			case "insertar":
				insertar(request, response);
				break;

			case "obtener":
				obtener(request, response);
				break;

			case "modificar":
				modificar(request, response);
				break;

			case "eliminar":
				eliminar(request, response);

				break;
			default:
		 request.getRequestDispatcher("/error404.jsp").forward(request, response);
				break;
			}
		}
	}
	
	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
		// + sign on the left to edit the code.">
		/**
		 * Handles the HTTP <code>GET</code> method.
		 *
		 * @param request  servlet request
		 * @param response servlet response
		 * @throws ServletException if a servlet-specific error occurs
		 * @throws IOException      if an I/O error occurs 21
		 */
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			processRequest(request, response);
		}

		/**
		 * Handles the HTTP <code>POST</code> method.
		 *
		 * @param request  servlet request
		 * @param response servlet response
		 * @throws ServletException if a servlet-specific error occurs
		 * @throws IOException      if an I/O error occurs
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


	private void listar(HttpServletRequest request, HttpServletResponse response) {

		try {
			request.setAttribute("listaEditorial", md.listarEditoriales());
			request.getRequestDispatcher("/editoriales/listaEditorial.jsp").forward(request, response);

		} catch (SQLException | ServletException | IOException ex) {
			Logger.getLogger(EditorialController.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}

	private void insertar(HttpServletRequest request, HttpServletResponse response) {

		try {
			errores.clear();
			Editorial elEditorial = new Editorial();

			if (Validaciones.isEmpty(request.getParameter("codigo"))) {
				errores.add("El codigo del editorial es obligatorio");
			} else if (!Validaciones.esCodigoEditorial(request.getParameter("codigo"))) {
				errores.add("El codigo del editorial debe tener el formato correcto EDI000");
			}
			if (Validaciones.isEmpty(request.getParameter("nombre"))) {
				errores.add("El nombre del editorial es obligatorio");
			}
			if (Validaciones.isEmpty(request.getParameter("contacto"))) {
				errores.add("El contacto del editorial es obligatorio");
			}
			if (Validaciones.isEmpty(request.getParameter("telefono"))) {
				errores.add("El telefono del editorial es obligatorio");
			}
			else if (!Validaciones.esTelefono(request.getParameter("telefono"))) {
				errores.add("El telefono del editorial debe tener el formato correcto 0000-0000");
			}
			if (errores.size() > 0) {
				request.setAttribute("editorial", elEditorial);
				request.setAttribute("listaErrores", errores);
				request.getRequestDispatcher("editoriales.do?op=nuevo").forward(request, response);
			} else {
				elEditorial.setCodigoEditorial(request.getParameter("codigo"));
				elEditorial.setNombreEditorial(request.getParameter("nombre"));
				elEditorial.setContacto(request.getParameter("contacto"));
				elEditorial.setTelefono(request.getParameter("telefono"));

				if (md.insertarEditorial(elEditorial) > 0) {
					request.getSession().setAttribute("exito", "Editorial Registrado");
					response.sendRedirect(request.getContextPath() + "/editoriales.do?op=listar");
				} else {
					request.getSession().setAttribute("fracaso",
							"El editorial no ha sido ingresado" + " ya existe un editorial con este codigo");
					response.sendRedirect(request.getContextPath() + "/editoriales.do?op=listar");

				}

			}
		} catch (ServletException ex) {
			Logger.getLogger(EditorialController.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(EditorialController.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(EditorialController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void obtener(HttpServletRequest request, HttpServletResponse response) {
		try {

			String codigo = request.getParameter("id");
			Editorial elEditorial = md.obtenerEditorial(codigo);

			if (elEditorial != null) {
				request.setAttribute("editorial", elEditorial);
				request.getRequestDispatcher("/editoriales/editarEditorial.jsp").forward(request, response);

			} else {
				response.sendRedirect(request.getContextPath() + "/error404.jsp");
			}
		} catch (SQLException | IOException | ServletException ex) {
			Logger.getLogger(AutoresController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void modificar(HttpServletRequest request, HttpServletResponse response) {

		try {
			errores.clear();
			Editorial elEditorial = new Editorial();

			if (Validaciones.isEmpty(request.getParameter("codigo"))) {
				errores.add("El codigo del editorial es obligatorio");
			} else if (!Validaciones.esCodigoEditorial(request.getParameter("codigo"))) {
				errores.add("El codigo del editorial debe tener el formato correcto EDI000");
			}
			if (Validaciones.isEmpty(request.getParameter("nombre"))) {
				errores.add("El nombre del editorial es obligatorio");
			}
			if (Validaciones.isEmpty(request.getParameter("contacto"))) {
				errores.add("El contacto del editorial es obligatorio");
			}
			  if (!Validaciones.esTelefono(request.getParameter("telefono"))) {
				errores.add("El telefono del editorial debe tener el formato correcto 0000-0000");
			}
			if (errores.size() > 0) {
				request.setAttribute("editorial", elEditorial);
				request.setAttribute("listaErrores", errores);
				request.getRequestDispatcher("editoriales.do?op=obtener").forward(request, response);
			} else {
				elEditorial.setCodigoEditorial(request.getParameter("codigo"));
				elEditorial.setNombreEditorial(request.getParameter("nombre"));
				elEditorial.setContacto(request.getParameter("contacto"));
				elEditorial.setTelefono(request.getParameter("telefono"));

				if (md.modificarEditorial(elEditorial) > 0) {
					request.getSession().setAttribute("exito", "Editorial Modificado Exitosamente");
					response.sendRedirect(request.getContextPath() + "/editoriales.do?op=listar");
				} else {
					request.getSession().setAttribute("fracaso",
							"El editorial no ha sido modificado" + " ya existe un editorial con este codigo");
					response.sendRedirect(request.getContextPath() + "/editoriales.do?op=listar");

				}

			}
		} catch (ServletException ex) {
			Logger.getLogger(LibrosController.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(LibrosController.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(LibrosController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response) {
		try {
			String codigo = request.getParameter("id");
			if (md.eliminarEditorial(codigo) > 0) {
				request.setAttribute("exito", "Editorial eliminado exitosamente");

			} else {
				request.setAttribute("fracaso", "No se puede eliminar este editorial");
			}
			request.getRequestDispatcher("/editoriales.do?op=listar").forward(request, response);
		} catch (SQLException | ServletException | IOException ex) {
			Logger.getLogger(LibrosController.class.getName()).log(Level.SEVERE, null, ex);

		}
	}
 
}
