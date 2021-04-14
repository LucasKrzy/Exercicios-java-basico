package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e mostrar se � possivel formar um tri�ngulo 
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double a, b, c;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Verificar se com os valores informados forma um tri�ngulo");
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 lado:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 lado:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3 lado:"));
		
		// Exibir se � possivel ou n�o formar um triangulo
		if ((a+b > c) && (a + c > b) && (b + c > a) ){
			JOptionPane.showMessageDialog(null, "Os valores informados formam um tri�ngulo");
		}else {
			JOptionPane.showMessageDialog(null, "Os valores informados n�o formam um tri�ngulo");
		}
		
	}

}
