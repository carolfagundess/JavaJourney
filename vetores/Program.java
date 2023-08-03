package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int numero[]= new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextInt();
		}
		System.out.println("\nNUMEROS PARES: ");
		System.out.println();
		int pares = 0;
		for(int i=0; i<n; i++) {
			if (numero[i]%2 == 0) {
				pares += 1;
				System.out.print(" " + numero[i] + " ");
			}
		}
		
		System.out.printf("\n\nQUANTIDADES DE PARES = %d\n", pares);
	
		
		sc.close();
	}
}
