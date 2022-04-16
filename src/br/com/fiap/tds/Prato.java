package br.com.fiap.tds;
import java.util.Date;

public class Prato {
	
	/**Atributos*/
	/**
	 * Tipo do Prato
	 * */
	private String tipo;
	/**
	 * Data do Prato
	 * */
	private Date data;
	
	/**Métodos Especiais Getters/Setters*/
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
