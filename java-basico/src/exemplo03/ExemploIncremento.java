/**
 * 
 */
package exemplo03;


/**
 * Programa para demonstrar a incrementação de valores
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int numero;
		
		// Inicializando a variavel
		numero = 1;
		System.out.println(numero);

		// Incremento
		numero = numero + 1;
		System.out.println(numero);
		
		// Incremento resumido (usar esse)
		numero++;
		System.out.println(numero);
		
		// apresenta o numero e depois realiza o incremento
		System.out.println(numero++);
		System.out.println(numero);
		
		// incrementa e depois mostra na tela
		System.out.println(++numero);
	}

}
