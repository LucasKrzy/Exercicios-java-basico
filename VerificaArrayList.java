package exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Classe para praticar o uso de um ArrayList possuindo as opções: 1. Cadastrar
 * nome; 2. Excluir nome; 3. Listar nomes cadastrados; 4. Listar nomes em ordem
 * alfabética; 5. Listar nomes iguais; 6. Listar nomes por letra inicial
 * (usuário irá informar a letra inicial do nome a ser pesquisada); 7. Pesquisar
 * nome (usuário deve informar um nome e programa devolver se está cadastrado ou
 * não); 8. Sair do Sistema;
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 26 de fev. de 2021
 */
public class VerificaArrayList {

//////Declarando lista de Strings
	private ArrayList<String> nomes;
	private ArrayList<String> nomesCopia;

//////Declarando rótulos
	public static String rotuloVerificaArrayList = "Controle de nomes";
	public static String rotuloCadastroNome = "Cadastro de nomes";
	public static String rotuloExcluirNome = "Excluir nome";
	public static String rotuloNomesIguais = "Nomes iguais";
	public static String rotuloNomesOrdenados = "Nomes ordenados";
	public static String rotuloListaPorCaracter = "Listar por caracter";
	public static String rotuloPesquisaNome = "Pesquisa por nome";

//////Declarando Mensagens
	public static String mensagemMenu = "Informe o código da opção desejada: \n" + "\n1.      Cadastrar nome"
			+ "\n2.      Excluir nome" + "\n3.      Listar nomes cadastrados"
			+ "\n4.      Listar nomes em ordem alfabética" + "\n5.      Listar nomes iguais"
			+ "\n6.      Listar nomes por letra inicial" + "\n7.      Pesquisar nome" + "\n8.      Sair do Sistema";

	public static String mensagemOpcaoInvalida = "Opção Invalida!";
	public static String mensagemNomeInvalido = "Nome Inválido!\nFavor informe um nome com apenas letras.";
	public static String mensagemCadastrarNome = "Informe o nome desejado:";
	public static String mensagemNomeCadastrado = "Nome cadastrado com sucesso. ";
	public static String mensagemCadastroCheio = "Impossivel realzar cadastro - Cadastro cheio. ";
	public static String mensagemCadastroVazio = "Cadastro vazio - Cadastre ao menos um nome. ";
	public static String mensagemExcluirNome = "Deseja realmente excluir o nome - ";
	public static String mensagemNomeExcluido = "Nome excluido com sucesso! ";
	public static String mensagemSemNomesIguais = "Nenhum nome repetido encontrado! ";
	public static String mensagemInformeCaracter = "Informe um caracter para pesquisar: ";
	public static String mensagemCaracterInvalido = "Caracter inválido - Informe apenas um caracter! ";
	public static String mensagemCaracterNaoEncontrado = "Caracter não encontrado! \nNenhum nome da lista inicia com o caracter informado ";
	public static String mensagemPesquisaNome = "Informe um nome para vereficar se o mesmo está cadastrado";
	public static String mensagemPesquisaCadastrado = "Nome cadastrado!";
	public static String mensagemPesquisaNaoCadastrado = "Nome não cadastrado!";
	public static String mensagemPesquisaErro = "Impossivel realizar pesquisa!\nInforme apenas caracteres válidos";

//	Construtor da classe VerificaArrayList
	public VerificaArrayList() {
		// Instanciando a lista
		nomes = new ArrayList<String>();
		// Instanciando a lista
		nomesCopia = new ArrayList<String>();

//		instancia para teste
		nomes.add("Lucas Pedroso");
		nomes.add("Pedro Silva");
		nomes.add("Maria de Oliveira");
		nomes.add("João Perreira");
		nomes.add("Willian Bonner");
//		nomes.add("Willian Bonner");
//		nomes.add("Willian Bonner");
//		nomes.add("Willian Bonner");
//		nomes.add("Pedro Silva");
		nomes.add("Pedro Silva");
		nomes.add("Pedro Portugal");
		nomes.add("Elvis Presley");
//		nomes.add("Roberto Carlos");
//		nomes.add("Mayte Carvalho");

		// chamando o método do menu principal
		menuPrincipal();
	}

//	Método para criar um menu de opções
	public void menuPrincipal() {

		// laço de repetição para executar o menu
		while (true) {
			// testando se o código da opção informado é valido
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(mensagemMenu));
				processamentoPrincipal(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, mensagemOpcaoInvalida, rotuloVerificaArrayList, 0);
			}
		}
	}

