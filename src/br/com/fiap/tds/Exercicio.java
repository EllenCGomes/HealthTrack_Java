package br.com.fiap.tds;

/** 
 * Exercicios que o Usuario realiza nos treinos
 */
public class Exercicio {
	//Atributos
	/** 
	 * Nome do exercicio 
	 */
	String name;

	// Metodos Personalizados
	/** 
	* Visualizar exercicio
	* @return todos os atributos da classe 
	*/
	public String visualizar() {
		return "Exercicio [name=" + name + "]";
	}

	// Metodos Especiais - Getters/Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

