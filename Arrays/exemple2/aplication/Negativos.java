package application;

import java.util.Scanner;

import entities.Número;

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Número[] vect = new Número[n];

		if (n > 10) {
			System.out.println("Digite um número menor ou igual a 10");
		} else {
			for (int i = 0; i < n; i++) {
				sc.nextLine();
				System.out.print("Digite um numero:");
				int numero = sc.nextInt();
				vect[i] = new Número(numero);
			}
			System.out.println("NUMEROS NEGATIVOS: ");

			for (int i = 0; i < n; i++) {
				if (0 > vect[i].getNum()) {
					System.out.println(vect[i].getNum());
				}
			}

		}

		sc.close();
	}

}
