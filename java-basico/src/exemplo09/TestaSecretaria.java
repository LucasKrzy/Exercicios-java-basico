package exemplo09;

/**
 * Classe responsavel por instanciar o objeto Secretaria e exibir os seus dados 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class TestaSecretaria {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Criando um objeto do tipo Secretaria e o instanciando
		Secretaria maria = new Secretaria();
		
		maria.setNome("Maria da Silva");
		maria.setCpf("076.806.351.20");
		maria.setSalario(900.87);
		maria.setRamal(156);
		
		maria.mostrarDados();
	}

}
