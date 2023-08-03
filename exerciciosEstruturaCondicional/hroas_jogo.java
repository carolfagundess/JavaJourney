package exerciciosEstruturaCondicional;
import java.util.Scanner;

public class hroas_jogo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.print("HORA INICIAL: ");	
	int horainicial = sc.nextInt();
	
	System.out.print("HORA FINAL: ");	
	int horafinal = sc.nextInt();	
	
	int duracao;
	if (horainicial < horafinal) {
		duracao = horafinal - horainicial;
	}
	else {
		duracao = 24 - horainicial + horafinal;
	}
	
	System.out.println("O jogo durou " + duracao + " HORA(S)");
	
	}
}
