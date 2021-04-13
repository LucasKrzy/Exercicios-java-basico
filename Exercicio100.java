package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para ler a tempratuda dos dias de uma semana e calcular: - A menor
 * temperatura - A maior temperatura - Temperatura m�dia semanal - O n�mero de
 * dias em que a temperatura foi inferior � m�dia semanal.
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio100 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double temperatura[], media;
		int menor, maior, abaixoMedia;
		String mensagem;

		DecimalFormat formatador = new DecimalFormat("##.00");

		
		// Iniciando o vetor e informando a quantidade de posi��es (tamanho)
		temperatura = new double[7];

		// iniciando a variavel de m�dia, menor, maior, abaixo da m�dia e mensagem
		media = 0;
		menor = 0;
		maior = 0;
		abaixoMedia = 0;
		mensagem = "------------------------Relat�rio semanal de temperatura------------------------\n\n";

		
		JOptionPane.showMessageDialog(null, "Controle de temperatura");
		// Valorizando o vetor com a temperatura informada pelo usu�rio
		for (int i = 0; i < temperatura.length; i++) {
			// verefica o dia da semana e solicita a temperatura do dia
			switch (i) {
			case 0: { // segunda
				temperatura[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe a temperatura da Segunda-feira"));
				break;
			}
			case 1: { // te�a
				temperatura[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Informe a temperatura da Ter�a-feira"));
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

			// verefica��o se o valor informado � maior ou menor do que os informados
			// anteriormente
			if (temperatura[i] < temperatura[menor]) {
				menor = i;
			} else if (temperatura[i] > temperatura[maior]) {
				maior = i;
			}
			// soma para calcular m�dia
			media += temperatura[i];
		}

		// calcula a temperatura m�dia
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
			mensagem+= "Segunda-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "�C\n";
			break;
		}
		case 1: { // ter�a
			mensagem+= "Ter�a-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "�C\n";
			break;
		}
		case 2: { // Quarta
			mensagem+= "Quarta-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "�C\n";
			break;
		}
		case 3: { // qunita
			mensagem+= "Quinta-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "�C\n";
			break;
		}
		case 4: { // sexta
			mensagem+= "Sexta-feira foi o dia mais frio com a temperatura: "+ temperatura[menor] + "�C\n";
			break;
		}
		case 5: { // sabado
			mensagem+= "Sabado foi o dia mais frio com a temperatura: "+ temperatura[menor] + "�C\n";
			break;
		}
		default: // domigo
			mensagem+= "Domingo foi o dia mais frio com a temperatura: "+ temperatura[menor] + "�C\n";
			break;
		}

		// coloca na mensagem o dia com maior temperatura
		switch (maior) {
		case 0: { // segunda
			mensagem+= "Segunda-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "�C\n";
			break;
		}
		case 1: { // ter�a
			mensagem+= "Ter�a-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "�C\n";
			break;
		}
		case 2: { // Quarta
			mensagem+= "Quarta-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "�C\n";
			break;
		}
		case 3: { // quinta
			mensagem+= "Quinta-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "�C\n";
			break;
		}
		case 4: { // sexta
			mensagem+= "Sexta-feira foi o dia mais quente com a temperatura: "+ temperatura[maior] + "�C\n";
			break;
		}
		case 5: { // sabado
			mensagem+= "Sabado foi o dia mais quente com a temperatura: "+ temperatura[maior] + "�C\n";
			break;
		}
		default: // domigo
			mensagem+= "Domingo foi o dia mais quente com a temperatura: "+ temperatura[maior] + "�C\n";
			break;
		}
		
		// coloca na mensagem a temperatura m�dia
		mensagem += "A temperatura m�dia da semana foi: " + formatador.format(media) + "�C\n";
		
		// coloca na mensagem a quantidade de dias abaixo ta temperatura m�dia
		mensagem += "Durante a semana " + abaixoMedia + " dias tiveram a temperatura abaixo da m�dia";
		
		// mostra na tela um relat�rio referente as temperaturas da semana
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
