import java.util.Locale;
import java.util.Scanner;

public class valor_pecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual o codigo da peca: ");
		int codigoUm = sc.nextInt();
		System.out.print("Qual o número de pecas: ");
		int qntdUm = sc.nextInt();
		System.out.print("Qual o valor unitario da peca: ");
		double valueUm = sc.nextDouble();
		
		double ValorUm = qntdUm * valueUm;
		
		System.out.print("Qual o codigo da peca: ");
		int codigoDois = sc.nextInt();
		System.out.print("Qual o número de pecas: ");
		int qntdDois = sc.nextInt();
		System.out.print("Qual o valor unitario da peca: ");
		double valueDois = sc.nextDouble();
		
		double ValorDois = qntdDois * valueDois;
		double ValorFinal = ValorUm + ValorDois;
		
		System.out.printf("PRODUTOS: %d e %d%n", codigoUm, codigoDois);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", ValorFinal);
		
		sc.close();
	}
}
