package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se um empregado est� qualificado para a aposentadoria ou n�o, escrevendo a sua idade, tempo trabalhado e se pode ou n�o aposentar
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio63 {
	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int codigo, ingresso, nascimento, idade, tempoTrabalhado;
		String mensagem;
		
		// inicializando a mensagem
		mensagem = "";
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Vereficar se o empregado requer ou n�o aposentadoria");
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do funcion�rio"));
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do funcion�rio"));
		ingresso = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de ingresso do funcion�rio"));
		
		// calcula idade e tempo trabalhado;
		idade = 2021 - nascimento;
		tempoTrabalhado = 2021 - ingresso;
		mensagem += "O funcion�rio "+ codigo +" tem " + idade + " anos";
		mensagem += "\nO funcion�rio trabalha na empresa a " + tempoTrabalhado + " anos";
		
		// verifica se o funcionario requer aposentadoria e apresenta na tela
		if((idade >= 65) || (tempoTrabalhado >= 30) || ((idade >= 60) && (tempoTrabalhado >= 25))) {
			JOptionPane.showMessageDialog(null, mensagem + "\nRequerer aposentadoria");
		} else {
			JOptionPane.showMessageDialog(null, mensagem + "\nN�o requer aposentadoria");
		}
	}

}
