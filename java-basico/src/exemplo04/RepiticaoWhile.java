package exemplo04;

/**
 * Programa para demonstrar laço de repitição WHILE
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class RepiticaoWhile {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declaração de variaveis
		int indice;
		
		// inicializando a variavel
		indice = 0;
		
		// efetuando um laço de repetição para exibir o cubo de um número
		while(indice < 10) {
			System.out.println(indice + " ao cubo é = " + (indice * indice * indice));
			indice++;
		}
	}

}
