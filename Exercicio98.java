package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores com 15 numeros cada e contar a quantidade de vezes que os valores dos vetores coincidem entre si
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio98 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double V1[], V2[];
		int cont;

	
		// Iniciando o vetor e informando a quantidade de posi��es (tamanho)
		V1 = new double[15];
		V2 = new double[15];
		
		// iniciando o vetor contador
		cont = 0;
		
		JOptionPane.showMessageDialog(null,"Ler dois vetores e informar quantas\nvezes n�meros coincidem\nem valores e posi��es");
		
		// Valorizando os vetores com dados informados pelo usuario
		for (int i = 0; i < V1.length; i++) {
			V1[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1) + " valor do vetor V1:"));
		}

		for (int i = 0; i < V2.length; i++) {
			V2[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1) + " valor do vetor V2:"));
		}

		// contando quantas vezes os valores dos vetores coincidem
		for (int i = 0; i < V1.length; i++) {
			if (V1[i] == V2[i]) {
				cont++;
			}
		}

		JOptionPane.showMessageDialog(null,"Os vetores possuem "+ cont + " n�mero(s) que coincidem em posi��o e valor.");
	}

}