//	Método para controlar o processamento do sistema
	public void processamentoPrincipal(int opcao) {

		switch (opcao) {
		case 1: {
			cadastraNome();
			break;
		}
		case 2: {
			excluirNome();
			break;
		}
		case 3: {
			listaNomes();
			break;
		}
		case 4: {
			listarOrdemAlfabetica();
			break;
		}
		case 5: {
			listarNomesIguais();
			break;
		}
		case 6: {
			listarPorInicial();
			break;
		}
		case 7: {
			pesquisarNome();
			break;
		}
		case 8: {
			sairDoSistema();
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, mensagemOpcaoInvalida, rotuloVerificaArrayList, 0);
			break;
		}
	}

//	Método para Cadastrar nome;
	public void cadastraNome() {
		// verifica se a lista tem 10 itens cadastrados
		if (isListaCheia(nomes)) {
			// mostra mensagem informando que a lista está cheia
			JOptionPane.showMessageDialog(null, mensagemCadastroCheio, rotuloCadastroNome, 0);
		} else {
			// caso a lista não esteja cheia solicita do usuário até que um nome sem conter
			// numeros seja informado
			while (true) {
				// recebe um nome do usuário
				String nome = JOptionPane.showInputDialog(mensagemCadastrarNome);
				// verifica se o nome solicitado é valido
				if (!isStringNull(nome) && !isStringVazio(nome) && isStringValida(nome) && !isStringCaractere(nome)) {
					// adiciona o nome na lista
					nomes.add(nome);
					JOptionPane.showMessageDialog(null, mensagemNomeCadastrado, rotuloCadastroNome, 1);
					break;
				} else {
					// apresenta mensagem de nome inválido
					JOptionPane.showMessageDialog(null, mensagemNomeInvalido, rotuloCadastroNome, 0);
				}
			}
		}

	}

