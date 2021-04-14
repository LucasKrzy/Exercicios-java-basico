package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o nome, a quantidade adquirida e o pre�o unit�rio. Calcular e escrever o total, os descontos e o total com desconto
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio61 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		String produto, mensagem;
		double quantidade, preco, total;
		
		// inicia mensagem vazia
		mensagem = "";
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "C�lculo do valor de uma compra");
		produto = JOptionPane.showInputDialog("Informe o nome do produto:");
		quantidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade comprada:"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o unit�rio do produto:"));
		
		// calcula pre�o total
		total = quantidade * preco;
		
		mensagem += "-----------------------Compra-----------------------\n\n" + quantidade + " - " + produto + "\n ";
		mensagem += "\nValor total sem desconto: R$ " + String.format("%.2f", total);

		// calcula o valor com desconto
		if (quantidade <= 5 ) {
			// desconto para compras de at� 5 produtos
			mensagem += "\nValor total do desconto:     R$ " + String.format("%.2f", (total * 0.02));
			mensagem += "\nValor total da compra:        R$ " + String.format("%.2f", (total * 0.98));
		} else if (quantidade <= 10) {
			// desconto para compras de at� 10 produtos
			mensagem += "\nValor total do desconto:     R$ " + String.format("%.2f", (total * 0.03));
			mensagem += "\nValor total da compra:        R$ " + String.format("%.2f", (total * 0.97));
		} else {
			// desconto para mais do que 10 produtos
			mensagem += "\nValor total do desconto:     R$ " + String.format("%.2f", (total * 0.05));
			mensagem += "\nValor total da compra:        R$ " + String.format("%.2f", (total * 0.95));
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
