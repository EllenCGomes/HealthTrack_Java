package br.com.fiap.tds;
import java.util.Date;
import java.util.ArrayList;


/** 
 * Usuario do Aplicativo
 */
public class Usuario {
	//Atributos
	/** 
	 * Nome completo do usuario 
	 */
	private String nome;
	/** 
	 * Data de nascimento do usuario 
	 */
	private Date idade;
	/** 
	 * Genero do usuario 
	 */
	private String genero;
	/** 
	 * Profissao do usuario 
	 */
	private String profissao;
	/** 
	 * Altura do usuario 
	 */
	private float altura;
	/** 
	 * Referencia classe Conta - Usuario nao pode ser criado antes de cadastrar Conta 
	 */
	private Conta conta = new Conta();
	/** 
	 * Referencia classe Treinamento 
	 */
	private ArrayList<Treinamento> treinamentos = new ArrayList<Treinamento>();
	/** 
	 * Referencia classe Refeicao 
	 */
	private ArrayList<Refeicao> refeicoes = new ArrayList<Refeicao>();
	/** 
	 * Referencia classe Peso
	 */
	private ArrayList<Peso> pesos = new ArrayList<Peso>();
	/** 
	 * Referencia classe FC
	 */
	private ArrayList<FrequenciaCardiaca> frequenciasCardiacas = new ArrayList<FrequenciaCardiaca>();
	/** 
	 * Referencia classe PA
	 */
	private ArrayList<PressaoArterial> pressoesArteriais = new ArrayList<PressaoArterial>();
	
	// Metodos Personalizados
	/** 
	 * Visualizar usuario pesquisado
	 * @return todos os atributos da classe 
	 */
	public String visualizarUsuario() {
		return "Usuario [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", profissao=" + profissao
				+ ", altura=" + altura + "]";
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Adiciona um Usuario com requisitos minimos
	 * @param novoNome Nome completo do Usuario
	 * @param novaIdade Data de nascimento do Usuario
	 * @param novaAltura Altura Usuario
	 */
	public void adicionarUsuario(String novoNome, Date novaIdade, float novaAltura) {
		this.setNome(novoNome);
		this.setIdade(novaIdade);
		this.setAltura(novaAltura);
		System.out.println("Cadastro realizado com sucesso!");
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Adiciona um Usuario
	 * @param novoNome Nome completo do Usuario
	 * @param novaIdade Data de nascimento do Usuario
	 * @param novoGenero Genero Usuario 
	 * @param novaProfissao Profissao/Ocupacao Usuario
	 * @param novaAltura Altura Usuario
	 */
	public void adicionarUsuario(String novoNome, Date novaIdade, String novoGenero, String novaProfissao, float novaAltura) {
		this.setNome(novoNome);
		this.setIdade(novaIdade);
		this.setGenero(novoGenero);
		this.setProfissao(novaProfissao);
		this.setAltura(novaAltura);
		System.out.println("Cadastro realizado com sucesso!");
	}
	/** 
	 * 	METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Deleta um Usuario
	 */
	public void deletarUsuario() {
		System.out.println("Usuario removido!");
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar nome do Usuario
	 * @param updatedNome Mudanca de nome em conta ja existente
	 */
	public void editarNome(String updatedNome) {
		this.setNome(updatedNome);
		System.out.println("Nome alterado para " + updatedNome);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar idade do Usuario
	 * @param updatedIdade Mudanca de idade em conta ja existente
	 */
	public void editarIdade(Date updatedIdade) {
		this.setIdade(updatedIdade);
		System.out.println("Nova idade: " + updatedIdade);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar genero do Usuario
	 * @param updatedGenero Mudanca de genero em conta ja existente
	 */
	public void editarGenero(String updatedGenero) {
		this.setGenero(updatedGenero);
		System.out.println("Genero alterado para : " + updatedGenero);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar profissao do Usuario
	 * @param updatedProfissao Mudanca de profissao em conta ja existente
	 */
	public void editarProfissao(String updatedProfissao) {
		this.setProfissao(updatedProfissao);
		System.out.println("Profissao alterado para : " + updatedProfissao);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar altura do Usuario
	 * @param updatedAltura Mudanca de altura em conta ja existente
	 */
	public void editarAltura(float updatedAltura) {
		this.setAltura(updatedAltura);
		System.out.println("Nova altura : " + updatedAltura);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO - Listagem Treinamentos 
	 * @param data Data em que o treinamento foi realizado
	 * @param horario Horario em que o treinamento foi realizado
	 * @see Treinamento
	 */
	public ArrayList<Treinamento> getTreinamentos(Date data, Date horario) {
		return treinamentos;
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO - Listagem Refeicoes 
	 * @param data Data em que a refeicao foi feita
	 * @param horario Horario em que a refeicao foi feita
	 * @see Refeicao
	 */
	public ArrayList<Refeicao> getRefeicoes(Date data, Date horario) {
		return refeicoes;
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO - Listagem Pesos
	 * @param data Data em que o peso foi medido
	 * @see Peso 
	 */
	public ArrayList<Peso> getPesos(Date data) {
		return pesos;
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO - Listagem FC 
	 * @param data Data em que o frequencia cardiaca foi medida
	 * @see FrequenciaCardiaca 
	 */
	public ArrayList<FrequenciaCardiaca> getFrequenciasCardiacas(Date data) {
		return frequenciasCardiacas;
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO - Listagem PA 
	 * @param data Data em que a pressao arterial foi medida
	 * @see PressaoArterial
	 */
	public ArrayList<PressaoArterial> getPressoesArteriais(Date data) {
		return pressoesArteriais;
	}
	
	// Metodos Especiais - Getters/Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getIdade() {
		return idade;
	}

	public void setIdade(Date idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public ArrayList<Treinamento> getTreinamentos() {
		return treinamentos;
	}
	public void setTreinamentos(ArrayList<Treinamento> treinamentos) {
		this.treinamentos = treinamentos;
	}
	public ArrayList<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	public void setRefeicoes(ArrayList<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}
	public ArrayList<Peso> getPesos() {
		return pesos;
	}
	public void setPesos(ArrayList<Peso> pesos) {
		this.pesos = pesos;
	}
	public ArrayList<FrequenciaCardiaca> getFrequenciasCardiacas() {
		return frequenciasCardiacas;
	}
	public void setFrequenciasCardiacas(ArrayList<FrequenciaCardiaca> frequenciasCardiacas) {
		this.frequenciasCardiacas = frequenciasCardiacas;
	}
	public ArrayList<PressaoArterial> getPressoesArteriais() {
		return pressoesArteriais;
	}
	public void setPressoesArteriais(ArrayList<PressaoArterial> pressoesArteriais) {
		this.pressoesArteriais = pressoesArteriais;
	}
	
}
