package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usuário
 * @author lpedrosokr
 *@since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String nome;
		
		// atribuir valor para variavel informado pelo usuário
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		
		// exibindo valores no console
		
		System.out.println("Nome: " + nome);

	}

}
