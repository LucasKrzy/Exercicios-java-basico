package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e mostrar se é possivel formar um triângulo 
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double a, b, c;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Verificar se com os valores informados forma um triângulo");
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 lado:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 lado:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3 lado:"));
		
		// Exibir se é possivel ou não formar um triangulo
		if ((a+b > c) && (a + c > b) && (b + c > a) ){
			JOptionPane.showMessageDialog(null, "Os valores informados formam um triângulo");
		}else {
			JOptionPane.showMessageDialog(null, "Os valores informados não formam um triângulo");
		}
		
	}

}
