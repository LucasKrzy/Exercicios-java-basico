package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada e convers�o de dados fornecido pelo usu�rio
 * 
 * @author lpedrosokr
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vari�veis
		int valor1, valor2, resultado;

		// recebendo valores do usu�rio e convertendo de string para int
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

		// realizando a opera��o
		resultado = valor1 + valor2;
		
		// exibindo valores no console
		System.out.println(valor1 + " + " + valor2 + " = " + resultado);

	}

}
