package Controller;

import java.util.Scanner;
import Business.ContatoBusiness;
import Entity.Contato;
import java.util.ArrayList;


public class Main {
	
	static ContatoBusiness business;
	static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		business = new ContatoBusiness();

		
		while(true)
		{
			System.out.println("Digite a opção desejada:");
			System.out.println("1 - Cadastrar um novo contato");
			System.out.println("2 - Consultar um contato");
			//System.out.println("3 - Atualizar um contato");
			//System.out.println("4 - Excluir um contato");
			
			int opcao = scanner.nextInt();
			switch(opcao) {
				case 1:			
					cadastrar();
					break;
				case 2:
					listar();
					break;
				case 3:
					System.out.println("opção inválida");					
			}

		}
	}

	private static void cadastrar() {		
		Contato novocontato = new Contato();
		
		System.out.println("Por favor, insira o nome do novo contato:");
		novocontato.setNome(scanner.next());
		System.out.println("Por favor, insira o e-mail do novo contato:");
		novocontato.setEmail(scanner.next());
		System.out.println("Por favor, insira o idade do novo contato:");
		novocontato.setIdade(scanner.nextInt());
		System.out.println("Por favor, insira o telefone do novo contato:");
		novocontato.setTelefone(scanner.next());
		
		business.create(novocontato);
	}
	
	private static void listar()
	{
		ArrayList<Contato> contatos = business.getAll();
		
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println("Nome: " + contatos.get(i).getNome());
			System.out.println("Idade: " + contatos.get(i).getIdade() + "anos" + ".");
			System.out.println("Telefone: " + contatos.get(i).getTelefone());
			System.out.println("Email: " + contatos.get(i).getEmail());
			System.out.println("---------------------------------------");
		}
	}
}
