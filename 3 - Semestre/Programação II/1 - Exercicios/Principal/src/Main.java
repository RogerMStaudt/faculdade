import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Executando Exercício 1a ---");
        
        int[][] resultado1a = exercicio1d();

        System.out.println(Arrays.deepToString(resultado1a));
    }

    public static int[][] exercicio1a() {
        int[][] matriz = new int[3][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j;
            }
        }

        return matriz;
    }

    public static int[][] exercicio1b() {
        int[][] matriz = new int[5][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j * j;
            }
        }

        return matriz;
    }

    public static int[][] exercicio1c() {
        int[][] matriz = new int[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(i);
                matriz[i][j] = i;
            }
        }

        return matriz;
    }

    public static int[][] exercicio1d() {
        int[][] matriz = new int[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = -1;
                } else {
                    matriz[i][j] = -0;
                }
            }
        }

        return matriz;
    }

    public static int[][] exercicio2() {
        int[][] matriz = new int[6][6];

        String linhas = Teclado.leString("Digite o número de linhas da matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = -1;
                } else {
                    matriz[i][j] = -0;
                }
            }
        }

        return matriz;
    }
}