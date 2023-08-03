import java.util.Locale;
import java.util.Scanner;

public class calcula_salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual seu número: ");
		int number = sc.nextInt();
		System.out.print("Quantas horas trabalhadas: ");
		int hours = sc.nextInt();
		System.out.print("Quanto recebe por hora: ");
		double valor = sc.nextDouble();
		
		double salario = hours*valor;
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = $ %.2f%n", salario);
		
		sc.close();

	}
}
