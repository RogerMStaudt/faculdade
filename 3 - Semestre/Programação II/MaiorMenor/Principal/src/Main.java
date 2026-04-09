import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int qtdNumeros = Teclado.leInt("Escreva a quantidade de números para a lista: ");
        int ultimoNumero = 0;
        int menor = 0;
        int maior = 0;

        for (int i = 0; i < qtdNumeros; i++) {
            int numero = Teclado.leInt("Escreva um número: ");
            
            if (maior == 0) {
                
            } else {

            }
            
            if (numero >= ultimoNumero) {
                maior = numero;
            } else {
                menor = numero;
            }

            ultimoNumero = numero;
        }

        System.out.println ("O menor número é: " + menor );
        System.out.println ("O maior número é: " + maior );

    }
}