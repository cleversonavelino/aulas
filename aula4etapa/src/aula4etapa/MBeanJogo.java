package aula4etapa;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "mBeanJogo")
public class MBeanJogo {

	static private ArrayList<Jogo> jogos = new ArrayList<Jogo>();

	private String nome;
	private String descricao;

	public void salvar() {
		Jogo jogo = new Jogo();
		jogo.setNome(nome);
		jogo.setDescricao(descricao);

		jogos.add(jogo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(ArrayList<Jogo> jogos) {
		this.jogos = jogos;
	}

}
