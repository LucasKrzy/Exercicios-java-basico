package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber sal�rio e percentual de reajuste de um funcion�rio, em seguida calcular e exibir novo sal�rio
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio19 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double salario, reajuste, novoSalario;

		// recebendo valores para as variaveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio mensal do funcion�rio:"));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de reajuste:"));

		// calculando novo sal�rio
		novoSalario = salario + salario * (reajuste/100);
		
		// exibindo percentual de votos
		System.out.println("O novo sal�rio do funcion�rio �: R$ " + novoSalario);

	}

}
