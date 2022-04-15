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
	private char genero;
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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
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
