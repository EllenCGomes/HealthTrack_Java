package br.com.fiap.tds;

public class Conta {
	//Atributos
	String senha;
	String email;
	String username;
	String idioma;
	Cliente cliente = new Cliente();
	
	// Metodos Personalizados
	public void visualizarConta() {
		System.out.println("Username: " + this.getUsername());
		System.out.println("Idioma: " + this.getIdioma());
		System.out.println("Cliente: " + this.getCliente());
	}
	
	public void criarConta(String novaSenha, String novoUsername, String emailCliente, String nomeCliente) {
		this.setSenha(novaSenha);
		this.setUsername(novoUsername);
		System.out.println("Sua conta foi criada com sucesso");
	}
	
	public void fecharConta() {
		System.out.println("Sua conta foi deletada com sucesso");
	}
	
	// Metodos Especiais - Getters/Setters
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
