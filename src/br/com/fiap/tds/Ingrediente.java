package br.com.fiap.tds;

public class Ingrediente {
	
	/**Atributos*/
	private float peso;
	private int quantidade;
	private String nome;
	
	/**Método apra visualizar o ingrediente*/
	public String vizualizar() {
		return "Ingrediente [peso=" + peso + ", quantidade=" + quantidade + ", nome=" + nome + "]";
	}
	
	/**Métodos Especiais Getters/Setters*/
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
