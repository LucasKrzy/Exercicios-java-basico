package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número da conta do cliente, saldo, débido e crédito do cliente, calcular e mostrar seu saldo total
 * por fim vereficar se o mesmo é positivo ou negativo
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int nConta;
		double saldo, credito, debito, saldoAtual;
		String mensagem;
		
		// iniciango mensagem vazia
		mensagem = "";
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Cálculo de saldo atual de um cliente");
		nConta = Integer.parseInt(JOptionPane.showInputDialog("Informe número de conta do cliente:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo do cliente:"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o débito do cliente:"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o crédito do cliente:"));
		
		// Calcular saldo
		saldoAtual = saldo - debito + credito;
		
		// Exibir o saldo atual e se o mesmo é positivo ou negativo
		mensagem += "O saldo atual do cliente " + nConta + " é : R$ " + String.format("%.2f", saldoAtual);
		if (saldoAtual  >= 0) {
			JOptionPane.showMessageDialog(null, mensagem + "\nSaldo Positivo");
		} else {
			JOptionPane.showMessageDialog(null, mensagem + "\nSaldo Negativo");			
		}
		
	}

}
