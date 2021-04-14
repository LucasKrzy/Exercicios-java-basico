package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o salário de um usuário mais suas comissões de venda
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double novoSalario, salario, vendas, comissao ;
		int carros;

		// recebendo valores para as variaveis
		carros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros vendidos:"));
		vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de vendas realizadas:"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo:"));
		comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe a comissão fixa por carro:"));
		
		// calculando novo salário
		novoSalario = carros * comissao + salario + vendas * 0.05;
		
		// exibindo novo salário
		System.out.println("O salário do funcionário com suas comissões é: R$ " + novoSalario);

	}

}
