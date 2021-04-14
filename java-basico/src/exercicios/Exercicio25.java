package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantia de litros abastecida
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio25 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double litros, gasolina, total ;

		// recebendo valores para as variaveis
		total = Double.parseDouble(JOptionPane.showInputDialog("Informe o total a abastecer desejado:"));
		gasolina = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do litro da gasolina:"));
		
		// calculando média do aluno
		litros = total / gasolina;
		
		// exibindo a quantidade de litros abastecida
		System.out.println("A quantidade de litros abastecida é: " + litros);

	}

}
