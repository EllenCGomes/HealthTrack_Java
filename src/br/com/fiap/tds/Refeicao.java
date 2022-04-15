package br.com.fiap.tds;


public class Refeicao {
	
	/**Atributos*/
	private int carboidrato;
	private int acucar;
	private int proteina;
	private int gordura;
	private float peso;
	

	/**Método apra visualizar a refeição*/
	public String visualizar() {
		return "Refeicao [carboidrato=" + carboidrato + ", acucar=" + acucar + ", proteina=" + proteina + ", gordura="
				+ gordura + ", peso=" + peso + "]";
	}
	
	/**Métodos Especiais Getters/Setters*/
	public int getCarboidrato() {
		return carboidrato;
	}
	public void setCarboidrato(int carboidrato) {
		this.carboidrato = carboidrato;
	}
	public int getAcucar() {
		return acucar;
	}
	public void setAcucar(int acucar) {
		this.acucar = acucar;
	}
	public int getProteina() {
		return proteina;
	}
	public void setProteina(int proteina) {
		this.proteina = proteina;
	}
	public int getGordura() {
		return gordura;
	}
	public void setGordura(int gordura) {
		this.gordura = gordura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	

	
}
