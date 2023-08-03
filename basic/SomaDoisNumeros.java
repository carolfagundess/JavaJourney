public class SomaDoisNumeros
{
  public static void main (String [] args)
  {
   //*Delcara e preenche as variaveis. */
   int x = Entrada.leiaInt("Digite um numero: ");
   int y = Entrada.leiaInt("Digite outro numero: "); 
   
   //*Imprime os dados. */
   System.out.printlm("A soma destes numeros é:"+ (x+y));
   System.out.printlm("A subtração destes numeros é:"+ (x-y));
   System.out.printlm("A multiplicação destes numeros é:"+ (x*y));
   System.out.printlm("A divisão destes numeros é:"+ (x/y));
  }
}
