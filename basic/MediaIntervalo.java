import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MediaIntervalo {
    public static void main(String[] args) {
        // Criar uma lista para armazenar os números
        List<Integer> numeros = new ArrayList<>();

        // Gerar aleatoriamente os 1000 números inteiros
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(1000); // Gera números de 0 a 999
            numeros.add(numero);
        }

        // Calcular a média dos números
        double soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.size();

        // Calcular os limites do intervalo
        double limiteInferior = media * 0.85;
        double limiteSuperior = media * 1.15;

        // Exibir os números dentro do intervalo
        System.out.println("Números dentro do intervalo:");
        for (int numero : numeros) {
            if (numero >= limiteInferior && numero <= limiteSuperior) {
                System.out.println(numero);
            }
        }
    }
}

