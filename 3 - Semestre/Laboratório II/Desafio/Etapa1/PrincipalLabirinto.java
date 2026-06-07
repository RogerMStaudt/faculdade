public class PrincipalLabirinto {
 
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
 

        labirinto.criaLabirinto("labirinto.txt");
 

        boolean solucaoEncontrada = labirinto.percorreLabirinto();

        if (solucaoEncontrada) {
            System.out.println("Solução encontrada!");
        } else {
            System.out.println("Solução não encontrada.");
        }
 
        labirinto.imprimeLabirinto();

        ValidadorEtapa1EstudanteMRK.validaClasse("Labirinto");
    }
}
