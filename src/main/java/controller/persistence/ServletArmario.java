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

		String txtLoc = request.getParameter("txtLoc");
		String txtNumber = request.getParameter("txtNumber");

		objArmario.setNuArmario(txtNumber);
		objArmario.setLocalizacaoIdLocalizacao(txtLoc);

		try {
			objArmarioDAO.insert(objArmario);
			response.sendRedirect("routes/cadastro.html");
		} catch (Exception e) {
			response.sendRedirect("err/errDataBase.html");
			
			
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
