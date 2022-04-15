package br.com.fiap.tds;

import java.util.Date;

public class pressaoSanguinea {
	/**Atributos*/
	Date data;
	int sistolica;
	int distolia;
	boolean pico;
	
	/**Metodos*/
	public void verificaPico() {
		if (pico == true ) {
			System.out.print("Alerta de pico de pressão arterial");
		}
	}
	
	public String visualizar() {
		return "pressaoSanguinea [data=" + data + ", sistolica=" + sistolica + ", distolia=" + distolia + ", pico="
				+ pico + "]";
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
		return distolia;
	}
	public void setDistolia(int distolia) {
		this.distolia = distolia;
	}
	public boolean isPico() {
		return pico;
	}
	public void setPico(boolean pico) {
		this.pico = pico;
	}
	
	
}
