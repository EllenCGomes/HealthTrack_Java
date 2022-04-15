package br.com.fiap.tds;

import java.util.Date;

public class Peso {
	/**Atributos*/
	private Date data;
	private float valor;
	
	/**Metodos*/
	public Date getData() {
		return data;
	}
	
	public String visualizar() {
		return "Peso [data=" + data + ", valor=" + valor + "]";
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
