/**
 * 
 */
package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstar o comando IF
 * @author lpedrosokr
 * @since 08/02/2021
 */
public class CondicionalIf {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double altura, peso, imc;
		
		// Captura de dados
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
		
		// Calculando o IMC
		imc = peso / Math.pow(altura, 2);
		
		// Exibir o resultado do IMC
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso");
		}
		
		if ((imc >= 18.5) && (imc <=24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal");
		}
		
	}

}
