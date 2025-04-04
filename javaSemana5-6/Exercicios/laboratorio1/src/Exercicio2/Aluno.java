package Exercicio2;

public class Aluno {
    private String aluno;
    private int matricula;
    private double notaGrauA;
    private double notaGrauB;

    public double calculaMediaFinal() {
        return (this.notaGrauA * 0.33) + (this.notaGrauB * 0.67);
    }

    public void imprimeInfoAluno() {
        System.out.println("Aluno: " + this.aluno);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota Grau A: " + this.notaGrauA);
        System.out.println("Nota Grau B: " + this.notaGrauB);
        System.out.println("Media Final: " + this.calculaMediaFinal());
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNotaGrauA(double notaGrauA) {
        this.notaGrauA = notaGrauA;
    }

    public void setNotaGrauB(double notaGrauB) {
        this.notaGrauB = notaGrauB;
    }

    public String getAluno() {
        return aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNotaGrauA() {
        return notaGrauA;
    }

    public double getNotaGrauB() {
        return notaGrauB;
    }

    public Aluno(String aluno, int matricula, double notaGrauA, double notaGrauB) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.notaGrauA = notaGrauA;
        this.notaGrauB = notaGrauB;
    }
}
