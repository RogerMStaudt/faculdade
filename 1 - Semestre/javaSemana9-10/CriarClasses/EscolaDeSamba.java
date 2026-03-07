package CriarClasses;

public class EscolaDeSamba {
    private String nome;
    private char grupo;
    private String dataDeCriacao;
    private String sambaEnredo;
    private int vezesCampea;
    public String carnavalesco;
    private int quantidadeAlas;

    public EscolaDeSamba(String nome, char grupo, String dataDeCriacao, String sambaEnredo, int vezesCampea, String carnavalesco, int quantidadeAlas) {
        this.nome = nome;
        this.grupo = grupo;
        this.dataDeCriacao = dataDeCriacao;
        this.sambaEnredo = sambaEnredo;
        this.vezesCampea = vezesCampea;
        this.carnavalesco = carnavalesco;
        this.quantidadeAlas = quantidadeAlas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getSambaEnredo() {
        return sambaEnredo;
    }

    public void setSambaEnredo(String sambaEnredo) {
        this.sambaEnredo = sambaEnredo;
    }

    public int getVezesCampea() {
        return vezesCampea;
    }

    public void setVezesCampea(int vezesCampea) {
        this.vezesCampea = vezesCampea;
    }

    public String getCarnavalesco() {
        return carnavalesco;
    }

    public void setCarnavalesco(String carnavalesco) {
        this.carnavalesco = carnavalesco;
    }

    public int getQuantidadeAlas() {
        return quantidadeAlas;
    }

    public void setQuantidadeAlas(int quantidadeAlas) {
        this.quantidadeAlas = quantidadeAlas;
    }
}
