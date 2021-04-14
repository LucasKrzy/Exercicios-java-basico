package exemplo10;

/**
 * Classe responsavel por armazear os métodos de validação de dados
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class Valida {

	// método para vereficar String vazia
	public static boolean isStringVazio(String args) {
		// comando trim - tira os espaços da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para vereficar String nula
	public static boolean isStringNull(String args) {
		if (args.equals(null)) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para vereficar String válida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para vereficar se é numero
	public static boolean isNumber (String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
