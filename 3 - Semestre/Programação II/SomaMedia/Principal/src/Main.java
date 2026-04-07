import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        int qtdNumeros = Teclado.leInt("Escreva a quantidade de números para a conta: ");
        int somaTotal  = 0;
        int media      = 0;

        for (int i = 0; i < qtdNumeros; i++) {
            int numero = Teclado.leInt("Escreva um número: ");

            somaTotal += numero;
        }

        media = somaTotal / qtdNumeros;

        System.out.println ("A soma total é: " + somaTotal );
        System.out.println ("A média é: "      + media );

    }
}