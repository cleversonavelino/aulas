package aula4etapa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "mBeanJogo")
public class MBeanJogo {

	static private ArrayList<Jogo> jogos = new ArrayList<Jogo>();

	private String nome;
	private String descricao;
	private Date data;
	private static BigDecimal valor;
	
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
