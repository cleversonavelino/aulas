package br.edu.up.aula4etapa.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.up.aula4etapa.dao.JogoDao;
import br.edu.up.aula4etapa.entity.Jogo;

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
		Jogo jogo = new JogoDao().buscar(Integer.parseInt(id));
		
		File f = new File(jogo.getCaminhoImagem());
		FileInputStream fis = new FileInputStream(f);
		byte[] arrayImagem = new byte[(int) f.length()];
		fis.read(arrayImagem);
		
		response.getOutputStream().write(arrayImagem);
	}


}
