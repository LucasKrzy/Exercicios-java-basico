package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar multiplica��o de dados fornecido pelo usu�rio
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio11 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double n1, n2, res;
		
		// recebendo valores do usu�rio e convertendo de string para int
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

		// realizando a opera��o
		res = n1 * n2;

		// exibindo valores no console
		System.out.println(n1 + " * " + n2 + " = " + res);

	}

}
