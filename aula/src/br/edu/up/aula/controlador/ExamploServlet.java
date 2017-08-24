package br.edu.up.aula.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExamploServlet
 */
@WebServlet("/ExamploServlet")
public class ExamploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ExamploServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    	String nome = request.getParameter("nome");
    	Integer idade = Integer.valueOf(request.getParameter("idade"));
    	
    	response.getWriter().write("Olá, seu nome é: " + nome);
    	response.getWriter().write("\nOlá, sua idade é: " + idade);
    	
    }

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

	}

}
