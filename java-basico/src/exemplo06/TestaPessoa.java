/**
 * 
 */
package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto pessoa
 * @author Lucas Pedroso Krzyzanowski
 * @since 17 de fev. de 2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando objeto pessoa joao
		Pessoa joao;
		
		// inicializando o objeto joao
		joao = new Pessoa();
		
		// atribuindo valores ao objeto joao
		joao.nome = "João Pedro Silva";
		joao.dataNascimento = "01/03/2004";
		joao.altura = 1.83;
		joao.peso = 83;
		joao.sexo = "Masculino";
		
		
		// declarando objeto pessoa maria
		Pessoa maria;                                                                                             
		
		// inicializando o objeto maria
		maria = new Pessoa();
		
		// atribuindo valores ao objeto maria
		maria.nome = "Maria das Dores Silva";
		maria.dataNascimento = "01/06/1997";
		maria.altura = 1.63;
		maria.peso = 54;
		maria.sexo = "Feminino";

		
		// exibindo os dados do objeto joao 
		System.out.println("Nome: "+ joao.nome);
		System.out.println("Data de nascimento: "+ joao.dataNascimento);
		System.out.println("Altura: "+ joao.altura);
		System.out.println("Peso: "+ joao.peso);
		System.out.println("Sexo: "+ joao.sexo);
		System.out.println("Idade: " + joao.mostrarIdade());
		System.out.println(joao.maioridade());
		
		// Pulando uma linha 
		System.out.println();
		
		// exibindo os dados do objeto maria 
		System.out.println("Nome: "+ maria.nome);
		System.out.println("Data de nascimento: "+ maria.dataNascimento);
		System.out.println("Altura: "+ maria.altura);
		System.out.println("Peso: "+ maria.peso);
		System.out.println("Sexo: "+ maria.sexo);
		System.out.println("Idade: " + maria.mostrarIdade());
		System.out.println(maria.maioridade());

		// Pulando uma linha 
		System.out.println();
		
		// exibindo dados utilizando método
		joao.exibirDados();

		// Pulando uma linha 
		System.out.println();

		// exibindo dados utilizando método
		maria.exibirDados();

		// Pulando uma linha 
		System.out.println();
	}

}
