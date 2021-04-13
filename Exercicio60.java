package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para solicitar um código de usuário e de senha e vereficar se os mesmos estáo corretos
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio60 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int usuario, senha;
		// Captura de dados
		
		JOptionPane.showMessageDialog(null, "Simulador de acesso");
		usuario = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do usuário:"));

		// verefica se o usuário está correto
		if (usuario == 1234) {
			senha = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha:"));
			if (senha == 9999) {
				JOptionPane.showMessageDialog(null, "Acesso permitido");				
			} else {
				JOptionPane.showMessageDialog(null, "Senha incorreta");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Usuário inválido");
		}
		

	}

}
