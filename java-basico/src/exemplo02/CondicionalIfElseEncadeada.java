/**
 * 
 */
package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstar o comando IF ELSE encadeado
 * 
 * @author lpedrosokr
 * @since 08/02/2021
 */
public class CondicionalIfElseEncadeada {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double altura, peso, imc;

		// Captura de dados
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));

		// Calculando o IMC
		imc = peso / Math.pow(altura, 2);

		// Exibir o resultado do IMC
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso");
		} else if ((imc >= 18.5) && (imc < 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal");
		} else if ((imc >= 25) && (imc < 29.9)) {
			JOptionPane.showMessageDialog(null, "Acima do peso");
		} else if ((imc >= 30) && (imc < 34.9)) {
			JOptionPane.showMessageDialog(null, "Obesidade nivel 1");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade mórbida");
		}
	}

}
