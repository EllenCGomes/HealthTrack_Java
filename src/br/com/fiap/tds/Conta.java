package br.com.fiap.tds;

/** 
 * Conta a ser criada no Aplicativo para um usuario 
 */
public class Conta {
	//Atributos
	/** 
	 * Email associado a Conta 
	 */
	private String email;
	/** 
	 * Senha da Conta 
	 */
	private String senha;
	/** 
	 * Username do usuario associado a Conta 
	 */
	private String username;
	/** 
	 * Idioma da Conta escolhido pelo Usuario 
	 */
	private String idioma;
	
	private Usuario usuario = new Usuario();
	
	// Metodos Personalizados
	/** 
	 * Visualizar conta pesquisada 
	 */
	public String visualizarConta() {
		return "Conta [email=" + email + ", senha=" + senha + ", username=" + username + ", idioma=" + idioma
				+ ", usuario=" + usuario + "]";
	}
	
	// Metodos Especiais - Getters/Setters

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
