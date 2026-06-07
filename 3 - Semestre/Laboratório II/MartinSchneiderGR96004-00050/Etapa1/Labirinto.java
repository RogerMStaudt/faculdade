package Etapa1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
	
	private char [][] labirinto;
	int contadorLinhas = 0;
	int contadorColunas = 0;
	int espDireitaLinha = 0;
	int espDireitaColuna = 0;
	int espEsquerdaLinha = 0;
	int espEsquerdaColuna = 0;
	int espCimaLinha = 0;
	int espCimaColuna = 0;
	int espBaixoLinha = 0;
	int espBaixoColuna = 0;
	
	public void criaLabirinto(String filename) {
		
		int contador = 0;
		
		File f = new File(filename);
		
		try {
			
			FileReader frc = new FileReader(f);
			BufferedReader bc = new BufferedReader(frc);
			
			String dadoc = bc.readLine();
			
			while(dadoc != null) {
				
				contadorColunas = dadoc.length();
				dadoc = bc.readLine();
				contadorLinhas++;
				
			}
			
			labirinto = new char[contadorLinhas][contadorColunas];
			
			FileReader fr = new FileReader(f);
			BufferedReader b = new BufferedReader(fr);
			String dado = b.readLine();
			
			while(dado != null) {
				
				for(int i=0; i<contadorColunas; i++) {
					
					labirinto[contador][i] = dado.charAt(i);
					
				}
				dado = b.readLine();
				contador++;
				
			}
			
		}
		catch(FileNotFoundException e){
			
			System.out.println("Arquivo "+filename+" não encontrado!");
			
		}
		catch(IOException e) {
			
			System.out.println("Erro na leitura!");
			
		}
		
	}
	
	public boolean percorreLabirinto() throws IllegalArgumentException{
		
		if(labirinto == null) throw new IllegalArgumentException();
		
		return percorreLabirinto(0, 0);
		
	}
	
	private boolean percorreLabirinto(int linha, int coluna){
		
		boolean encontrou = false;
		int somaLinha = 0;
		int subLinha = 0;
		int somaColuna = 0;
		int subColuna = 0;
		int linhaRecursao = 0;
		int colunaRecursao = 0;
		
		if(linha == 0 && coluna == 0 && (labirinto[linha][coluna] == '*' || labirinto[linha][coluna] == 'F')) {
			
			return false;
			
		}
		
		if(labirinto[linha][coluna] == 'D') {
			
			return true;
			
		}
		
		if(linha > (contadorLinhas - 2)) {
			
			somaLinha = 0;
			
		}
		else {
			
			somaLinha = 1;
			
		}
		
		if(linha == 0) {
			
			subLinha = 0;
			
		}
		else {
			
			subLinha = 1;
			
		}
		
		if(coluna > (contadorColunas - 2)) {
			
			somaColuna = 0;
			
		}
		else {
			
			somaColuna = 1;
			
		}
		
		if(coluna == 0) {
			
			subColuna = 0;
			
		}
		else {
			
			subColuna = 1;
			
		}
		
		encontrou = false;
		
		if(labirinto[linha][coluna+somaColuna] == ' ' || labirinto[linha][coluna+somaColuna] == 'D') { //verifica se existe caminho na direita
			
			if(labirinto[linha][coluna+somaColuna] == 'D') {
				
				labirinto[linha][coluna] = '*';
				return percorreLabirinto(linha, coluna+somaColuna);
				
			}
			if(!encontrou) {
				
				encontrou = true;
				espDireitaLinha = linha;
				espDireitaColuna = coluna+somaColuna;
				
			}
			
		}
		if(labirinto[linha+somaLinha][coluna] == ' ' || labirinto[linha+somaLinha][coluna] == 'D') { //verifica se existe caminho para baixo
			
			if(labirinto[linha+somaLinha][coluna] == 'D') {
				
				labirinto[linha][coluna] = '*';
				return percorreLabirinto(linha+somaLinha, coluna);
				
			}
			if(!encontrou) {
				
				encontrou = true;
				espBaixoLinha = linha+somaLinha;
				espBaixoColuna = coluna;
				
			}
			
		}
		if(labirinto[linha][coluna-subColuna] == ' ' || labirinto[linha][coluna-subColuna] == 'D') { //verifica se existe caminho na esquerda
			
			if(labirinto[linha][coluna-subColuna] == 'D') {
				
				labirinto[linha][coluna] = '*';
				return percorreLabirinto(linha, coluna-subColuna);
				
			}
			if(!encontrou) {
				
				encontrou = true;
				espEsquerdaLinha = linha;
				espEsquerdaColuna = coluna-subColuna;
				
			}
			
		}
		if(labirinto[linha-subLinha][coluna] == ' ' || labirinto[linha-subLinha][coluna] == 'D') { //verifica se existe caminho para cima
			
			if(labirinto[linha-subLinha][coluna] == 'D') {
				
				labirinto[linha][coluna] = '*';
				return percorreLabirinto(linha-subLinha, coluna);
				
			}
			
			if(!encontrou) {
				
				encontrou = true;
				espCimaLinha = linha-subLinha;
			    espCimaColuna = coluna;
				
			}
			
		}
		
		if(espDireitaLinha != 0 || espDireitaColuna != 0) {
			
			labirinto[linha][coluna] = '*';
			linhaRecursao = espDireitaLinha;
			colunaRecursao = espDireitaColuna;
			espDireitaLinha = 0;
			espDireitaColuna = 0;
			return percorreLabirinto(linhaRecursao, colunaRecursao);
			
		}
		else if(espBaixoLinha != 0 || espBaixoColuna != 0) {
			
			labirinto[linha][coluna] = '*';
			linhaRecursao = espBaixoLinha;
			colunaRecursao = espBaixoColuna;
			espBaixoLinha = 0;
			espBaixoColuna = 0;
			return percorreLabirinto(linhaRecursao, colunaRecursao);
			
		}
		else if(espEsquerdaLinha != 0 || espEsquerdaColuna != 0) {
			
			labirinto[linha][coluna] = '*';
			linhaRecursao = espEsquerdaLinha;
			colunaRecursao = espEsquerdaColuna;
			espEsquerdaLinha = 0;
			espEsquerdaColuna = 0;
			return percorreLabirinto(linhaRecursao, colunaRecursao);
			
		}
		else if(espCimaLinha != 0 || espCimaColuna != 0) {
			
			labirinto[linha][coluna] = '*';
			linhaRecursao = espCimaLinha;
			colunaRecursao = espCimaColuna;
			espCimaLinha = 0;
			espCimaColuna = 0;
			return percorreLabirinto(linhaRecursao, colunaRecursao);
			
		}
		else {
			
			if(labirinto[linha-subLinha][coluna] == '*') { //verifica se existe caminho para cima
				
				if(!encontrou) {
					
					encontrou = true;
					espCimaLinha = linha-subLinha;
				    espCimaColuna = coluna;
					
				}
				
			}
			if(labirinto[linha][coluna-subColuna] == '*') { //verifica se existe caminho na esquerda
				
				if(!encontrou) {
					
					encontrou = true;
					espEsquerdaLinha = linha;
					espEsquerdaColuna = coluna-subColuna;
					
				}
				
			}
			if(labirinto[linha+somaLinha][coluna] == '*') { //verifica se existe caminho para baixo
				
				if(!encontrou) {
					
					encontrou = true;
					espBaixoLinha = linha+somaLinha;
					espBaixoColuna = coluna;
					
				}
				
			}
			if(labirinto[linha][coluna+somaColuna] == '*') { //verifica se existe caminho na direita
				
				if(!encontrou) {
					
					encontrou = true;
					espDireitaLinha = linha;
					espDireitaColuna = coluna+somaColuna;
					
				}
				
			}
			
			if(espCimaLinha != 0 || espCimaColuna != 0) {
				
				labirinto[linha][coluna] = 'F';
				linhaRecursao = espCimaLinha;
				colunaRecursao = espCimaColuna;
				espCimaLinha = 0;
				espCimaColuna = 0;
				return percorreLabirinto(linhaRecursao, colunaRecursao);
				
			}
			else if(espEsquerdaLinha != 0 || espEsquerdaColuna != 0) {
				
				labirinto[linha][coluna] = 'F';
				linhaRecursao = espEsquerdaLinha;
				colunaRecursao = espEsquerdaColuna;
				espEsquerdaLinha = 0;
				espEsquerdaColuna = 0;
				return percorreLabirinto(linhaRecursao, colunaRecursao);
				
			}
			else if(espBaixoLinha != 0 || espBaixoColuna != 0) {
				
				labirinto[linha][coluna] = 'F';
				linhaRecursao = espBaixoLinha;
				colunaRecursao = espBaixoColuna;
				espBaixoLinha = 0;
				espBaixoColuna = 0;
				return percorreLabirinto(linhaRecursao, colunaRecursao);
				
			}
			else if(espDireitaLinha != 0 || espDireitaColuna != 0) {
				
				labirinto[linha][coluna] = 'F';
				linhaRecursao = espDireitaLinha;
				colunaRecursao = espDireitaColuna;
				espDireitaLinha = 0;
				espDireitaColuna = 0;
				return percorreLabirinto(linhaRecursao, colunaRecursao);
				
			}
			
		}
		
		return false;
		
	}
	
	public static void main(String args[]) {
		
		Labirinto l = new Labirinto();
		
		l.criaLabirinto("labirinto.txt");
		
		System.out.println("Resultado: "+l.percorreLabirinto());
		
		for(int i=0; i<l.contadorLinhas; i++) {
			
			for(int m=0; m<l.contadorColunas; m++) {
				
				System.out.print(l.labirinto[i][m]);
				
			}
			System.out.println();
			
		}
		
	}

}
