package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dados sobre o salário e número de filhos de cada habitante
 * e após as leituras, escrever Média de salário da população Média do número de
 * filhos Maior salário dos habitantes Percentual de pessoas com salário menor
 * que R$ 150.00
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio84 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double salario, mediaFilhos, mediaSalario, maiorSalario, percentual;
		int cont, filhos;
		String resposta;

		JOptionPane.showMessageDialog(null, "Programa para pesquisa de renda");

		// inicializando as variaveis
		mediaFilhos = 0;
		mediaSalario = 0;
		maiorSalario = 0;
		percentual = 0;
		resposta = "";
		cont = 0;

		// pesquisa
		do {
			// recebe o salario
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário da pessoa:"));

			// verefica se o salário não é negativo
			if (salario >= 0) {

				// atualiza o maior salario
				if (cont == 0) {
					maiorSalario = salario;
				} else if (salario > maiorSalario) {
					maiorSalario = salario;
				}

				// conta quantos habitantes recebem + do que R$ 150,00
				if (salario < 150) {
					percentual++;
				}

				// adiciona o salario para calculo da média
				mediaSalario += salario;

				// recebe número de filhos
				filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos da pessoa:"));
				mediaFilhos += filhos;

				// conta quantos habitantes foram pesquisados
				cont++;
			}
		} while (salario >= 0);

		// verefica se a média de salário é diferente de zero
		if (mediaSalario == 0) {
			resposta += "Média de salário: R$ 0";
		} else {
			// calcula a média de filhos
			resposta += "Média de salário : R$ " + (mediaSalario / cont);
		}

		// verefica se a média de filhos é diferente de zero
		if (mediaFilhos == 0) {
			resposta += "\nMédia de filhos : 0";
		} else {
			// calcula a média de filhos
			resposta += "\nMédia de filhos é: " + (mediaFilhos / cont);
		}

		JOptionPane.showMessageDialog(null, resposta + "\nMaior salário: R$ " + maiorSalario
				+ "\nPercentual salário abaixo de R$ 150,00: " + ((percentual * 100) / cont) + "%");

	}

}
