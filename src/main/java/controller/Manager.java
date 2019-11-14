package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.persistence.ServletArmario;
import controller.persistence.ServletCadeado;

/**
 * ServletManager
 */
@WebServlet("/manager")
public class Manager extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ServletArmario objServletArmario = new ServletArmario();
    ServletCadeado objServletCadeado = new ServletCadeado();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("id");
        switch (action) {
        case "1":
            objServletCadeado.doGet(request, response);
            break;
        case "2":
            objServletArmario.doGet(request, response);

            break;
        case "3":
            response.getWriter().println("Cadastro de Periodo letivo");
            break;
        case "4":
            response.getWriter().println("Mapa de armarios");
            break;
        case "btnBl1":
            objServletArmario.listar(request, response);
            break;
        case "btnBl2":
            objServletArmario.listar2(request, response);
            break;
        case "btnBl3":
            objServletArmario.listar(request, response);
            break;
        case "btnBl4":
            objServletArmario.listar(request, response);
            break;
        case "btnBl5":
            objServletArmario.listar(request, response);
            break;
        default:
            response.sendRedirect("routes/cadastro.html");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}