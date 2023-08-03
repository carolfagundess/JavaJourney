public class MatrizSomaLinhaColuna {
    public static void main(String[] args) {
        int tamanho = 8;
        int[][] matriz = new int[tamanho][tamanho];

        // Preenche a matriz com a soma da linha e coluna correspondente
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = i + j;
            }
        }

        // Imprime a matriz formatada na tela
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
