package exemplo11;

import java.util.ArrayList;

/**
 * Classe para demonstrar a utilização de ArrayList do tipo String
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class ArrayListString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarar e instanciar uma lista de String
		ArrayList<String> listaString = new ArrayList<String>();

		// adicionar registro na lista de String
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");
		
		// exibindo o conteudo da lista
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));
		
		// adicionando em uma posição especifica
		listaString.add(1, "Elemento 1.5");
		System.out.println(listaString.get(1));
		
		for (String elemento : listaString) {
			System.out.println(elemento);
		}
		
		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista é " + listaString.size());
		
		//pesquisando um valor especifico na lista 
		if (listaString.contains("Elemento 1")) {
			System.out.println("Elemento encontrado!");
		} else {
			System.out.println("Elemento não encontrado");
		}
		
		// descobrindo o indice do elemento pesquisado
		int indice = listaString.indexOf("Elemento 11");
		System.out.println("Indice: " + indice);
		
		// removendo um elemento da lista
		listaString.remove("Elemento 1.5");

		for (String elemento : listaString) {
			System.out.println(elemento);
		}
		
		
	}
	
	

}
