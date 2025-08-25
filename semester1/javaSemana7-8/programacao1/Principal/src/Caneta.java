public class Caneta {
    private String marca;
    private Cor corCaneta;

    public Caneta(String marca, Cor corCaneta) {
        this.marca = marca;
        this.corCaneta = corCaneta;
    }

    public void setCor(Cor corCaneta) {
        this.corCaneta = corCaneta;
    }

    public Cor getCor() {
        return corCaneta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
