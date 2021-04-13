package exercicios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Programa para mostrar as tabuadas do 1 ao 10
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio85 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String tabuada;
		
		DecimalFormat formatador = new DecimalFormat("00");

		// inicia a variavel
		tabuada = "---------------------------------------------------------------------------------------------------------------------------------\n";

		// calcula os valores da tabuada e coloca na mensagem
		// Calcula e coloca os valores da tabuada linha por linha utilizando a variavel i para apresentar a tabuada e j para apresentar o valor que está sendo multiplicado
		for (int i = 1; i <= 10; i += 5) {
			tabuada += "Tabuada do " + i + ":       Tabuada do " + (i + 1) + ":         Tabuada do " + (i + 2) + ":         Tabuada do " + (i + 3) + ":" + ":         Tabuada do " + (i + 4) + ":\n";
			for (int j = 1; j < 11; j++) {
				if (j == 10) {
					tabuada += i + " * " + j + " = " + (i * j) // i
							+ "               " + (i + 1) + " * " + j + " = " + (i + 1) * j // i+1
							+ "                " + (i + 2) + " * " + j + " = " + (i + 2) * j // i+2
							+ "                " + (i + 3) + " * " + j + " = " + (i + 3) * j // i+3
							+ "                " + (i + 4) + " * " + j + " = " + (i + 4) * j + "                  \n"; //i+4
				} else {
					tabuada += i + " * " + j + "  = " + formatador.format(i * j) // i
							+ "                 " + (i + 1) + " * " + j + "  = " + formatador.format((i+1)*j) // i+1
							+ "                 " + (i + 2) + " * " + j + "  = " + formatador.format((i + 2) * j) // i+2
							+ "                 " + (i + 3) + " * " + j + "  = " + formatador.format((i + 3) * j) // i+3
							+ "                 " + (i + 4) + " * " + j + "  = " + formatador.format((i + 4) * j) + "                  \n"; //i+4
				} 
				
			}
			tabuada += "---------------------------------------------------------------------------------------------------------------------------------\n";
		}

		// apresenta as tabuadas
		JOptionPane.showMessageDialog(null, tabuada);

	}

}
