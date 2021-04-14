/**
 * 
 */
package exemplo03;


/**
 * Programa para demonstrar c�lculos aritm�ticos simplificados
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class OperacoesSimplificadas {

	/*
	 * M�todo principal para execu��o da classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int i;

		// Inicializando a variavel com valor 10
		i = 10;
		System.out.println(i);

		// opera��o de adi��o
		i = i + 1;
		System.out.println(i); // 11

		// opera��o de adi��o simplificada
		i++;
		System.out.println(i); // 12

		// opera��o de subtra��o
		i = i - 1;
		System.out.println(i); // 11

		// opera��o de subtra��o simplificado
		i--;
		System.out.println(i); // 10

		// opera��o de adi��o
		i = i + 2;
		System.out.println(i); // 12

		// opera��o de adi��o simplificada
		i += 2;
		System.out.println(i); // 14

		// opera��o de subtra��o
		i = i - 2;
		System.out.println(i); // 12

		// opera��o de subtra��o simplificado
		i -= 2;
		System.out.println(i); // 10

		// opera��o de multiplica��o
		i = i * 3;
		System.out.println(i); // 30
		
		// opera��o de multiplica��o simplificado
		i *= 3;
		System.out.println(i); // 90
		
		// opera��o de divis�o
		i = i / 3;
		System.out.println(i); // 30
		
		// opera��o de divis�o simplificado
		i /= 3;
		System.out.println(i); // 10
		
		// opera��o de modulo
		i = i % 4;
		System.out.println(i); // 2
		
		// opera��o de modulo simplificado
		i %= 2;
		System.out.println(i); // 0
	}

}
