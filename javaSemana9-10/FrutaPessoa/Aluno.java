public class Aluno extends Pessoa{
    private int nota;

    public Aluno(String nome, int idade, int nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
}
