package br.edu.up.aula.controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.apache.catalina.core.ApplicationPart;

import br.edu.up.aula.dao.ClienteDao;
import br.edu.up.aula.dao.EstadoDao;
import br.edu.up.aula.dao.InterfaceDao;
import br.edu.up.aula.entidade.Cliente;
import br.edu.up.aula.entidade.Estado;

@ManagedBean(name = "mBeanCliente")
public class MBeanCliente {

	private Long id;
	private String nome;
	private Integer idade;
	private String genero;
	private Date dataDeNascimento;
	private Double limiteDeCredito;
	private Long idEstado;

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Estado> estados = new ArrayList<Estado>();

	private ApplicationPart foto;

	@PostConstruct
	public void carregarClientes() {
		ClienteDao clienteDao = new ClienteDao();
		clientes = clienteDao.listar();
		estados = new EstadoDao().listar();
	}

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

		InterfaceDao<Estado> estadoDao = 											new EstadoDao();
		Estado estado = estadoDao.buscar(idEstado);
		
		estadoDao.listar();
		
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setIdade(idade);
		c.setGenero(genero);
		c.setCaminhoImagem(caminhoImagem);
		c.setEstado(estado);

		ClienteDao clienteDao = new ClienteDao();

		if (id == null && id.equals(new Long(0))) {
			clienteDao.inserir(c);
		} else {
			c.setId(id);
			clienteDao.atualizar(c);
		}

		clientes = clienteDao.listar();

		return "";
	}

	public String excluir(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.remover(cliente);

		clientes = clienteDao.listar();

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
		this.clientes = clientes;
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

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
	

}
