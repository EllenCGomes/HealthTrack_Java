package br.com.fiap.tds;

import java.util.Date;

public class FrequenciaCardiaca {
	/**
	 * Atributos
	 */
	
	/**
	 * Data do batimento
	 */
	Date data;
	/**
	 * Valor do batimento
	 */
	int valor;
	/**
	 * Se houve arritimia
	 */
	boolean arritmia;
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Adiciona novo batimento cardiaco
     */
	public void adicionaFrequenciaCardiaca(int valor, boolean arritmia, Date data) {
		System.out.print("Valor adicionado com sucesso!");
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Deleta batimento cardiaco
     */
	public void deletarFrequenciaCardiaca() {
		System.out.print("Valor deletado com sucesso!");
	}
	/**Metodo de busca*/
	public String visualizar() {
		return "FrequenciaCardiaca [data=" + data + ", valor=" + valor + ", arritmia=" + arritmia + "]";
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Verifica se hovue arritmia
     */
	public void verificarArritmia() {
		if (arritmia == true) {
			System.out.print("Alerta de arritmia!");
		}
	}
	/**Métodos Especiais Getters/Setters*/
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isArritimia() {
		return arritmia;
	}
	public void setArritimia(boolean arritimia) {
		this.arritmia = arritimia;
	}
}