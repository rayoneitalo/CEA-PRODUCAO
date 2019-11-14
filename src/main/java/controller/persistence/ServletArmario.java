package controller.persistence;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.beans.Armario;
import model.dao.ArmarioDAO;

/**
 * ServletArmario
 */
@WebServlet()
public class ServletArmario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Armario objArmario = new Armario();
		ArmarioDAO objArmarioDAO = new ArmarioDAO();

		String localizacoArmario = request.getParameter("txtLocal");
		Integer numeroArmario = Integer.valueOf(request.getParameter("txtNumber"));
		Integer blocoArmario = Integer.valueOf(request.getParameter("txtbloc"));
		
		objArmario.setNuArmario(numeroArmario);
		objArmario.setLocalizacao(localizacoArmario);
		objArmario.setBloco(blocoArmario);

		try {
			objArmarioDAO.insert(objArmario);
			response.sendRedirect("routes/cadastro.html");
		} catch (Exception e) {
			response.sendRedirect("err/errDataBase.html");
		}

	}

	public void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArmarioDAO objArmarioDAO = new ArmarioDAO();

		request.setAttribute("lista", objArmarioDAO.getLista());
		request.getRequestDispatcher("routes/listaArmarios.jsp").forward(request, response);

	}

	public void listar2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArmarioDAO objArmarioDAO = new ArmarioDAO();

		request.setAttribute("lista", objArmarioDAO.getLista2());
		request.getRequestDispatcher("routes/listaArmarios.jsp").forward(request, response);

	}
	public void listar3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArmarioDAO objArmarioDAO = new ArmarioDAO();

		request.setAttribute("lista", objArmarioDAO.getLista3());
		request.getRequestDispatcher("routes/listaArmarios.jsp").forward(request, response);

	}
	public void listar4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArmarioDAO objArmarioDAO = new ArmarioDAO();

		request.setAttribute("lista", objArmarioDAO.getLista4());
		request.getRequestDispatcher("routes/listaArmarios.jsp").forward(request, response);

	}
	public void listar5(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArmarioDAO objArmarioDAO = new ArmarioDAO();

		request.setAttribute("lista", objArmarioDAO.getLista5());
		request.getRequestDispatcher("routes/listaArmarios.jsp").forward(request, response);

	}

}
