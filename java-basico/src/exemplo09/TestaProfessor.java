package exemplo09;

/**
 * Classe responsavel por instanciar o objeto professor e exibir os seus dados 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class TestaProfessor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Criando um objeto do tipo professor e o instanciando
		Professor jose = new Professor();
		
		jose.setNome("José da Silva");
		jose.setCpf("096.306.331.80");
		jose.setSalario(5900.87);
		jose.setMateria("Geografia");
		
		jose.mostrarDados();
	}

}
