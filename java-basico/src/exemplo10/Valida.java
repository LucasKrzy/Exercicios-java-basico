package exemplo10;

/**
 * Classe responsavel por armazear os m�todos de valida��o de dados
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class Valida {

	// m�todo para vereficar String vazia
	public static boolean isStringVazio(String args) {
		// comando trim - tira os espa�os da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// fim do m�todo

	// m�todo para vereficar String nula
	public static boolean isStringNull(String args) {
		if (args.equals(null)) {
			return true;
		} else {
			return false;
		}
	}// fim do m�todo

	// m�todo para vereficar String v�lida
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}// fim do m�todo

	// m�todo para vereficar se � numero
	public static boolean isNumber (String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
