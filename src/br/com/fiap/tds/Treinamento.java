package br.com.fiap.tds;
import java.util.Date;
import java.util.ArrayList;

public class Treinamento {
	//Atributos
	/** 
	 * Duracao de um treino 
	 */
	private Date duracao;
	/** 
	 * Intensidade de um treino 
	 */
	private String intensidade;
	/** 
	 * Total de Calorias de um treino 
	 */
	private int totalCalorias;
	/** 
	 * Data do treino 
	 */
	private Date data;
	/** 
	 * Horario em que o treino foi realizado
	 */
	private Date horario;
	/** Referencia a classe exercicios */
	private ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

	/** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Metodo para adicionar treino 
	 * @param data Data em que o treino foi realizado
	 * @param duracao Duracao do treino
	 * @param intensidade Intensidade do treino (leve, moderado, intenso)
	 * @param totalCalorias Total de Calorias gasta no treino
	 * @param horario Horario em que o treino foi realizado
	 */
	public void criarTreinamento (Date data, Date duracao, String intensidade, int totalCalorias, Date horario) {
		this.setData(data);
		this.setDuracao(duracao);
		this.setIntensidade(intensidade);
		this.setTotalCalorias(totalCalorias);
		this.setHorario(horario);
		System.out.println("Treinamento criado com sucesso!");
	}

	/** METODO AINDA NAO IMPLEMENTADO - Adicionar exercicio
	 * @param exercicio Exercicios realizados no treino
	 * @see Exercicio
	 */
	public void adicionarExercicio(Exercicio exercicio) {
		exercicios.add(exercicio);
		System.out.println("Exercicio adicionado com sucesso!");
	}
	/** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar duracao do treino
	 * @param duracao Duracao do treino 
	 */
	public void editarDuracao(Date duracao) {
		this.duracao = duracao;

	}
	/** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar intensidade do treino
	 * @param intensidade Intensidade do treino*/
	public void editarIntensidade(String intensidade) {
		this.intensidade = intensidade;

	}
	/** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Deletar treinamento 
	 */
	public void deletarTreinamento() {
		System.out.println("Treinamento deletado!");

	}
	/** Metodo para visualizar o treinamento 
	 * @return todos os atributos da classe
	 */
	public String visualizar() {
		return "Treinamento [duracao=" + duracao + ", intensidade=" + intensidade + ", totalCalorias=" + totalCalorias
				+ "]";
	}

	// Metodos Especiais - Getters/Setters
	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
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
