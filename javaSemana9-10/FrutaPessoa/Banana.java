public class Banana extends Fruta{
    private String tipoBanana;

    public Banana(String nome, double preco, String tipoBanana) {
        super(nome, preco);
        this.tipoBanana = tipoBanana;
    }

    public String getTipoBanana() {
        return tipoBanana;
    }

    public void setTipoBanana(String tipoBanana) {
        this.tipoBanana = tipoBanana;
    }
}
