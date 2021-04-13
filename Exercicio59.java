package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler  a quantidade de quilos de morango e maças compradas por um cliente, em seguida calcular o valor total pago
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double maca, morango, realMaca, realMorango;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Calcular valor total das compras na frutaria");
		maca = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de quilos comprados de maça:"));
		morango = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de quilos comprados de morango:"));
		
		// calcula o valor de cada tipo de fruta
		if (maca > 5) {
			realMaca = maca * 1.5;			
		} else {
			realMaca = maca * 1.8;
		}
		if (morango > 5) {
			realMorango = morango * 1.5;			
		} else {
			realMorango = morango * 1.8;
		}
		
		// calcula o valor total da compra e apresenta
		if ((maca + morango > 8) || (realMaca + realMorango > 25)) {
			JOptionPane.showMessageDialog(null, "O valor a ser pago pelo cliente é: R$ " + String.format("%.2f", (realMaca + realMorango) * 0.9));
		}else {
			JOptionPane.showMessageDialog(null, "O valor a ser pago pelo cliente é: R$ " + String.format("%.2f", realMaca + realMorango));
		}
		

	}

}
