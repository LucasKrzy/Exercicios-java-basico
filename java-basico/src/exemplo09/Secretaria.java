package exemplo09;

/**
 * Classe para armazenar os dados da secretária herdando os dados do funcionário
 * (herança)
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 23 de fev. de 2021
 */
public class Secretaria extends Funcionario implements InterfaceFuncionario{
	
	// atributos do objeto professor
	private int ramal;

	// método para acessar os atributos
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	// método para exibir dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Ramal: " + ramal);
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
