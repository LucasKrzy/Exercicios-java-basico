package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a quantidade em estoque de um produto, sua quantidade m�xima e m�nima de estoque e vereficar se � necessario realizar compra ou n�o do produto
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double min, max, atual;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Verifica��o de necessidade de abastecimento de estoque");
		atual = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em estoque:"));
		max = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade m�xima em estoque:"));
		min = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade minima em estoque:"));
		
		// vereficar situa��o do estoque e mostrar se � nessessario efetuar compras
		JOptionPane.showMessageDialog(null, "A quantidade m�dia de estoque � : " + (min + max)/2);
		if ((min + max)/2  >= atual) {
			JOptionPane.showMessageDialog(null,"Efetuar compra");
		} else {
			JOptionPane.showMessageDialog(null, "N�o efetuar compra");			
		}
		
	}

}
