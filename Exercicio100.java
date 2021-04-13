package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para ler a tempratuda dos dias de uma semana e calcular: - A menor
 * temperatura - A maior temperatura - Temperatura média semanal - O número de
 * dias em que a temperatura foi inferior à média semanal.
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio100 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double temperatura[], media;
		int menor, maior, abaixoMedia;
		String mensagem;

		DecimalFormat formatador = new DecimalFormat("##.00");

		
		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		temperatura = new double[7];

		// iniciando a variavel de média, menor, maior, abaixo da média e mensagem
		media = 0;
		menor = 0;
		maior = 0;
		abaixoMedia = 0;
		mensagem = "------------------------Relatório semanal de temperatura------------------------\n\n";

		
		JOptionPane.showMessageDialog(null, "Controle de temperatura");
		// Valorizando o vetor com a temperatura informada pelo usuário
		for (int i = 0; i < temperatura.length; i++) {
			// verefica o dia da semana e solicita a temperatura do dia
			switch (i) {
			case 0: { // segunda
				temperatura[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe a temperatura da Segunda-feira"));
				break;
			}
			case 1: { // teça
				temperatura[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe a temperatura da Terça-feira"));
				break;
			}
			case 2: { // quarta
				temperatura[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe a temperatura da Quarta-feira"));
				break;
			}
			case 3: { // quinta
				temperatura[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe a temperatura da Quinta-feira"));
				break;
			}
			case 4: { // sexta
				temperatura[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe a temperatura da Sexta-feira"));
				break;
			}
			case 5: { // sabado
				temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura de Sabado"));
				break;
			}
			default: // domingo
				temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura de Domingo"));
				break;
			}

			// vereficação se o valor informado é maior ou menor do que os informados
			// anteriormente
			if (temperatura[i] < temperatura[menor]) {
				menor = i;
			} else if (temperatura[i] > temperatura[maior]) {
				maior = i;
			}
			// soma para calcular média
			media += temperatura[i];
		}

		// calcula a temperatura média
		if (media != 0) {
			media /= 7;
		}

		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] < media) {
				abaixoMedia++;
			}
		}

		// coloca na mensagem o dia com menor temperatura
		switch (menor) {
		case 0: { // segunda
			mensagem+= "Segunda-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "ºC\n";
			break;
		}
		case 1: { // terça
			mensagem+= "Terça-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "ºC\n";
			break;
		}
		case 2: { // Quarta
			mensagem+= "Quarta-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "ºC\n";
			break;
		}
		case 3: { // qunita
			mensagem+= "Quinta-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "ºC\n";
			break;
		}
		case 4: { // sexta
			mensagem+= "Sexta-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "ºC\n";
			break;
		}
		case 5: { // sabado
			mensagem+= "Sabado foi o dia mais frio com a temperatura: "+ temperatura[menor] + "ºC\n";
			break;
		}
		default: // domigo
			mensagem+= "Domingo foi o dia mais frio com a temperatura: "+ temperatura[menor] + "ºC\n";
			break;
		}

		// coloca na mensagem o dia com maior temperatura
		switch (maior) {
		case 0: { // segunda
			mensagem+= "Segunda-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "ºC\n";
			break;
		}
		case 1: { // terça
			mensagem+= "Terça-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "ºC\n";
			break;
		}
		case 2: { // Quarta
			mensagem+= "Quarta-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "ºC\n";
			break;
		}
		case 3: { // quinta
			mensagem+= "Quinta-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "ºC\n";
			break;
		}
		case 4: { // sexta
			mensagem+= "Sexta-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "ºC\n";
			break;
		}
		case 5: { // sabado
			mensagem+= "Sabado foi o dia mais quente com a temperatura: "+ temperatura[maior] + "ºC\n";
			break;
		}
		default: // domigo
			mensagem+= "Domingo foi o dia mais quente com a temperatura: "+ temperatura[maior] + "ºC\n";
			break;
		}
		
		// coloca na mensagem a temperatura média
		mensagem += "A temperatura média da semana foi: " + formatador.format(media) + "ºC\n";
		
		// coloca na mensagem a quantidade de dias abaixo ta temperatura média
		mensagem += "Durante a semana " + abaixoMedia + " dias tiveram a temperatura abaixo da média";
		
		// mostra na tela um relatório referente as temperaturas da semana
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
