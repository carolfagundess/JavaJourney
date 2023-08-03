
public class exemplo 
{

	public static void main(String[] args) 
	{
		
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Multiplicação");
		
		int opcao = Entrada.leiaInt("Escolha a opção: ");
		
		switch (opcao)
		{
		case 1 : metodoAdicao();
		break;
		case 2 : metodoSubtracao();
		break;
		case 3 : metodoDivisao();
		break;
		case 4 : metodoMultiplicao();
		break;
		default : System.out.println("Opção Inválida");
		}
	}
	
	public static void metodoAdicao()
	{
		System.out.println("ADIÇÃO");
		int number1 = Entrada.leiaInt("Digite um número: ");
		int number2 = Entrada.leiaInt("Digite outro número: ");
		System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
	}
	
	public static void metodoSubtracao()
	{
		
	System.out.println("SUBTRAÇÃO");
	int number1 = Entrada.leiaInt("Digite um número: ");
	int number2 = Entrada.leiaInt("Digite outro número: ");
	System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
	}
	
	public static void metodoDivisao()
	{
		
	System.out.println("DIVISÃO");
	int number1 = Entrada.leiaInt("Digite um número: ");
	int number2 = Entrada.leiaInt("Digite outro número: ");
	System.out.println(number1 + "/" + number2 + " = " + (number1/number2));
	}
	public static void metodoMultiplicao()
	{
	System.out.println("MULTIPLICAÇÃO");
	int number1 = Entrada.leiaInt("Digite um número: ");
	int number2 = Entrada.leiaInt("Digite outro número: ");
	System.out.println(number1 + " X " + number2 + " = " + (number1*number2));

	}
}
