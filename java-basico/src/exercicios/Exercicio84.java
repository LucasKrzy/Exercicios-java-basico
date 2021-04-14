package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dados sobre o sal�rio e n�mero de filhos de cada habitante
 * e ap�s as leituras, escrever M�dia de sal�rio da popula��o M�dia do n�mero de
 * filhos Maior sal�rio dos habitantes Percentual de pessoas com sal�rio menor
 * que R$ 150.00
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio84 {
	/*
	 * M�todo principal para executar a classe
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
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio da pessoa:"));

			// verefica se o sal�rio n�o � negativo
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

				// adiciona o salario para calculo da m�dia
				mediaSalario += salario;

				// recebe n�mero de filhos
				filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos da pessoa:"));
				mediaFilhos += filhos;

				// conta quantos habitantes foram pesquisados
				cont++;
			}
		} while (salario >= 0);

		// verefica se a m�dia de sal�rio � diferente de zero
		if (mediaSalario == 0) {
			resposta += "M�dia de sal�rio: R$ 0";
		} else {
			// calcula a m�dia de filhos
			resposta += "M�dia de sal�rio : R$ " + (mediaSalario / cont);
		}

		// verefica se a m�dia de filhos � diferente de zero
		if (mediaFilhos == 0) {
			resposta += "\nM�dia de filhos : 0";
		} else {
			// calcula a m�dia de filhos
			resposta += "\nM�dia de filhos �: " + (mediaFilhos / cont);
		}

		JOptionPane.showMessageDialog(null, resposta + "\nMaior sal�rio: R$ " + maiorSalario
				+ "\nPercentual sal�rio abaixo de R$ 150,00: " + ((percentual * 100) / cont) + "%");

	}

}
