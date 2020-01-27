package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String login;
		String senha;

		System.out.println("Login: ");
		login = teclado.nextLine();

		System.out.println("Senha:");
		senha = teclado.nextLine();

		System.out.println("----------------------");
		if (login.trim().equals("danillo") & senha.trim().equals("honeypot")) {

			System.out.println("Logado com Sucesso!");

			System.out.println("----------------------");

			System.out.println("Informe Seu Peso:");
			double peso;
			peso = teclado.nextDouble();

			System.out.println("Informe Sua Altura:");
			double altura;
			altura = teclado.nextDouble();

			System.out.println("----------------------");
			System.out.println("Seu IMc é de: " + (peso + altura));

		} else {

			System.out.println("Dados Invalidos");
		}

		System.out.println("----------------------");

		System.out.println("##FIM##");
	
	teclado.close();
	}
}