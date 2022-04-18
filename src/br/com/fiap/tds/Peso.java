package br.com.fiap.tds;

import java.util.Date;

public class Peso {
	/**
	 *Atributos
	 */
	
	/**
	 * Data do peso
	 */
	private Date data;
	/**
	 * Valor do peso
	 */
	private float valor;
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Adiciona novo peso
     */
	public void adicionarPeso(float valor, Date data) {
		System.out.print("Valor adicionado com sucesso!");
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Deleta peso
     */
	public void deletarPeso() {
		System.out.print("Valor deletado com sucesso!");
	}
	/**
	 * Método de busca
	 */
	public String visualizar() {
		return "Peso [data=" + data + ", valor=" + valor + "]";
	}
	/**Métodos Especiais Getters/Setters*/
	
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
