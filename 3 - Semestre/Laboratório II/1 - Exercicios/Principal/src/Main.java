import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
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
        Random random = new Random();

        int linhas = Teclado.leInt("Digite o número de linhas da matriz: ");
        int colunas = Teclado.leInt("Digite o número de colunas da matriz: ");

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
                
            }
        }

        return matriz;
    }

    public static double[][] exercicio3() {
        double[][] matriz = new double[2][5];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Teclado.leDouble("Digite um número: ");
            }
        }

        return matriz;
    }

    public static int exercicio4e5(double[][] lista) {
        int qtdElementos = 0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                qtdElementos++;
            }
        }

        return qtdElementos;
    }

    public static String exercicio6(double[][] lista) {
        String tabela = "";

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (j == lista[i].length - 1) {
                    tabela += lista[i][j] + "/n";
                } else {
                    tabela += lista[i][j] + " - ";
                }
            }
        }

        return tabela;
    }

    public static Double exercicio7(double[][] lista) {
        Double maiorValor = 0.0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j] > maiorValor) {
                    maiorValor = lista[i][j];
                }
            }
        }

        return maiorValor;
    }

    public static int exercicio8(int[][] lista) {
        int soma = 0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                soma += lista[i][j];
            }
        }

        return soma;
    }

    public static int exercicio9(int[][] lista) {
        int soma = 0;
        int qtdElementos = 0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                soma += lista[i][j];

                qtdElementos++;
            }
        }

        return soma / qtdElementos;
    }

    public static char[][] exercicio10() {
        Random random = new Random();

        int linhas = random.nextInt(5);
        int colunas = random.nextInt(3);

        char[][] matriz = new char[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Teclado.leChar("Digite um caracter: ");
            }
        }

        return matriz;
    }
}