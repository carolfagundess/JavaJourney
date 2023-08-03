import java.util.Scanner;

public class InvertidoNome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        String nomeInvertido = inverterNome(nome);
        System.out.println("Nome invertido: " + nomeInvertido);
        
        scanner.close();

    }

    public static String inverterNome(String nome) {
        return new StringBuilder(nome).reverse().toString();
    }
}
