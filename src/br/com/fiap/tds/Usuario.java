package br.com.fiap.tds;
import java.util.Date;


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
	
	
	// Metodos Personalizados
	/** 
	 * Visualizar usuario pesquisado 
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
		System.out.print("Cadastro realizado com sucesso!");
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
		System.out.print("Cadastro realizado com sucesso!");
	}
	/** 
	 * 	METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Deleta um Usuario
	 */
	public void deletarUsuario() {
		System.out.print("Usuario removido!");
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar nome do Usuario
	 * @param updatedNome Mudanca de nome em conta ja existente
	 */
	public void editarNome(String updatedNome) {
		this.setNome(updatedNome);
		System.out.print("Nome alterado para " + updatedNome);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar idade do Usuario
	 * @param updatedIdade Mudanca de idade em conta ja existente
	 */
	public void editarIdade(Date updatedIdade) {
		this.setIdade(updatedIdade);
		System.out.print("Nova idade: " + updatedIdade);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar genero do Usuario
	 * @param updatedGenero Mudanca de genero em conta ja existente
	 */
	public void editarGenero(String updatedGenero) {
		this.setGenero(updatedGenero);
		System.out.print("Genero alterado para : " + updatedGenero);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar profissao do Usuario
	 * @param updatedProfissao Mudanca de profissao em conta ja existente
	 */
	public void editarProfissao(String updatedProfissao) {
		this.setProfissao(updatedProfissao);
		System.out.print("Profissao alterado para : " + updatedProfissao);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar altura do Usuario
	 * @param updatedAltura Mudanca de altura em conta ja existente
	 */
	public void editarAltura(float updatedAltura) {
		this.setAltura(updatedAltura);
		System.out.print("Nova altura : " + updatedAltura);
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
}
