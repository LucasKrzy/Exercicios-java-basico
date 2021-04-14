package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se um empregado está qualificado para a aposentadoria ou não, escrevendo a sua idade, tempo trabalhado e se pode ou não aposentar
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio63 {
	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int codigo, ingresso, nascimento, idade, tempoTrabalhado;
		String mensagem;
		
		// inicializando a mensagem
		mensagem = "";
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Vereficar se o empregado requer ou não aposentadoria");
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do funcionário"));
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do funcionário"));
		ingresso = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de ingresso do funcionário"));
		
		// calcula idade e tempo trabalhado;
		idade = 2021 - nascimento;
		tempoTrabalhado = 2021 - ingresso;
		mensagem += "O funcionário "+ codigo +" tem " + idade + " anos";
		mensagem += "\nO funcionário trabalha na empresa a " + tempoTrabalhado + " anos";
		
		// verifica se o funcionario requer aposentadoria e apresenta na tela
		if((idade >= 65) || (tempoTrabalhado >= 30) || ((idade >= 60) && (tempoTrabalhado >= 25))) {
			JOptionPane.showMessageDialog(null, mensagem + "\nRequerer aposentadoria");
		} else {
			JOptionPane.showMessageDialog(null, mensagem + "\nNão requer aposentadoria");
		}
	}

}
