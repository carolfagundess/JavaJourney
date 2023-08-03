import java.util.Locale;
import java.util.Scanner;

public class ponto_flutuante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Valor de A: ");
		float A = sc.nextFloat();
		System.out.print("Valor de B: ");
		float B = sc.nextFloat();
		System.out.print("Valor de C: ");
		float C = sc.nextFloat();
		
		double areaTI = (A * C)/2;
		double areaC = (C*C*3.14159);
		double areaTR = (A + B)/2.0*C;
		double areaQD = B*B;
		double areaRT = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTI);
		System.out.printf("CIRCULO: %.3f%n", areaC);
		System.out.printf("TRAPEZIO: %.3f%n", areaTR);
		System.out.printf("QUADRADO: %.3f%n", areaQD);
		System.out.printf("RETANGULO: %.3f%n", areaRT);
		
		sc.close();
	}
}
