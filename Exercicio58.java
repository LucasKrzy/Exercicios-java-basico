package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a idade de dois homens e duas mulheres, em seguida
 * Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
 * e o produto das idades do homem mais novo com a mulher mais velha
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int h1, h2, m1, m2;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Cálculo usando idades");
		h1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do primeiro homem:"));
		h2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do segundo homem:"));
		m1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da primeira mulher:"));
		m2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da segunda mulher:"));
		
		// calcular e exibir o resultado
		if (h1 > h2) {
			if (m1 < m2) {
				JOptionPane.showMessageDialog(null,"A soma da idade do homem mais velho com a mulher mais nova é: " + (h1 + m1) +
													"\nO produto da idade do homem mais novo com a mulher mais velha é: " + (h2 * m2));
			}else {
				JOptionPane.showMessageDialog(null,"A soma da idade do homem mais velho com a mulher mais nova é: " + (h1 + m2) +
													"\nO produto da idade do homem mais novo com a mulher mais velha é: " + (h2 * m1));
			}
		}else {
			if (m1 < m2) {
				JOptionPane.showMessageDialog(null,"A soma da idade do homem mais velho com a mulher mais nova é: " + (h2 + m1) +
													"\nO produto da idade do homem mais novo com a mulher mais velha é: " + (h2 * m2));
			}else {
				JOptionPane.showMessageDialog(null,"A soma da idade do homem mais velho com a mulher mais nova é: " + (h1 + m2) +
													"\nO produto da idade do homem mais novo com a mulher mais velha é: " + (h2 * m1));
			}			
		}
	}

}
