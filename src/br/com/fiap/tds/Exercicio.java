package br.com.fiap.tds;

public class Exercicio {
	/** Atributos */
	String name;

	
	/** Metodo para pesquisar o exercicio */
	

	public String visualizar() {
		return "Exercicio [name=" + name + "]";
	}

	/** Metodos Getters/Setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

