package br.com.fiap.tds;
import java.util.Date;


public class Treinamento {
	/** Atributos */
	private Date duracao;
	private String intensidade;
	private int totalCalorias;
	
	
	/** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) 
	 * Metodo para adicionar treino */
	public void adicionarTreinamento () {
		
	}
	
	/** Metodo para editar duracao do treino
	 * @param duracao do treino */
	public void editarDuracao(Date duracao) {
		this.duracao = duracao;
		
	}
	/** Metodo para editar intensidade do treino
	 * @param intensidade do treino*/
	public void editarIntensidade(String intensidade) {
		this.intensidade = intensidade;
	
	}
	/** ** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) 
	 * Metodo para deletar o treinamento */
	public void deletarTreinamento() {
		System.out.println("Treinamento deletado!");
		
	}
	/** Metodo para visualizar o treinamento */
	public String visualizar() {
		return "Treinamento [duracao=" + duracao + ", intensidade=" + intensidade + ", totalCalorias=" + totalCalorias
					+ "]";
	}
	
	/** Metodos Getters/Setters */
	
	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}
	public String getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}
	public int getTotalCalorias() {
		return totalCalorias;
	}
	public void setTotalCalorias(int totalCalorias) {
		this.totalCalorias = totalCalorias;
	}
	
	
	
	}
