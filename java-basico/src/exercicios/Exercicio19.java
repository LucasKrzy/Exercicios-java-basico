package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber salário e percentual de reajuste de um funcionário, em seguida calcular e exibir novo salário
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio19 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double salario, reajuste, novoSalario;

		// recebendo valores para as variaveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário mensal do funcionário:"));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de reajuste:"));

		// calculando novo salário
		novoSalario = salario + salario * (reajuste/100);
		
		// exibindo percentual de votos
		System.out.println("O novo salário do funcionário é: R$ " + novoSalario);

	}

}
