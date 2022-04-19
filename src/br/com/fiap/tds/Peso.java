package br.com.fiap.tds;

import java.util.Date;

/** 
 * Historico Peso do Usuario
 */
public class Peso {
	//Atributos
	/**
	 * Data do peso
	 */
	private Date data;
	/**
	 * Valor do peso
	 */
	private float valor;
	
	// Metodos Personalizados
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Adiciona novo peso
     */
	public void adicionarPeso(float valor, Date data) {
		System.out.print("Valor adicionado com sucesso!");
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Deleta peso
     */
	public void deletarPeso() {
		System.out.print("Valor deletado com sucesso!");
	}
	/** 
	* Visualizar usuario pesquisado
	* @return todos os atributos da classe 
	*/
	public String visualizar() {
		return "Peso [data=" + data + ", valor=" + valor + "]";
	}
	
	// Metodos Especiais - Getters/Setters
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
