package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a quantidade em estoque de um produto, sua quantidade máxima e mínima de estoque e vereficar se é necessario realizar compra ou não do produto
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double min, max, atual;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Verificação de necessidade de abastecimento de estoque");
		atual = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em estoque:"));
		max = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade máxima em estoque:"));
		min = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade minima em estoque:"));
		
		// vereficar situação do estoque e mostrar se é nessessario efetuar compras
		JOptionPane.showMessageDialog(null, "A quantidade média de estoque é : " + (min + max)/2);
		if ((min + max)/2  >= atual) {
			JOptionPane.showMessageDialog(null,"Efetuar compra");
		} else {
			JOptionPane.showMessageDialog(null, "Não efetuar compra");			
		}
		
	}

}
