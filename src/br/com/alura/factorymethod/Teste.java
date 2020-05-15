package br.com.alura.factorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		
		// Método em escrita antiga 
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		
		// Método com nova escrita com FactoryMethod 
		List<String> novoNomes = List.of("nome1", "nome2", "nome3");
//		novoNomes.add("Aqui quebra");
		System.out.println(novoNomes);
		
		// Também podemos utilizar o Set.of() e o Map.of()
		Set<String> setNome = Set.of("Nome4", "Nome5", "Nome6");
		Map.of("Nome7", "Isaac");
		
		
	}
}