//	Método para Excluir nome;
	public void excluirNome() {
		// verifica se a lista não está vazia
		if (isListaVazia(nomes)) {
			JOptionPane.showMessageDialog(null, mensagemCadastroVazio, rotuloVerificaArrayList, 0);
		} else {
			// pede do usuário o código de um nome para apagar o mesmo da lista e verefica
			// se o codigo informado é valido
			try {
				// pede do usuário o código de um nome para apagar o mesmo da lista
				int codigo = Integer.parseInt(
						JOptionPane.showInputDialog(getListaNomes(nomes) + "\nInforme o código do nome desejado"));

				// verifica se o código informado é valido
				if (codigo <= nomes.size() && !isIntZero(codigo)) {
					// pergunta se o usuário tem certeza que quer excluir
					int opcao = JOptionPane.showConfirmDialog(null, mensagemExcluirNome + nomes.get(codigo - 1) + "?",
							rotuloExcluirNome, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
					// caso clique no botão sim apaga o usuário
					if (opcao == JOptionPane.YES_OPTION) {
						nomes.remove(codigo - 1);
						JOptionPane.showMessageDialog(null, mensagemNomeExcluido, rotuloExcluirNome, 1);
					}
					// manda mensagem de código inválido
				} else {
					JOptionPane.showMessageDialog(null, mensagemOpcaoInvalida, rotuloExcluirNome, 0);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, mensagemOpcaoInvalida, rotuloExcluirNome, 0);
			}
		}
	}

//	Método para Listar nomes cadastrados;
	public void listaNomes() {
		// verifica se a lista não está vazia
		if (isListaVazia(nomes)) {
			JOptionPane.showMessageDialog(null, mensagemCadastroVazio, rotuloVerificaArrayList, 0);
		} else {
			JOptionPane.showMessageDialog(null, getListaNomes(nomes), rotuloVerificaArrayList, 1);
		}
	}

	// método para gerar lista com nomes cadastrados
	public String getListaNomes(ArrayList<String> nomes) {
		// inicia variavel de mensagens vazia
		String mensagem = "";
		// coloca na mensagem os nome e códigos
		for (int i = 0; i < nomes.size(); i++) {
			mensagem += (i + 1) + ". " + nomes.get(i) + "\n";
		}
		// retorna a mensagem com os nomes da lista
		return mensagem;
	}

//	Método para Listar nomes em ordem alfabética;
	public void listarOrdemAlfabetica() {
		// verifica se a lista não está vazia
		if (isListaVazia(nomes)) {
			JOptionPane.showMessageDialog(null, mensagemCadastroVazio, rotuloNomesOrdenados, 0);
		} else {
			// limpa todo o conteudo da lista auxiliar
			nomesCopia.clear();
			// copia os dados da lista principal na lista auxiliar
			nomesCopia.addAll(nomes);
			// ordena a lista auxiliar
			nomesCopia.sort(String::compareToIgnoreCase);
			// mostra para o usuário a lista auxiliar
			JOptionPane.showMessageDialog(null, getListaNomes(nomesCopia), rotuloNomesOrdenados, 1);
		}

	}

//	Método para Listar nomes iguais;
	public void listarNomesIguais() {
		// verifica se a lista não está vazia
		if (isListaVazia(nomes)) {
			JOptionPane.showMessageDialog(null, mensagemCadastroVazio, rotuloNomesIguais, 0);
		} else {
			// cria uma lista auxiliar para receber e ordenar os nomes
			ArrayList<String> copiaNomes = new ArrayList<String>();
			// copia os dados da lista principal na lista auxiliar
			copiaNomes.addAll(nomes);
			// ordena os nomes
			copiaNomes.sort(String::compareToIgnoreCase);
			// cria uma lista auxiliar para receber os nomes que repetem
			ArrayList<String> auxNomes = new ArrayList<String>();
			// cria uma lista auxiliar para receber a quantia de vezes que os nomes repetem
			ArrayList<Integer> auxCont = new ArrayList<Integer>();
			// variavel auxiliar para verificar se nome ja foi encontrado
			int codigo = 0;
			// variavel para armazenar texto
			String mensagem = "";

			// percorre o vetor vereficando se os nomes se repetem
			for (int i = 0; i < copiaNomes.size(); i++) {
				for (int j = i + 1; j < copiaNomes.size(); j++) {
					// se o nome repetir verefica se o nome já foi adicionado na lista auxiliar de
					// nomes repetidos
					if (copiaNomes.get(i).equals(copiaNomes.get(j))) {
						// verifica se a lista auxiliar de nomes repetidos não está vazia e adiciona
						// nome na lista auxiliar de repetido e inicia contador auxiliar em 0
						if (isListaVazia(auxNomes)) {
							codigo++;
							auxNomes.add(copiaNomes.get(j));
							auxCont.add(0);
							// verifica se o nome da lista não está na lista de nomes repetidos
						} else if (!(copiaNomes.get(j).equals(auxNomes.get(codigo - 1)))) {
							codigo++;
							auxNomes.add(copiaNomes.get(j));
							auxCont.add(0);
						}
					}
				}
			}

			// percorre os vetores contando quantas vezes os nomes se repetem
			for (int i = 0; i < auxNomes.size(); i++) {
				for (int j = i + 1; j < copiaNomes.size(); j++) {
					if (auxNomes.get(i).equals(copiaNomes.get(j))) {
						auxCont.set(i, (auxCont.get(i) + 1));
					}
				}
			}

			// verifica se a lista auxiliar de nomes não está vazia
			if (isListaVazia(auxNomes)) {
				JOptionPane.showMessageDialog(null, mensagemSemNomesIguais, rotuloNomesIguais, 0);
			} else {
				// carrega a mensagem com os nomes repetidos e a quantia de vezem que os mesmos
				// remetem
				for (int i = 0; i < auxNomes.size(); i++) {
					mensagem += (i + 1) + ". O nome " + auxNomes.get(i) + " aparece " + auxCont.get(i)
							+ " vezes na lista\n";
				}
				JOptionPane.showMessageDialog(null, mensagem, rotuloNomesIguais, 1);
			}

		}
	}

//	Método para Listar nomes por letra inicial (usuário irá informar a letra inicial do nome a ser pesquisada);
	public void listarPorInicial() {
		// verifica se a lista não está vazia
		if (isListaVazia(nomes)) {
			JOptionPane.showMessageDialog(null, mensagemCadastroVazio, rotuloNomesIguais, 0);
		} else {
			// criando e inicializando variavel de mensagem
			String mensagem = "";
			// recebendo valor e verificando se o valor informado tem apenas 1 caractere
			String c = JOptionPane.showInputDialog(mensagemInformeCaracter);
			if (isStringCaractere(c) && isStringValida(c)) {
				// percorrendo a lista e recebendo na variavel mensagem os nomes que iniciam com
				// o caracter infirmado
				for (int i = 0; i < nomes.size(); i++) {
					if (nomes.get(i).startsWith(c)) {
						mensagem += nomes.get(i) + "\n";
					}
				}
				// verifica se a lista está vazia ou não e mosta mensagem
				if (!isStringVazio(mensagem)) {
					JOptionPane.showMessageDialog(null, mensagem, rotuloListaPorCaracter, 1);
				} else {
					JOptionPane.showMessageDialog(null, mensagemCaracterNaoEncontrado, rotuloListaPorCaracter, 0);
				}

			} else {
				JOptionPane.showMessageDialog(null, mensagemCaracterInvalido, rotuloListaPorCaracter, 0);
			}
		}
	}

//	Método para Pesquisar nome (usuário deve informar um nome e programa devolver se está cadastrado ou não);
	public void pesquisarNome() {
		// verifica se a lista não está vazia
		if (isListaVazia(nomes)) {
			JOptionPane.showMessageDialog(null, mensagemCadastroVazio, rotuloNomesIguais, 0);
		} else {
			// variavel para receber nome pesquisado
			String nome = JOptionPane.showInputDialog(mensagemPesquisaNome);
			// verifica se o nome informado é inválido
			if (isStringNull(nome) || isStringVazio(nome) || !isStringValida(nome)) {
				JOptionPane.showMessageDialog(null, mensagemPesquisaErro, rotuloPesquisaNome, 0);
			} else {
				// verifica se o nome informado está cadastrado na lista
				if (nomes.contains(nome)) {
					JOptionPane.showMessageDialog(null, mensagemPesquisaCadastrado, rotuloPesquisaNome, 1);
				} else {
					JOptionPane.showMessageDialog(null, mensagemPesquisaNaoCadastrado, rotuloPesquisaNome, 0);
				}
			}
		}
	}

//	Método para sair do sistema
	public void sairDoSistema() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

//////Métodos de validação
	// método para verificar se a lista está cheia (10 nomes cadastrados)
	public static boolean isListaCheia(ArrayList<String> nomes) {
		if (nomes.size() >= 10) {
			return true;
		} else {
			return false;
		}
	}

	// método para verificar se a lista está vazia
	public static boolean isListaVazia(ArrayList<String> nomes) {
		if (nomes.size() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	// método para verificar String vazia
	public static boolean isStringCaractere(String args) {
		// comando length - verefica o tamanho do String informado
		if (args.trim().length() == 1) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para verificar String vazia
	public static boolean isStringVazio(String args) {
		// comando trim - tira os espaços da variavel String
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para verificar String nula
	public static boolean isStringNull(String args) {
		if (args.equals(null)) {
			return true;
		} else {
			return false;
		}
	}// fim do método

	// método para verificar String válida
	public static boolean isStringValida(String args) {
		if (!args.matches(".*\\d.*")) {
			return true;
		} else {
			return false;
		}
	}

	// verificando se o valor digitado é zero
	public static boolean isIntZero(int args) {
		return (args == 0);
	}

//////Método principal para executar a classe
	public static void main(String[] args) {
		new VerificaArrayList();
	}

}
