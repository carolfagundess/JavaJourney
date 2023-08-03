import java.util.Scanner;

public class exercicio_soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x; 
		x = sc.nextInt();
		int y;
		y = sc.nextInt();
		int soma = x + y;
		System.out.println("SOMA: " + soma);
		
		sc.close();
	}
}
