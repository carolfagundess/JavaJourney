package exerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class casoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
        	float x = sc.nextFloat();
        	float y = sc.nextFloat();
        	float z = sc.nextFloat();
        	float soma = (x*2 + y*3 +z*5)/(2 + 3 + 5);
            System.out.println(soma);
        }

		
		
		
		
		
		
		
		
		sc.close();		
	}
}
