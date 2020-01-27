package teste;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;

		System.out.println("Informe o 1º Número:");
		num1 = teclado.nextInt();
		
		System.out.println("Informe a 2º Nota:");
		num2 = teclado.nextInt();
		
		System.out.println("Informe a 3º Nota:");
		num3 = teclado.nextInt();
		
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior número");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o maior número");
		}
		else {
			System.out.println("\n\n" + num3 + " é o maior número");
		}


	}

}
