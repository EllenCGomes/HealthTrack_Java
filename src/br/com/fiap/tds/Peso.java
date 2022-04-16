package br.com.fiap.tds;

import java.util.Date;

public class Peso {
	/**Atributos*/
	private Date data;
	private float valor;

	/**Metodos*/
	public void adicionarPeso(float valor, Date data) {
		System.out.print("Valor adicionado com sucesso!");
	}
	
	public void deletarPeso() {
		System.out.print("Valor deletado com sucesso!");
	}
	
	public String visualizar() {
		return "Peso [data=" + data + ", valor=" + valor + "]";
	}
	
	public Date getData() {
		return data;
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
