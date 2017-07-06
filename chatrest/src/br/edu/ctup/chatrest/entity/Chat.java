package br.edu.ctup.chatrest.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Chat {

	private String nome;
	private String mensagem;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
