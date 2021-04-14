/**
 * 
 */
package exemplo07;

/**
 * Classe para testar o objeto pessoa
 * @author Lucas Pedroso Krzyzanowski
 * @since 17 de fev. de 2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();
		
		// Atribuindo os valores ao objeto joao
		joao.setNome("João Paulo Nascimento");
		joao.setSalario(1000);
		
		// criando o objeto de data
		Data dataNascimento = new Data();
		
		// Inicializando a data do objeto joão
		dataNascimento.setDia(10);
		dataNascimento.setMes(1);
		dataNascimento.setAno(1992);
		
		// Atribuindo os valores de data para o objeto joão
		joao.setDataNascimento(dataNascimento);
		
		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println("Saláio: " + joao.getSalario());
		System.out.println(joao.salarioMinimo());
		
	}

}
