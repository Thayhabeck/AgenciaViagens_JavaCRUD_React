package br.com.crud.model;

public class Viagem {
	
	private int id_Viag;
	private String data_Ida;
	private String data_Volta;
	private int diarias;
	private int id_Cli;
	private Cliente cliente;
	private int id_Dest;
	private Destino destino;
	
	public int getId_Viag() {
		return id_Viag;
	}
	public void setId_Viag(int id_Viag) {
		this.id_Viag = id_Viag;
	}
	public String getData_Ida() {
		return data_Ida;
	}
	public void setData_Ida(String data_Ida) {
		this.data_Ida = data_Ida;
	}
	public String getData_Volta() {
		return data_Volta;
	}
	public void setData_Volta(String data_Volta) {
		this.data_Volta = data_Volta;
	}
	public int getDiarias() {
		return diarias;
	}
	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}
	public int getId_Cli() {
		return id_Cli;
	}
	public void setId_Cli(int id_Cli) {
		this.id_Cli = id_Cli;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getId_Dest() {
		return id_Dest;
	}
	public void setId_Dest(int id_Dest) {
		this.id_Dest = id_Dest;
	}
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	

}
