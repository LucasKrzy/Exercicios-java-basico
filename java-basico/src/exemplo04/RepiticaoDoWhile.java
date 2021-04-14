package exemplo04;

/**
 * Programa para demonstrar la�o de repiti��o DO WHILE
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class RepiticaoDoWhile {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declara��o de variaveis
		int i;
		
		// inicializando a variavel
		i = 10;
		
		// efetuando um la�o de repeti��o para exibir o cubo de um n�mero
		do {
			System.out.println(i + " ao cubo � = " + (i * i * i));
			i++;
		} while(i < 10);
	}

}
