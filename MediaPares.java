package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int numero[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			numero[i] = sc.nextInt();
		}
		int soma = 0;
		int somaPares = 0;
		for(int i=0; i<n; i++) {
			if(numero[i]%2==0) {
				soma += 1;
				somaPares += numero[i];
			} 
		}
		
		double mediaPares = soma/somaPares;
		
		if(mediaPares!=0) {
			System.out.printf("MEDIA DOS PARES = %.2f%n", mediaPares);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}	
}
