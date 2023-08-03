ackage exerciciosEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class caixa_pedido {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int hotDog = 1;
		int xisSalada = 2;
		int xisBacon = 3;
		int torrada = 4;
		int refri = 5;
		
		//x= pedido y=quantidade
		System.out.print("Codigo: ");
		int x = sc.nextInt();
		System.out.print("Quantidade: ");
		int y = sc.nextInt();
		
		if (x==1) {
			double pedido = y*4.00;
			System.out.println("Pedido: Cachorro quente ");
			System.out.println("Total: R$ " + pedido);
		} else if (x==2) {
				double pedido = y*4.50;
				System.out.println("Pedido: X-salada ");
				System.out.println("Total: R$ " + pedido);
			} else if(x==3) {
					double pedido = y*5.00;
					System.out.println("Pedido: X-Bacon ");
					System.out.println("Total: R$ " + pedido);
				}
				else if(x==4) {
						double pedido = y*2.00;
						System.out.println("Pedido: Torrada ");
						System.out.println("Total: R$ " + pedido);
					}
					else if(x==5) {
							double pedido = y*1.50;
							System.out.println("Pedido: Refrigerante ");
							System.out.println("Total: R$ " + pedido);
						}
						else {
							System.out.println("PEDIDO NAO REALIZADO");
						}
						
						sc.close();
	}
}
