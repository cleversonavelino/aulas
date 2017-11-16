package br.edu.up.aula4etapa.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.apache.catalina.core.ApplicationPart;

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

	private ApplicationPart imagem;

	@PostConstruct
	public void carregar() {
		jogos = new JogoDao().listar();
	}

	public void salvar() {
		
		//imagem.getSubmittedFileName()
		//imagem.getContentType()
		//
		
		String caminhoImagem = "c:\\imagens\\"+imagem.getSubmittedFileName();
		
		try {
			//cria um espaço de memória que vai armazenar o conteúdo da imagem
			byte [] bytesImagem = new byte[(int) imagem.getSize()];
			//lê o conteudo da imagem e joga dentro do array de bytes
			imagem.getInputStream().read(bytesImagem);			
			//cria uma referência para o arquivo que será criado no lado do server
			File f = new File(caminhoImagem);
			//cria o objeto que irá manipular o arquivo criado
			FileOutputStream fos = new FileOutputStream(f);
			//escreve o conteúdo da imagem (upload) dentro do arquivo no servidor
			fos.write(bytesImagem);			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		Jogo jogo = new Jogo();
		jogo.setId(this.id);
		jogo.setNome(nome);
		jogo.setDescricao(descricao);
		jogo.setCaminhoImagem(caminhoImagem);

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
	
	public String carregarJogo(Jogo jogo) {
		this.id = jogo.getId();
		this.nome = jogo.getNome();
		this.descricao = jogo.getDescricao();
		
		return "telaDetalhesJogo.jsf";
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

	public ApplicationPart getImagem() {
		return imagem;
	}

	public void setImagem(ApplicationPart imagem) {
		this.imagem = imagem;
	}

}
