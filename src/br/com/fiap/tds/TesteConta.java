package br.com.fiap.tds;
import java.util.Date;

public class TesteConta {
	public static void main(String[]args) {
		Usuario user1 = new Usuario();
		Date nascimento = new Date();
		user1.adicionarUsuario("Haka", nascimento, "masculino", "estudante", 1.69f);
		user1.editarAltura(1.71f);
		user1.editarGenero("Nao desejo informar");
		user1.editarIdade(nascimento);
		user1.editarNome("Grupo Haka");
		user1.editarProfissao("desenvolvedor");
		user1.visualizarUsuario();
		user1.deletarUsuario();
		
	}
}
