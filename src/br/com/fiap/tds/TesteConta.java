package br.com.fiap.tds;
import java.util.Date;

public class TesteConta {
	public static void main(String[]args) {
		/**
		 * Instancia da classe usuário
		 */
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
	
		/**
		 * Instancia da classe treinamento
		 */
		Treinamento treinamento1 = new Treinamento();
		Date dataExercicio = new Date();
		treinamento1.criarTreinamento(dataExercicio, "Alta", 5, dataExercicio, dataExercicio);
		Exercicio exercicio1 = new Exercicio();
		exercicio1.name = "Pular corda";
		treinamento1.adicionarExercicio(exercicio1);
		treinamento1.editarDuracao(dataExercicio);
		treinamento1.editarIntensidade("Média");
		treinamento1.visualizar();
		treinamento1.deletarTreinamento();
		
		
	}
}
	
	
