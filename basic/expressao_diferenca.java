import java.util.Scanner;

public class expressao_diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A,B,C,D, X;
		
		System.out.print("Valor de A: ");
		A = sc.nextInt();
		System.out.print("Valor de B: ");
		B = sc.nextInt();
		System.out.print("Valor de C: ");
		C = sc.nextInt();
		System.out.print("Valor de D: ");
		D = sc.nextInt();
		
		X = (A * B - C * D);
		System.out.println("A difereça entre o produto de A e B pelo produto de C e D é: " + X);
		sc.close();
	}

}
