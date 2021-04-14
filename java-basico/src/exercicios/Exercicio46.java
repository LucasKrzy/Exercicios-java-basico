package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero da conta do cliente, saldo, d�bido e cr�dito do cliente, calcular e mostrar seu saldo total
 * por fim vereficar se o mesmo � positivo ou negativo
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio46 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int nConta;
		double saldo, credito, debito, saldoAtual;
		String mensagem;
		
		// iniciango mensagem vazia
		mensagem = "";
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "C�lculo de saldo atual de um cliente");
		nConta = Integer.parseInt(JOptionPane.showInputDialog("Informe n�mero de conta do cliente:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo do cliente:"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o d�bito do cliente:"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o cr�dito do cliente:"));
		
		// Calcular saldo
		saldoAtual = saldo - debito + credito;
		
		// Exibir o saldo atual e se o mesmo � positivo ou negativo
		mensagem += "O saldo atual do cliente " + nConta + " � : R$ " + String.format("%.2f", saldoAtual);
		if (saldoAtual  >= 0) {
			JOptionPane.showMessageDialog(null, mensagem + "\nSaldo Positivo");
		} else {
			JOptionPane.showMessageDialog(null, mensagem + "\nSaldo Negativo");			
		}
		
	}

}
