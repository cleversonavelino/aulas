package aulajp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aulajpa.dao.ClienteDao;
import aulajpa.entidade.Cliente;

/**
 * Servlet implementation class ServletImagem
 */
@WebServlet("/ServletImagem")
public class ServletImagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletImagem() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		if (id == null || id.equals("")) {
			return;
		}
		Cliente cliente = new ClienteDao().buscar(Integer.parseInt(id));
		
		File f = new File(cliente.getCaminhoImagem());
		FileInputStream fis = new FileInputStream(f);
		byte[] arrayImagem = new byte[(int) f.length()];
		fis.read(arrayImagem);
		fis.close();
		
		response.getOutputStream().write(arrayImagem);
	}


}
