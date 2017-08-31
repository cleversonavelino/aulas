package br.edu.up.aula.controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.up.aula.dao.ClienteDao;
import br.edu.up.aula.entidade.Cliente;

/**
 * Servlet implementation class ExamploServlet
 */
@WebServlet("/ImagemClienteServlet")
public class ImagemClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ImagemClienteServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    	
    	String id = request.getParameter("id");
    	Cliente c = new ClienteDao().buscar(new Long(id));
    	
    	String caminhoDaImagem = c.getCaminhoImagem();
    	
    	File f = new File(caminhoDaImagem);
    	byte[] arquivo = new byte[(int) f.length()];
    	FileInputStream fi = new FileInputStream(f);
    	
    	fi.read(arquivo);
    	
    	response.getOutputStream().write(arquivo);
    	
    }	

}
