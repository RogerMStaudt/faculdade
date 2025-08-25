package FrutaPessoa;

public class main {
    public static void main(String[] args) {
        Melancia melancia = new Melancia("Melancia", 20.5, 5.0, false);

        Pessoa pessoa = new Pessoa("Miguel", 20);

        Programador programador = new Programador("Roger", 20, "Java");

        System.out.println(melancia.calcularPrecoFinal());

        int numeroDigitado = Teclado.leInt("Digite 1 ou 2:");

        if (numeroDigitado == 1) {
            Pessoa p = new Programador("Matheus", 20, "Java");
            p.imprimeDados();
        } else {
            Pessoa p = new Aluno("Maria", 20, 10);
            p.imprimeDados();
        }
    }
}
