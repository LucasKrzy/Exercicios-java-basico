package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar saida de dados fornecido pelo usuário
 * 
 * @author lpedrosokr
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double num1, num2, res;

		// atribuir valor para variavel informado pelo usuário
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número: "));

		// efetuando a operação de muliplicação
		res = num1 * num2;

		// exibindo o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" +
											"Segundo valor digitado " + num2 + "\n" +
											"O resultado da multiplicação é: " + res);
	}

}
