package br.com.crud.model;

public class Cliente {
	
	private int id_Cli;
	private String nome;
	private String cpf;
	private String endereco;
	
	public int getId_Cli() {
		return id_Cli;
	}
	public void setId_Cli(int id_Cli) {
		this.id_Cli = id_Cli;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
