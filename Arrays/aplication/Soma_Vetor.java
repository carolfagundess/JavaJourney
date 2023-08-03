package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numeros_Reais;


public class Soma_Vetor {

	public static void Soma_Vetor(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n =sc.nextInt();
		Numeros_Reais[] vect = new Numeros_Reais[n];
		
		for(int i=0; i<n;i++) {
			System.out.print("Digite um numero: ");
			double numero = sc.nextDouble();
			vect[i] = new Numeros_Reais(numero);
		}
		System.out.print("VALORES = ");
		for(int i=0; i<n; i++) {
				 System.out.print(vect[i].getNumerosReais());
				 System.out.print("  ");
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum+=vect[i].getNumerosReais();
	}
		System.out.println();
		 System.out.println("SOMA = "+sum);

		double media = 0;
			media=sum/n;
		 System.out.println("MEDIA = " + media);

		sc.close();
	}
}
