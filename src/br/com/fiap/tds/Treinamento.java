package br.com.fiap.tds;
import java.util.Date;
import java.util.ArrayList;

public class Treinamento {
	/** Atributos */
	private Date duracao;
	private String intensidade;
	private int totalCalorias;
	private Date data;
	private Date horario;
	/** Referencia a classe exercicios */
	private ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

	/** METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) 
	 * Metodo para adicionar treino */
	public void criarTreinamento (Date duracao, String intensidade, int totalCalorias, Date data, Date horario) {
		this.setData(data);
		this.setDuracao(duracao);
		this.setIntensidade(intensidade);
		this.setTotalCalorias(totalCalorias);
		this.setHorario(horario);

		System.out.println("Treinamento criado com sucesso!");
	}

	/** Metodo para adicionar exercicio 
	 * @param exercicio realizado no treino*/
	public void adicionarExercicio(Exercicio exercicio) {
		exercicios.add(exercicio);
		System.out.println("Exercicio adicionado com sucesso!");
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
