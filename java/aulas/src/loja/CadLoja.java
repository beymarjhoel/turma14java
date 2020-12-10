package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char generoCliente;
		char opcaoMenu;
		String nomeCliente;
		
		linha();
		System.out.println("Dungeons & Gincanas");
		System.out.println("[SLOGAN LEGAL]");
		linha();
		pula();
		//Menu Principal
		System.out.println("[1] - Comprar Produtos");
		System.out.println("[2] - Gerenciar Estoques");
		System.out.println("[3] - Sair");
		pula();
		System.out.print("Digite a opção:► ");
		opcaoMenu = scan.next().charAt(0);
		pula();
		switch(opcaoMenu) {
			case '1':
				linha();
				System.out.println("Dungeons & Gincanas");
				linha();
				System.out.print("Nome do cliente: ");
				nomeCliente = scan.next().toUpperCase();	//por o nome dele em maiusculo o 1 nome
				System.out.print("Gênero do cliente [M] Masculino [F] Feminino [O] Outro: ");
				generoCliente = scan.next().toUpperCase().charAt(0);
			
				if(voltaGenero(generoCliente) == "Masculino") {
					pula();
					System.out.printf("Seja bem vindo a loja %s!",nomeCliente);
				} else if (voltaGenero(generoCliente) == "Feminino") {
					pula();
					System.out.printf("Seja bem vinda a loja %s!",nomeCliente);
				} else if (voltaGenero(generoCliente) == "Outros") {
					pula();
					System.out.printf("Seja bem vindx a loja %s!",nomeCliente);
				}
				
			break;
			
			case '2':
				pula();
				System.out.println("WIP");	//Work in progress
			break;
			
			case '3':
				pula();
				System.out.println("Obrigado por visitar a nossa loja, adoramos sua visita!");
			break;
		}
	}

	public static String voltaGenero(char generoCliente) {

		String tipo;
		if (generoCliente == 'M') {
			tipo = "Masculino";
		} else if (generoCliente == 'F') {
			tipo = "Feminino";
		} else if (generoCliente == 'O') {
			tipo = "Outros";
		} else {
			tipo = "N/D"; // sem dados
		}

		return tipo;
	}

	public static void pula() {
		System.out.print("\n");
	}

	public static void linha() {
		System.out.print("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
	}

}
