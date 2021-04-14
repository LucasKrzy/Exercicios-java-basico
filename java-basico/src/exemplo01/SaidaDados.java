package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar saida de dados fornecido pelo usu�rio
 * 
 * @author lpedrosokr
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double num1, num2, res;

		// atribuir valor para variavel informado pelo usu�rio
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero: "));

		// efetuando a opera��o de muliplica��o
		res = num1 * num2;

		// exibindo o resultado para o usu�rio
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" +
											"Segundo valor digitado " + num2 + "\n" +
											"O resultado da multiplica��o �: " + res);
	}

}
