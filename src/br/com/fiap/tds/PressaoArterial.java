package br.com.fiap.tds;

import java.util.Date;

public class PressaoArterial {
	/**Atributos*/
	Date data;
	int sistolica;
	int distolica;
	boolean pico;
	
	/**Metodos*/
	public void adicionarPressaoArterial(int sistolica, int distolica, boolean pico, Date data) {
		System.out.print("Valor adicionado com sucesso!");
	}
	
	public void deletarPressaoArterial() {
		System.out.print("Valor deletado com sucesso!");
	}
	
	public String visualizar() {
		return "PressaoArterial [data=" + data + ", sistolica=" + sistolica + ", distolica=" + distolica + ", pico="
				+ pico + "]";
	}
	
	public void verificaPico() {
		if (pico == true ) {
			System.out.print("Alerta de pico de pressão arterial");
		}
	}

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