package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcula a área de um retângulo
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio16 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double base, altura, area;
		
		// recebendo valores do usuário e convertendo de string para int
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

		// realizando a operação
		area = base * altura;

		// exibindo valores no console
		System.out.println("A área do retângulo é = " + area);

	}

}
