import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Labirinto {
    private static final char PAREDE          = 'X';
    private static final char CAMINHO_ABERTO  = ' ';
    private static final char SAIDA           = 'D';
    private static final char CAMINHO_SOLUCAO = '#';
 
    private char[][] labirinto;

    public void criaLabirinto(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            List<char[]> linhas = new ArrayList<>();
 
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha.toCharArray());
            }
            reader.close();
 
            int totalLinhas = linhas.size();
            int totalColunas = 0;
            for (char[] l : linhas) {
                if (l.length > totalColunas) {
                    totalColunas = l.length;
                }
            }
 
            labirinto = new char[totalLinhas][totalColunas];
 
            for (int i = 0; i < totalLinhas; i++) {
                char[] lAtual = linhas.get(i);
                for (int j = 0; j < totalColunas; j++) {
                    if (j < lAtual.length) {
                        labirinto[i][j] = lAtual[j];
                    } else {
                        // Preenche com CAMINHO_ABERTO quando a linha é mais curta
                        labirinto[i][j] = CAMINHO_ABERTO;
                    }
                }
            }
 
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo do labirinto: " + e.getMessage());
            labirinto = new char[0][0];
        }
    }
 
    public boolean percorreLabirinto() {
        return resolverLabirinto(0, 0);
    }
 
    public void imprimeLabirinto() {
        if (labirinto == null || labirinto.length == 0) {
            System.out.println("Labirinto não carregado.");
            return;
        }
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {
                System.out.print(labirinto[i][j]);
            }
            System.out.println();
        }
    }

    private boolean resolverLabirinto(int x, int y) {
        if (x < 0 || x >= labirinto.length || y < 0 || y >= labirinto[x].length) {
            return false;
        }
 
        char posicaoAtual = labirinto[x][y];
 
        if (posicaoAtual == PAREDE || posicaoAtual == CAMINHO_SOLUCAO) {
            return false;
        }
 
        if (posicaoAtual == SAIDA) {
            return true;
        }
 
        labirinto[x][y] = CAMINHO_SOLUCAO;
 
        if (resolverLabirinto(x + 1, y)) return true;
        if (resolverLabirinto(x - 1, y)) return true;
        if (resolverLabirinto(x, y + 1)) return true;
        if (resolverLabirinto(x, y - 1)) return true;
 
        labirinto[x][y] = CAMINHO_ABERTO;
 
        return false;
    }
}
