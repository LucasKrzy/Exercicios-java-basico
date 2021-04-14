package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstra��o do componente JoptionPane acessando atributos
 * est�ticos
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// utilizando o JoptionPane para exibi��o de mensagem de erro
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 0); // 0 - c�digo do �cone de erro
		
		// utilizando o JoptionPane para exibi��o de mensagem de informa��o
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuarios, 1); // 1 - c�digo do �cone de informa��o
		
		// utilizando o JoptionPane para exibi��o de mensagem de advert�ncia
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 2); // 2 - c�digo do �cone de advertencia
		
		// utilizando o JoptionPane para exibi��o de mensagem de d�vida
//		JOptionPane.showMessageDialog(null, "Conte�do", "T�tulo", 3); // 3 - c�digo do �cone de interroga��o

	}

}
