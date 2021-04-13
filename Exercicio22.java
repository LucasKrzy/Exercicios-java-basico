package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o sal�rio de um usu�rio mais suas comiss�es de venda
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double novoSalario, salario, vendas, comissao ;
		int carros;

		// recebendo valores para as variaveis
		carros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros vendidos:"));
		vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de vendas realizadas:"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio fixo:"));
		comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe a comiss�o fixa por carro:"));
		
		// calculando novo sal�rio
		novoSalario = carros * comissao + salario + vendas * 0.05;
		
		// exibindo novo sal�rio
		System.out.println("O sal�rio do funcion�rio com suas comiss�es �: R$ " + novoSalario);

	}

}
