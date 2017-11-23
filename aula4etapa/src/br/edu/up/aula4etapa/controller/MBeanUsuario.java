package br.edu.up.aula4etapa.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.edu.up.aula4etapa.dao.UsuarioDao;
import br.edu.up.aula4etapa.entity.Usuario;

@ManagedBean
public class MBeanUsuario {

	private String email;
	private String senha;
	
	public String login() {
		
		//procuro pelo usuario no banco de dados
		Usuario usuario = new UsuarioDao().buscar(email, senha);
				
		//se o usuário for null ou melhor não for encontrado
		//envio uma mensagem para tela avisando
		if (usuario == null) {
			FacesContext.getCurrentInstance().
				addMessage("", 
			new FacesMessage(FacesMessage.SEVERITY_ERROR, 
					"Login ou senha inválidos!", ""));
			return "";
		}	
		
		//capture o objeto de request
		//nele é possível recuperar a sessão		
		HttpServletRequest req = (HttpServletRequest) 
				FacesContext.getCurrentInstance().
				getExternalContext().getRequest();
		//adiciono na sessão o usuário que fez o login
		req.getSession().setAttribute("usuario", usuario);
		
		//redireciono para tela que ele estava tentando acessar
		return ""+req.getSession().getAttribute("pagina");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
