public class Melancia extends Fruta {
    private Double precoAdicional;
    private Boolean epocaBoaParaMelancia;

    public Melancia(String nome, double preco, Double precoAdicional, Boolean epocaBoaParaMelancia) {
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.epocaBoaParaMelancia = epocaBoaParaMelancia;
    }

    public Double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(Double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    public Boolean getEpocaBoaParaMelancia() {
        return epocaBoaParaMelancia;
    }

    public void setEpocaBoaParaMelancia(Boolean epocaBoaParaMelancia) {
        this.epocaBoaParaMelancia = epocaBoaParaMelancia;
    }

    public Double calcularPrecoFinal() {
        if (epocaBoaParaMelancia) {
            return super.getPreco();
        } else {
            return super.getPreco() + precoAdicional;
        }
    }
}
