package br.com.fiap.tds;

import java.util.Date;

/** 
 * Frequencia Cardiaca do Usuario
 */
public class FrequenciaCardiaca {
	//Atributos
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
	
	// Metodos Personalizados
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Adiciona novo batimento cardiaco
     * @param valor Valor da FC
     * @param arritmia Se a medicao teve arritmia
     * @param data Data da medicao
     */
	public void adicionaFrequenciaCardiaca(int valor, boolean arritmia, Date data) {
		System.out.print("Valor adicionado com sucesso!");
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD)) - Deleta batimento cardiaco
     */
	public void deletarFrequenciaCardiaca() {
		System.out.print("Valor deletado com sucesso!");
	}
	/** 
	 * Visualizar frequencia cardiaca do Usuario
	 * @return todos os atributos da classe 
	 */
	public String visualizar() {
		return "FrequenciaCardiaca [data=" + data + ", valor=" + valor + ", arritmia=" + arritmia + "]";
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Verifica se houve arritmia
     */
	public void verificarArritmia() {
		if (arritmia == true) {
			System.out.print("Alerta de arritmia!");
		}
	}
	// Metodos Especiais - Getters/Setters
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