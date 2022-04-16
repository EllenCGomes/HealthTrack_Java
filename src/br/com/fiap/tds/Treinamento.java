package br.com.fiap.tds;
import java.util.Date;


public class Treinamento {
	/** Atributos */
	private Date duracao;
	private String intensidade;
	private int totalCalorias;
	public Date getDuracao() {
		return duracao;
	
	/** Metodo para visualizar o treinamento */
	public String toString() {
		return "Treinamento [duracao=" + duracao + ", intensidade=" + intensidade + ", totalCalorias=" + totalCalorias
					+ "]";
	
	
	/** Metodos Getters/Setters */
	}

	}
	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}
	public String getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}
	public int getTotalCalorias() {
		return totalCalorias;
	}
	public void setTotalCalorias(int totalCalorias) {
		this.totalCalorias = totalCalorias;
	}
	
	
	
	}
