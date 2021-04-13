/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para realizar a operaão de um saque em um caixa eletronico
 * @author lpedrosokr
 * @since 08/02/2021
 */
public class CaixaEletronico {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double saque;
		int n50, n20, n10, n5, n2, valor;
		String resultado;
		
		// inicia a quantidade de cada tipo de nota
		n2 = 0;
		n5 = 0;
		n10 = 0;
		n20 = 0;
		n50 = 0;
		
		// Captura de dados
		saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor desejado: "));
		
		valor = (int) saque;
		
		if ((valor == saque) && (valor > 1) && (valor != 3)) {
			// verefica se o valor do saque é igual a um valor impar
			if (valor % 2 == 1) {
				n5 = n5 +1;
				valor = valor-5;
			}

			// conta notas de 50
			if (valor >= 50) {
				n50 = (int) (valor / 50);
				valor = valor - (50 * n50);				
			}
			
			// conta notas de 20
			if (valor >= 20) {
				n20 = (int) (valor / 20);
				valor = valor - (20 * n20);				
			}

			// conta notas de 10
			if (valor >= 10) {
				n10 = (int) (valor / 10);
				valor = valor - (10 * n10);				
			}

			// conta notas de 5
			if ((valor >= 5) && (valor % 2 != 0)) {
				n5 = (int) (valor / 5);
				valor = valor - (5 * n5);				
			}
			

			// conta notas de 2
			if (valor >= 2) {
				n2 = (int) (valor / 2);
				valor = valor - (2 * n2);				
			}
			
			// apresenta o valor sacado e quantidade de cada nota
			valor = n2 * 2 + n5 * 5 + n10 * 10 + n20 * 20 + n50 * 50;
			
			resultado = "Valor total do saque: R$ " + valor + ".00";
			
			if (n50 > 0) {
				resultado = resultado + "\n- Notas de R$ 50.00: " + n50;
			}
			if (n20 > 0) {
				resultado = resultado + "\n- Notas de R$ 20.00: " + n20;
			}

			if (n10 > 0) {
				resultado = resultado + "\n- Notas de R$ 10.00: " + n10;
			}
			if (n5 > 0) {
				resultado = resultado + "\n- Notas de R$ 5.00:  " + n5;
			}
			if (n2 > 0) {
				resultado = resultado + "\n- Notas de R$ 2.00:  " + n2;
			}
			
			JOptionPane.showMessageDialog(null, resultado);
			
			
		} else {
			// apresenta mensagem de erro
			JOptionPane.showMessageDialog(null, "ERRO! Valor de saque inválido.\n"
												+ "Regras de saque:\n"
												+ "- Valor maior ou igual a  R$ 2.00.\n"
												+ "- Valor  diferente de R$ 3.00.\n"
												+ "- Valor não pode conter centavos.\n");
		}
	}

}
