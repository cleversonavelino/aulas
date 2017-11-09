package br.edu.up.aula4etapa.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.edu.up.aula4etapa.dao.JogoDao;
import br.edu.up.aula4etapa.entity.Jogo;

@ManagedBean(name = "mBeanJogo")
public class MBeanJogo {

	private ArrayList<Jogo> jogos = new ArrayList<Jogo>();

	private Integer id;
	private String nome;
	private String descricao;
	private Date data;
	private BigDecimal valor;
	private String tipoJogo;

	@PostConstruct
	public void carregar() {
		jogos = new JogoDao().listar();
	}

	public void salvar() {
		
		Jogo jogo = new Jogo();
		jogo.setId(this.id);
		jogo.setNome(nome);
		jogo.setDescricao(descricao);
		
		if (this.id == null) {
			new JogoDao().inserir(jogo);
		} else {
			new JogoDao().alterar(jogo);	
		}
		
		jogos = new JogoDao().listar();
	}

	public void alterar(Jogo jogo) {
		this.id = jogo.getId();
		this.nome = jogo.getNome();
		this.descricao = jogo.getDescricao();
	}

	public void excluir(Jogo jogo) {
		new JogoDao().remover(jogo.getId());
		jogos = new JogoDao().listar();
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getTipoJogo() {
		return tipoJogo;
	}

	public void setTipoJogo(String tipoJogo) {
		this.tipoJogo = tipoJogo;
	}

}
