package exemplo04;

/**
 * Programa para demonstrar la�o de repiti��o WHILE
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class RepiticaoWhile {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declara��o de variaveis
		int indice;
		
		// inicializando a variavel
		indice = 0;
		
		// efetuando um la�o de repeti��o para exibir o cubo de um n�mero
		while(indice < 10) {
			System.out.println(indice + " ao cubo � = " + (indice * indice * indice));
			indice++;
		}
	}

}
