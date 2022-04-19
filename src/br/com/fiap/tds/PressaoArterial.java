package br.com.fiap.tds;

import java.util.Date;

/** 
 * Pressao Arterial do Usuario
 */

public class PressaoArterial {
	//Atributos
	
	/**
	 * Data da medicao da PA
	 */
	Date data;
	/**
	 * Pressao arterial sistolica
	 */
	int sistolica;
	/**
	 * Pressao arterial distolica
	 */
	int distolica;
	/**
	 * Se houve pico de pressao (hipertensao)
	 */
	boolean pico;
	
	// Metodos Personalizados
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Adiciona nova pressao arterial
     */
	public void adicionarPressaoArterial(int sistolica, int distolica, boolean pico, Date data) {
		System.out.print("Valor adicionado com sucesso!");
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Deletar pressao arterial
     */
	public void deletarPressaoArterial() {
		System.out.print("Valor deletado com sucesso!");
	}
	/** 
	 * Visualizar pressao arterial 
	 */
	public String visualizar() {
		return "PressaoArterial [data=" + data + ", sistolica=" + sistolica + ", distolica=" + distolica + ", pico="
				+ pico + "]";
	}
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Verifica se houve pico de pressao (hipertensao)
     */
	public void verificaPico() {
		if (pico == true ) {
			System.out.print("Alerta de pico de pressão arterial");
		}
	}
	
	// Metodos Especiais - Getters/Setters
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getSistolica() {
		return sistolica;
	}
	public void setSistolica(int sistolica) {
		this.sistolica = sistolica;
	}
	public int getDistolia() {
		return distolica;
	}
	public void setDistolica(int distolica) {
		this.distolica = distolica;
	}
	public boolean isPico() {
		return pico;
	}
	public void setPico(boolean pico) {
		this.pico = pico;
	}
	
	
}
