package br.com.fiap.tds;


public class Refeicao {
	
	/**Atributos*/
	
	/**
	 * Quantidade de Carboidrato da Refeição
	 * */
	private int carboidrato;
	/**
	 * Quantidade de Açucar da Refeição 
	 * */
	private int acucar;
	/**
	 * Quantidade de Proteina da Refeição
	 * */
	private int proteina;
	/**
	 * Quantidade de Gordura da Refeição 
	 * */
	private int gordura;
	/**
	 * Peso da Refeição
	 * */
	private float peso;
	/**
	 * Nome da Refeição
	 * */
	private String nome;
	

	/**Método para visualizar a refeição*/
	public String visualizar() {
		return "Refeicao [carboidrato=" + carboidrato + ", acucar=" + acucar + ", proteina=" + proteina + ", gordura="
				+ gordura + ", peso=" + peso + ", nome=" + nome + "]";
	}

	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Criar Refeição
     * @param nome da Refeição
     * @param peso da Refeição
     * @param gordura da Refeição
     * @param proteina da Refeição
     * @param açucar da Refeição
     * @param carboidrato da Refeição
     */
	public void criarRefeicao(String nome, float peso, int gordura, int proteina, int acucar, int carboidrato) {
		this.setNome(nome);
		this.setPeso(peso);
		this.setGordura(gordura);
		this.setProteina(proteina);
		this.setAcucar(acucar);
		this.setCarboidrato(carboidrato);
		System.out.print("Refeição " + nome + " criada com sucesso!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Editar Carboidrato da Refeição
     * @param carboidrato da Refeição
     */
	public void editarCarb(int carboidrato) {
		this.setCarboidrato(carboidrato);
		System.out.print("Carboidrato Alterado!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Editar Açucar da Refeição
     * @param peso do Ingrediente
     */
	public void editarAcucar(int acucar) {
		this.setAcucar(acucar);
		System.out.print("Açucar Alterado!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Editar Proteina da Refeição
     * @param proteina da Refeição
     */
	public void editarProteina(int proteina) {
		this.setProteina(proteina);
		System.out.print("Proteina Alterada!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Editar Gordura da Refeição
     * @param peso do Ingrediente
     */
	public void editarGordura(int gordura) {
		this.setGordura(gordura);
		System.out.print("Gordura Alterada!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Editar Peso da Refeição
     * @param peso do Refeição
     */
	public void editarPeso(float peso) {
		this.setPeso(peso);
		System.out.print("Peso Alterado!");
	}
	
	/** 
     * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados) - Deletar Refeição
     */
	public void deletar() {
		System.out.print("Refeição Deletada!");
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
}
