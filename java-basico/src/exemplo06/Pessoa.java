/**
 * 
 */
package exemplo06;

/**
 * Classe para demonstrar a utiliza��o de objetos Responsavel por armazenar seus
 * atributos e m�todos
 *
 * @author Lucas Pedroso Krzyzanowski
 * @since 17 de fev. de 2021
 */
public class Pessoa {

	// atributos ou caracteristicas do objeto
	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;

	// m�todo para exibir os dados da pessoa
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
	}
	
	// m�todo para retornar a idada da pessoa
	public int mostrarIdade() {
		// declarando a variavel de retorno do m�todo
		int idade = 0;
		
		// variavel para armazenar ano de nascimento
		int anoNascimento = 0;
		int anoAtual = 2021;
		
		// quebrando a data do tipo string
		String dataQuebrada [] = dataNascimento.split("/");
		anoNascimento = Integer.parseInt(dataQuebrada[2]);
		
		// calculando a idade
		idade = anoAtual - anoNascimento;
		
		// retornando a idade calculada
		return idade;
	}
	
	// metodo para calcular se � maior de idade ou n�o
	public String maioridade() {
		if(mostrarIdade() >= 18) {
			return "� maior de idade";
		} else {
			return "Menor de idade";
		}
		
				
	}

}
