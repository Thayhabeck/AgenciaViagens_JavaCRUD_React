package br.com.crud.model;

public class Destino {
	

	private int id_Dest;
	private String Cidade;
	private String Estado;
	private String Descricao;
	private double PrecoDiaria;
	private String url_img;
	
	public int getId_Dest() {
		return id_Dest;
	}
	public void setId_Dest(int id_Dest) {
		this.id_Dest = id_Dest;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public double getPrecoDiaria() {
		return PrecoDiaria;
	}
	public void setPrecoDiaria(double precoDiaria) {
		PrecoDiaria = precoDiaria;
	}
	public String getUrl_img() {
		return url_img;
	}
	public void setUrl_img(String url_img) {
		this.url_img = url_img;
	}

}
