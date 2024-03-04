package model;

public class Motorista {
	
	int codigom;
	String nome;
	String naturalidade;
	
	public int getCodigom() {
		return codigom;
	}
	public void setCodigom(int codigom) {
		this.codigom = codigom;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	

}
