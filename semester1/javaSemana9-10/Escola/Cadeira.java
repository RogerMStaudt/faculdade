package Escola;

public class Cadeira {
    private Cor cor;
    private Aluno aluno;

    public Cadeira(Cor cor) {
        this.cor = cor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String toString() {
        return "Cor: " + cor + "\nAluno: " + aluno;
    }
}
