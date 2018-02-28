package br.edu.up.sistemadevendas.entity;

public class Cliente {

	private Integer id;
	private String nome;
	private Integer idade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
