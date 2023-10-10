package br.com.lista_encadeada.main;

import java.util.Scanner;

import br.com.lista_encadeada.logic.Logic;

public class Main {
	public static void main(String[] args) {
		Logic NovaLista = new Logic();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Escolha uma opção:\\n1. Inserir\n2. Remover\n3. Buscar\n4. Sair");
			int escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.print("Digite o valor a ser inserido: ");
				int valorInserir = scanner.nextInt();
				NovaLista.inserir(valorInserir);
				break;
			case 2:
				System.out.print("Digite o valor a ser removido: ");
				int valorRemover = scanner.nextInt();
				boolean checarRemocaoDoValor = NovaLista.remover(valorRemover);
				if (checarRemocaoDoValor) {
					System.out.println("Item removido com sucesso.");
				} else {
					System.out.println("Item não encontrado na lista.");
				}
				break;
			case 3:
				System.out.print("Digite o valor a ser buscado: ");
				int valorBusca = scanner.nextInt();
				boolean checarBuscaDoValor = NovaLista.buscar(valorBusca);
				if (checarBuscaDoValor) {
					System.out.println("Item encontrado na lista.");
				} else {
					System.out.println("Item não encontrado na lista.");
				}
				break;
			case 4:
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
}
