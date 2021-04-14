package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o número de litros vendidos e o tipo de combustível, em seguida calcule e imprima o valor com desconto a ser pago pelo cliente
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio57 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double litros;
		String comb;
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Calcular o total a ser pago pelo combustivel abastecido");
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros abastecida:"));
		comb = JOptionPane.showInputDialog("Informe o tipo de combustivel:\n"
				+ "- A para álcool e G gasolina:");
		
		// Calcular o valor total e exibir o resultado		
		switch (comb) {
		// alcool
		case "a": {
			if (litros <= 20) {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (litros * 2.9 * 0.97)));
			} else {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (56.26 + litros * 2.9 * 0.95)));
			}
			break;
		}
		case "A": {
			if (litros <= 20) {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (litros * 2.9 * 0.97)));
			} else {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (56.26 + litros * 2.9 * 0.95)));
			}
			break;
		}
		// gasolina
		case "g": {
			if (litros <= 20) {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (litros * 3.3 * 0.96)));
			} else {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (63.36 + litros * 3.3 * 0.94)));
			}
			break;
		}
		case "G": {
			if (litros <= 20) {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (litros * 3.3 * 0.96)));
			} else {
				JOptionPane.showMessageDialog(null, "O valor total a pagar é: R$ " + String.format("%.2f", (63.36 + litros * 3.3 * 0.94)));
			}
			break;
		}
		// invalido
		default:
			JOptionPane.showMessageDialog(null, "Combustivel inválido");
			break;
		}
		
		
	}

}
