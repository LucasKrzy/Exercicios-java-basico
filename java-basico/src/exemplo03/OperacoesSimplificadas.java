/**
 * 
 */
package exemplo03;


/**
 * Programa para demonstrar cálculos aritméticos simplificados
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class OperacoesSimplificadas {

	/*
	 * Método principal para execução da classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int i;

		// Inicializando a variavel com valor 10
		i = 10;
		System.out.println(i);

		// operação de adição
		i = i + 1;
		System.out.println(i); // 11

		// operação de adição simplificada
		i++;
		System.out.println(i); // 12

		// operação de subtração
		i = i - 1;
		System.out.println(i); // 11

		// operação de subtração simplificado
		i--;
		System.out.println(i); // 10

		// operação de adição
		i = i + 2;
		System.out.println(i); // 12

		// operação de adição simplificada
		i += 2;
		System.out.println(i); // 14

		// operação de subtração
		i = i - 2;
		System.out.println(i); // 12

		// operação de subtração simplificado
		i -= 2;
		System.out.println(i); // 10

		// operação de multiplicação
		i = i * 3;
		System.out.println(i); // 30
		
		// operação de multiplicação simplificado
		i *= 3;
		System.out.println(i); // 90
		
		// operação de divisão
		i = i / 3;
		System.out.println(i); // 30
		
		// operação de divisão simplificado
		i /= 3;
		System.out.println(i); // 10
		
		// operação de modulo
		i = i % 4;
		System.out.println(i); // 2
		
		// operação de modulo simplificado
		i %= 2;
		System.out.println(i); // 0
	}

}
