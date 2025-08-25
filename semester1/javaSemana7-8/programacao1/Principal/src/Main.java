public class Main {
    public static void main(String[] args) {

        Cor corEstojo = new Cor(Teclado.leInt("R:"), Teclado.leInt("G:"), Teclado.leInt("B:"));
        Cor corCaneta1 = new Cor(Teclado.leInt("R:"), Teclado.leInt("G:"), Teclado.leInt("B:"));
        Caneta caneta1 = new Caneta(Teclado.leString("Marca da caneta 1:"), corCaneta1);
        Cor corCaneta2 = new Cor(Teclado.leInt("R:"), Teclado.leInt("G:"), Teclado.leInt("B:"));
        Caneta caneta2 = new Caneta(Teclado.leString("Marca da centa 2:"), corCaneta2);
        Estojo e = new Estojo(corEstojo, caneta1, caneta2);
    }
}