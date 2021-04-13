package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcula a �rea de um ret�ngulo
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio16 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double base, altura, area;
		
		// recebendo valores do usu�rio e convertendo de string para int
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

		// realizando a opera��o
		area = base * altura;

		// exibindo valores no console
		System.out.println("A �rea do ret�ngulo � = " + area);

	}

}
