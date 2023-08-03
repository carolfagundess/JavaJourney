package exerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um número inteiro: ");
        int N = sc.nextInt();
        int in = 0;
        int out = 0;
        
        for (int i = 0; i < N; i++) 
        {
           int y = sc.nextInt();
           
           if (y>=10 && y<=20) 
           {
        	   in = in+1;
           } else 
           {
        	  out = out+15;
           }
        }
        System.out.println("in: " + in);
        System.out.println("out: " + out);
		sc.close();		
	}

}
