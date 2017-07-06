package br.edu.ctup.chatrest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.ctup.chatrest.entity.Chat;
import br.edu.ctup.chatrest.notification.SendNotification;

@Path("/servicorest")
public class ChatRest {
	
	static List<Chat> mensagens = new ArrayList<Chat>();
	static List<String> tokens = new ArrayList<String>();
	
	static {
		Chat c = new Chat();
		c.setMensagem("Bem vindo ao Chat!!");
		c.setNome("Prof. Cleverson");
		
		mensagens.add(c);
		mensagens.add(c);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Chat> getMensagens() {
		return mensagens;
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,
		MediaType.APPLICATION_JSON})
	@Produces("text/plain")
	@Path("/post")
	public void addMensagem(Chat chat) {
		mensagens.add(chat);
		
		SendNotification s = new SendNotification();
		for (String token : tokens) {
			try {
				s.enviar(token, chat);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,
		MediaType.APPLICATION_JSON})
	@Produces("text/plain")
	@Path("/token")
	public void addMensagem(String token) {
		tokens.add(token);
	}
	
	
}
