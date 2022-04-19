package br.com.fiap.tds;

import java.util.ArrayList;
import java.util.Date;

/** 
 * Refeicoes realizadas pelo Usuario
 */
public class Refeicao {
	//Atributos
	
	/**
	 * Tipo da Refeicao (Cafe da manha, Almoco, Jantar, Snack)
	 * */
	private String tipo;
	/**
	 * Data da Refeicao
	 * */
	private Date data;
	/**
	 * Quantidade de Carboidrato da Refeicao
	 * */
	private int carboidrato;
	/**
	 * Quantidade de Acucar da Refeicao 
	 * */
	private int acucar;
	/**
	 * Quantidade de Proteina da Refeicao
	 * */
	private int proteina;
	/**
	 * Quantidade de Gordura da Refeicao 
	 * */
	private int gordura;
	/**
	 * Peso da Refeicao
	 * */
	private float peso;
	/**
	 * Nome da Refeicao
	 * */
	private String nome;
	/**
	 * Lista com os Ingredientes da Refeicao
	 * */
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	// Metodos Personalizados
	/**Metodo para visualizar a refeicao
	 * @return todos os atributos da classe
	 */
	public String visualizar() {
		return "Refeicao [carboidrato=" + carboidrato + ", acucar=" + acucar + ", proteina=" + proteina + ", gordura="
				+ gordura + ", peso=" + peso + ", nome=" + nome + "]";
	}

	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Criar Refeicao
     * @param nome da Refeicao
     * @param peso da Refeicao
     * @param gordura da Refeicao
     * @param proteina da Refeicao
     * @param acucar da Refeicao
     * @param carboidrato da Refeicao
     */
	public void criarRefeicao(String nome, float peso, int gordura, int proteina, int acucar, int carboidrato, Ingrediente ingrediente) {
		this.setNome(nome);
		this.setPeso(peso);
		this.setGordura(gordura);
		this.setProteina(proteina);
		this.setAcucar(acucar);
		this.setCarboidrato(carboidrato);
		System.out.print("Refeição " + nome + " criada com sucesso!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO - Adicionar Ingrediente na Refeicao
     * @param Ingrediente da Refeicao
     * @see Ingrediente
     */
	public void adicionarIngrediente(Ingrediente ingrediente) {
		ingredientes.add(ingrediente);
		System.out.print("Alimento " + ingrediente.getNome() + " adicionado com sucesso");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Carboidrato da Refeicao
     * @param carboidrato da Refeicao
     */
	public void editarCarb(int carboidrato) {
		this.setCarboidrato(carboidrato);
		System.out.print("Carboidrato Alterado!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Acucar da Refeicao
     * @param acucar da Refeicao
     */
	public void editarAcucar(int acucar) {
		this.setAcucar(acucar);
		System.out.print("Acucar Alterado!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Proteina da Refeicao
     * @param proteina da Refeicao
     */
	public void editarProteina(int proteina) {
		this.setProteina(proteina);
		System.out.print("Proteina Alterada!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Gordura da Refeicao
     * @param gordura da Refeicao
     */
	public void editarGordura(int gordura) {
		this.setGordura(gordura);
		System.out.print("Gordura Alterada!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Peso da Refeicao
     * @param peso do Refeicao
     */
	public void editarPeso(float peso) {
		this.setPeso(peso);
		System.out.print("Peso Alterado!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Deletar Refeicao
     */
	public void deletar() {
		System.out.print("Refeicao Deletada!");
	}
	
	// Metodos Especiais - Getters/Setters
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
