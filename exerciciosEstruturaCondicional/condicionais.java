package exerciciosEstruturaCondicional;
import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int x = sc.nextInt();
		
		if (x>0) {
			System.out.println("POSITIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}
}
