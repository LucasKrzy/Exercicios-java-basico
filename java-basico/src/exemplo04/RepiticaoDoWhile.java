package exemplo04;

/**
 * Programa para demonstrar laço de repitição DO WHILE
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class RepiticaoDoWhile {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declaração de variaveis
		int i;
		
		// inicializando a variavel
		i = 10;
		
		// efetuando um laço de repetição para exibir o cubo de um número
		do {
			System.out.println(i + " ao cubo é = " + (i * i * i));
			i++;
		} while(i < 10);
	}

}
