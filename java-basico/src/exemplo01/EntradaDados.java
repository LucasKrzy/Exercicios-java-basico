package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar entrada de dados fornecido pelo usu�rio
 * @author lpedrosokr
 *@since 05/02/2021
 */
public class EntradaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String nome;
		
		// atribuir valor para variavel informado pelo usu�rio
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		
		// exibindo valores no console
		
		System.out.println("Nome: " + nome);

	}

}
