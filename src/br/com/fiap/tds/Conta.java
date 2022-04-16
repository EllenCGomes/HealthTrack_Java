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
	/** 
	 * Referencia classe Usuario - Conta nao pode ser criada antes de cadastrar Usuario 
	 */
	private Usuario usuario = new Usuario();
	
	// Metodos Personalizados
	/** 
	 * Visualizar conta pesquisada 
	 */
	public String visualizarConta() {
		return "Conta [email=" + email + ", senha=" + senha + ", username=" + username + ", idioma=" + idioma
				+ ", usuario=" + usuario + "]";
	}
	
	/** 
	 * 	METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Cria uma nova conta com parametros minimos obrigatorios 
	 * @param novoEmail Email da conta nova
	 * @param novaSenha Senha da conta nova
	 * @param novoUsername Username da conta nova
	 */
	public void criarConta(String novoEmail, String novaSenha, String novoUsername) {
		this.setEmail(novoEmail);
		this.setSenha(novaSenha);
		this.setUsername(novoUsername);
		System.out.print("Sua conta foi criada com sucesso!");
	}
	
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Criar uma nova conta ja com idioma setado 
	 * @param novoEmail Email da conta nova
	 * @param novaSenha Senha da conta nova
	 * @param novoUsername Username da conta nova
	 * @param novoIdioma Idioma escolhido pelo usuario para a conta
	 */
	public void criarConta(String novoEmail, String novaSenha, String novoUsername, String novoIdioma) {
		this.setEmail(novoEmail);
		this.setSenha(novaSenha);
		this.setUsername(novoUsername);
		this.setIdioma(novoIdioma);
		System.out.print("Sua conta foi criada com sucesso!");
	}
	
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Deletar uma conta
	 */
	public void deletarConta() {
		System.out.print("Sua conta foi deletada com sucesso!");
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Email da conta
	 * @param updatedEmail Mudanca de email em conta ja existente
	 */
	public void editarEmail(String updatedEmail) {
		this.setEmail(updatedEmail);
		System.out.print("Novo Email:" + updatedEmail);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Editar Username da conta
	 * @param updatedUsername Mudanca de username em conta ja existente
	 */
	public void editarUsername(String updatedUsername) {
		this.setUsername(updatedUsername);
		System.out.print("Novo Username:" + updatedUsername);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Mudar Idioma da conta
	 * @param updatedIdioma Mudanca de idioma em conta ja existente
	 */
	public void mudarIdioma(String updatedIdioma) {
		this.setIdioma(updatedIdioma);
		System.out.print("Novo Idioma:" + updatedIdioma);
	}
	/** 
	 * METODO AINDA NAO IMPLEMENTADO (integracao com Banco de Dados - CRUD) - Trocar senha da conta
	 * @param updatedSenha Mudanca de senha em conta ja existente
	 */
	public void trocarSenha(String updatedSenha) {
		this.setSenha(updatedSenha);
		System.out.print("Nova Senha:" + updatedSenha);
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
