package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.CadeadoDAO;
import model.beans.Cadeado;

@WebServlet("/admin")
public class ServletMenuAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cadeado objCad = new Cadeado();
		CadeadoDAO objCadDAO = new CadeadoDAO();

		String codigo = request.getParameter("txtCod");
		String senha = request.getParameter("txtSenha");

		objCad.setCoCadeado(codigo);
		objCad.setCoSenha(senha);
		try {
			objCadDAO.create(objCad);

		} catch (SQLException e) {
			response.sendRedirect("../err/errDataBase.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
