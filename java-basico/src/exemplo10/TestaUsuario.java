package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a demonstra��o de exce��es em java
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class TestaUsuario {

	/*
	 * M�todo principal para executar a classe
	 */
	public void receberDados() {
//		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
//			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usu�rio", 0);
//		} else {
//			JOptionPane.showMessageDialog(null, "Nome v�lido", "Cadastro de Usu�rio", 1);
//		}

		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, "Nome v�lido", "Cadastro de Usu�rio", 1);

		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usu�rio", 0);
		}
		

//		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
//			JOptionPane.showMessageDialog(null, "Idade v�lida", "Cadastro de Usu�rio", 1);
//
//		} else {
//			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalido, "Cadastro de Usu�rio", 0);
//		}
		
	}
	
	

	public static void main(String[] args) {

		new TestaUsuario().receberDados();
//		// instanciando um objeto do tipo usu�rio
//		Usuario admin = new Usuario();
//		admin.setNome("Lucas Pedroso Krzyzanowski");
//		admin.setLogin("l.pedroso");
//		admin.setSenha("1234");
//		admin.setIdade(25);
	}

}
