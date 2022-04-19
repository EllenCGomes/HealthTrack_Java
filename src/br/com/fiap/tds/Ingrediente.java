package br.com.fiap.tds;

/** 
 * Ingredientes da Refeicao
 */
public class Ingrediente {
	//Atributos
	/**
	 * Peso do Ingrediente
	 * */
	private float peso;
	/**
	 * Quantidade de Ingredientes
	 * */
	private int quantidade;
	/**
	 * Nome do Ingrediente 
	 * */
	private String nome;
	
	// Metodos Personalizados
		/** 
		 * Visualizar ingrediente
		 * @return todos os atributos da classe 
		 */
	public void visualizar() {
		System.out.print("Ingrediente [peso=" + peso + ", quantidade=" + quantidade + ", nome=" + nome + "]");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Criar Ingrediente
     * @param nome do Ingrediente
     * @param quantidade de Ingredientes
     * @param peso do Ingrediente
     */
	public void criarIngrediente(String nome, int quantidade, float peso) {
		this.setNome(nome);
		this.setQuantidade(quantidade);
		this.setPeso(peso);
		System.out.print("Ingrediente " + nome + " criado com sucesso!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Peso do Ingrediente
     * @param peso do Ingrediente
     */
	public void editarPeso(float peso) {
		this.setPeso(peso);
		System.out.print("Peso Alterado!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Quantidade do Ingrediente
     * @param quantidade de Ingredientes
     */
	public void editarQuantidade(int quantidade) {
		this.setQuantidade(quantidade);
		System.out.print("Quantidade Alterada");
	}
	
	// Metodos Especiais - Getters/Setters
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
