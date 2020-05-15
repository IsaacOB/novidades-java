package br.com.alura.switchexpression;

public class Teste {

	public static void main(String[] args) {

		// Antiga estruturação de um Switch
		
/**
		String nome = "João";
		switch (nome) {
		case "Renata": {
			System.out.println("Acertou: " + nome);
			break;
		}
		case "Jo�o": {
			System.out.println("Acertou: " + nome);
			break;
		}
		default: {
			System.out.println("Nenhum nome encontrado!!");
		}
		}
		
**/

		// Nova estrutura usando lambda
		String nome = "Isaac";
		switch (nome) {
		case "Renata" -> System.out.println("Acertou: " + nome);
		case "João" -> System.out.println("Acertou: " + nome);
		default -> System.out.println("Nenhum nome encontrado!!");

		}

	}
}
