/**
 * 
 */
package exemplo03;


/**
 * Programa para demonstrar o decremento de valores
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class ExemploDecremento {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int numero;
		
		// Inicializando a variavel
		numero = 1;
		System.out.println(numero);

		// Decremento
		numero = numero - 1;
		System.out.println(numero);
		
		// atribuindo novo valor na variavel
		numero = 10;
		
		// Decremento resumido (usar esse)
		numero--;
		System.out.println(numero);
		
		// realiza o decremento duas vezes e depois apresenta
		numero--;
		numero--;
		System.out.println(numero);
		
		// Decrementa e depois mostra na tela
		System.out.println(--numero);
	}

}
