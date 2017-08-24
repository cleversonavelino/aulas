package br.edu.up.aula.controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.apache.catalina.core.ApplicationPart;

import br.edu.up.aula.entidade.Cliente;

@ManagedBean(name = "mBeanCliente")
public class MBeanCliente {

	private Long id;
	private String nome;
	private Integer idade;
	private String genero;
	private Date dataDeNascimento;
	private Double limiteDeCredito;

	private static List<Cliente> clientes = new ArrayList<Cliente>();
	static long count = 1;

	private ApplicationPart foto;

	public String salvar() throws IOException {
		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);

		String caminhoImagem = "";
		if (foto != null) {
			byte[] bytes = new byte[(int) foto.getSize()];
			foto.getInputStream().read(bytes);

			File f = new File("c:\\temp\\" + foto.getSubmittedFileName());

			FileOutputStream fo = new FileOutputStream(f);
			fo.write(bytes);
			fo.close();

			caminhoImagem = "c:\\temp\\" + foto.getSubmittedFileName();
		}

		if (id == null || id.equals(0l)) {
			Cliente c = new Cliente();
			c.setId(count++);
			c.setNome(nome);
			c.setIdade(idade);
			c.setGenero(genero);
			c.setCaminhoImagem(caminhoImagem);

			clientes.add(c);
		} else {
			for (Cliente c : clientes) {
				if (c.getId().equals(this.id)) {
					c.setNome(nome);
					c.setIdade(idade);
					c.setGenero(genero);
				}
			}
		}

		return "";
	}

	public String excluir(Cliente cliente) {
		clientes.remove(cliente);

		return "";
	}

	public String carregar(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.idade = cliente.getIdade();
		this.genero = cliente.getGenero();
		return "";
	}

	public String carregarCliente(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.idade = cliente.getIdade();
		this.genero = cliente.getGenero();
		return "detalhesCliente.jsf";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		MBeanCliente.clientes = clientes;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ApplicationPart getFoto() {
		return foto;
	}

	public void setFoto(ApplicationPart foto) {
		this.foto = foto;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(Double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

}
