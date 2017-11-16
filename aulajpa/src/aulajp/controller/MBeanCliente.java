package aulajp.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.apache.catalina.core.ApplicationPart;

import aulajpa.dao.ClienteDao;
import aulajpa.entidade.Cliente;

@ManagedBean(name = "mBeanCliente")
public class MBeanCliente {

	private Integer id;
	private String nome;

	private ApplicationPart imagem;

	private List<Cliente> clientes;

	@PostConstruct
	public void carregar() {
		clientes = new ClienteDao().listar();
	}

	public void salvar() {
		
		String caminhoImagem = "";
		
		if (imagem != null && imagem.getSubmittedFileName() != null) {
			
			caminhoImagem = "c:\\imagens\\" + imagem.getSubmittedFileName();
			
			try {
				// cria um espaço de memória que vai armazenar o conteúdo da imagem
				byte[] bytesImagem = new byte[(int) imagem.getSize()];
				// lê o conteudo da imagem e joga dentro do array de bytes
				imagem.getInputStream().read(bytesImagem);
				// cria uma referência para o arquivo que será criado no lado do server
				File f = new File(caminhoImagem);
				// cria o objeto que irá manipular o arquivo criado
				FileOutputStream fos = new FileOutputStream(f);
				// escreve o conteúdo da imagem (upload) dentro do arquivo no servidor
				fos.write(bytesImagem);

				fos.close();

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		Cliente c = new Cliente();
		c.setNome(nome);
		c.setCaminhoImagem(caminhoImagem);

		new ClienteDao().salvar(c);
		
		clientes = new ClienteDao().listar();
	}

	public void alterar(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
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

	public ApplicationPart getImagem() {
		return imagem;
	}

	public void setImagem(ApplicationPart imagem) {
		this.imagem = imagem;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
