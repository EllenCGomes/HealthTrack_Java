package br.com.fiap.tds;

public class TesteConta {
	public static void main(String[]args) {
		Conta c1 = new Conta();
		
		c1.username = "EllenCGomes";
		c1.idioma = "English";
		c1.cliente.nome = "Ellen";
		c1.cliente.idade = 31;
		
		System.out.println(c1.cliente.nome);
		System.out.println(c1.idioma);
		System.out.println(c1.username);
		
	}
}
