package br.com.fiap.tds;

import java.util.Date;

public class BatimentoCardiaco {
	/**Atributos*/
	Date data;
	int valor;
	boolean arritmia;
	
	/**Metodos*/
	public void verificaArritmia() {
		if (arritmia == true) {
			System.out.print("Alerta de arritmia!");
		}
	}
	
	public String visualizar() {
		return "BatimentoCardiaco [data=" + data + ", valor=" + valor + ", arritmia=" + arritmia + "]";
	}

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