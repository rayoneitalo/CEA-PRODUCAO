package controller.persistence;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.CadeadoDAO;
import model.beans.Cadeado;

@WebServlet()
public class ServletCadeado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cadeado objCad = new Cadeado();
		CadeadoDAO objCadDAO = new CadeadoDAO();

		String txtCod = request.getParameter("txtCod");
		String txtSenha = request.getParameter("txtSenha");

		objCad.setCoCadeado(txtCod);
		objCad.setCoSenha(txtSenha);
		try {
			objCadDAO.insert(objCad);
			response.sendRedirect("routes/cadastro.html");

		} catch (SQLException e) {
			response.sendRedirect("err/errDataBase.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
