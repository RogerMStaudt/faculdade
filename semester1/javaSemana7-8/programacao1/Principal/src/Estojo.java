public class Estojo {
    private Cor corEstojo;
    private Caneta caneta1;
    private Caneta caneta2;

    public Estojo(Cor corEstojo, Caneta caneta1, Caneta caneta2) {
        this.corEstojo = corEstojo;
        this.caneta1 = caneta1;
        this.caneta2 = caneta2;
    }

    public void SetCorEstojo(Cor corEstojo) {
        this.corEstojo = corEstojo;
    }

    public Cor EstojoCor() {
        return corEstojo;
    }

    public void SetCaneta1(Caneta caneta1) {
        this.caneta1 = caneta1;
    }

    public Caneta EstojoCaneta1() {
        return caneta1;
    }

    public void SetCaneta2(Caneta caneta2) {
        this.caneta2 = caneta2;
    }

    public Caneta EstojoCaneta2() {
        return caneta2;
    }
}
