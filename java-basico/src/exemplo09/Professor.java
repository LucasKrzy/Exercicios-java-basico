package exemplo09;

/**
 * Classe para armazenar os dados do professor herdando os dados do funcionário
 * (herança)
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class Professor extends Funcionario{
	
	// atributos do objeto professor
	private String materia;

	// método para acessar os atributos
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// método para exibir dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Matéria: " + materia);
	}
	
	
}
