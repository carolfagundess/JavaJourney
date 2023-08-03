import java.util.Random;

public class VetorInverso {
    public static void main(String[] args) {
        int tamanho = 15;
        int[] vetor = new int[tamanho];

        // Preenche o vetor com números aleatórios
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99
        }

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        System.out.println("\nVetor em ordem inversa:");
        imprimirVetorInverso(vetor);
    }

    // Imprime o vetor na tela
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // Imprime o vetor na ordem inversa
    public static void imprimirVetorInverso(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
