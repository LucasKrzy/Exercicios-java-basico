package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstração do componente JoptionPane acessando atributos
 * estáticos
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// utilizando o JoptionPane para exibição de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 0); // 0 - código do ícone de erro
		
		// utilizando o JoptionPane para exibição de mensagem de informação
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuarios, 1); // 1 - código do ícone de informação
		
		// utilizando o JoptionPane para exibição de mensagem de advertência
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 2); // 2 - código do ícone de advertencia
		
		// utilizando o JoptionPane para exibição de mensagem de dúvida
//		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 3); // 3 - código do ícone de interrogação

	}

}
