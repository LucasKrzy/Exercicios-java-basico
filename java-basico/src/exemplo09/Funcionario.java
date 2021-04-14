package exemplo09;

/**
 * Classe para demonstar o conceito de herança de métodos e atributos
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public abstract class Funcionario{
	
	// Atributos do objeto funcionário
	private String nome;
	private String cpf;
	private double salario;
	
	// métodos para acessar os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Método para exibir os atributos
	public void mostrarDados(){
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salário: R$" + salario);
	}
	
}
