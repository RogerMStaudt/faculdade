public class Programador extends Pessoa{
    private String linguagemProgramacaoFavorita;

    public Programador(String nome, int idade, String linguagemProgramacaoFavorita) {
        super(nome, idade);
        this.linguagemProgramacaoFavorita = linguagemProgramacaoFavorita;
    }

    public String getLinguagemProgramacaoFavorita() {
        return linguagemProgramacaoFavorita;
    }

    public void setLinguagemProgramacaoFavorita(String linguagemProgramacaoFavorita) {
        this.linguagemProgramacaoFavorita = linguagemProgramacaoFavorita;
    }
}
