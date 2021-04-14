/**
 * 
 */
package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstar o comando IF ELSE
 * @author lpedrosokr
 * @since 08/02/2021
 */
public class CondicionalIfElse {

	/*
	 * Método principal para executar o programa
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
		} else {
			JOptionPane.showMessageDialog(null, "Peso ideal");
		}
		
	}

}
