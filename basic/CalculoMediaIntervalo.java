import java.util.Arrays;
import java.util.Random;

public class CalculoMediaIntervalo {

    public static void main(String[] args) {
        int[] numeros = gerarNumeros(1000);
        double media = calcularMedia(numeros);
        exibirNumerosNoIntervalo(numeros, media, 0.15);
    }

    public static int[] gerarNumeros(int quantidade) {
        Random random = new Random();
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = random.nextInt(100);
        }
        return numeros;
    }

    public static double calcularMedia(int[] numeros) {
        return Arrays.stream(numeros)
                .average()
                .orElse(0.0);
    }

    public static void exibirNumerosNoIntervalo(int[] numeros, double media, double percentual) {
        double limiteInferior = media - (media * percentual);
        double limiteSuperior = media + (media * percentual);

        System.out.println("Números no intervalo de " + (percentual * 100) + "% abaixo até " + (percentual * 100) + "% acima da média:");

        for (int numero : numeros) {
            if (numero >= limiteInferior && numero <= limiteSuperior) {
                System.out.println(numero);
            }
        }
    }
}
