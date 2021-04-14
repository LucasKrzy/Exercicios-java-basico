package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada e conversão de dados fornecido pelo usuário
 * 
 * @author lpedrosokr
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int valor1, valor2, resultado;

		// recebendo valores do usuário e convertendo de string para int
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

		// realizando a operação
		resultado = valor1 + valor2;
		
		// exibindo valores no console
		System.out.println(valor1 + " + " + valor2 + " = " + resultado);

	}

}
