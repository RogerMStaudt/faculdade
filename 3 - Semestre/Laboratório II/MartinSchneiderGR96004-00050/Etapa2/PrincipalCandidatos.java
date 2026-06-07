package Etapa2;

import java.util.Random;
import java.util.Scanner;

public class PrincipalCandidatos {
	
	public static void main(String args[]) {
	    
		Random r = new Random();
		
		int numeroCandidatos = r.nextInt(100) + 1;
		
		String [] listaNomes = {"Martin", "Karol", "Carina", "Marcio", "Alaire", "Jane", "Luis",
								"Lucas", "Roger", "Gustavo", "Wagner", "Edy", "Marti", "Fernando"};

		String [] listaPartidos = {"MAR", "KAR", "ABC", "CAC", "ZPS", "NBM", "TRP", "ORC", "LHG", "TRE"};
		
		int [] listaIntencoesVotos = new int[50];
		
		for(int i=0; i<listaIntencoesVotos.length; i++) {
			
			listaIntencoesVotos[i] = r.nextInt(1000);
			
		}
		
		Candidato [] c = new Candidato[numeroCandidatos];
		
		for(int i=0; i<numeroCandidatos; i++) {
			
			int nomeAleatorio = r.nextInt(14);
			int partidoAleatorio = r.nextInt(10);
			int intencaoVotoAleatorio = r.nextInt(50);
			
			c[i] = new Candidato(listaNomes[nomeAleatorio], listaPartidos[partidoAleatorio], listaIntencoesVotos[intencaoVotoAleatorio]);
			
		}
		
		ordenaCandidatosPorNome(c);
		ordenaCandidatosPorVotos(c);
		ordenaCandidatosPorPartido(c);
		
		for(int i=0; i<c.length; i++) {
			
			System.out.println(c[i].toString());
			
		}
		
		int posicao = pesquisaBinariaCandidatos(c);
		
		if(posicao != -1) {
			
			System.out.println(c[posicao].toString());
			
		}
		else {
			
			System.out.println("Candidato não encontrado!");
			
		}
		
	}
	
	public static void ordenaCandidatosPorNome(Candidato [] cn) {
		
		int m = 0;
		
		for(int i=1; i<cn.length; i++) {
			
			Candidato arrayAntigo = cn[i];
			
            m = i - 1;
            
            while(m >= 0 && cn[m].getNome().compareTo(arrayAntigo.getNome()) > 0) {
            	
            	cn[m + 1] = cn[m];
                
                m = m - 1;
                
            }
            
            cn[m + 1] = arrayAntigo;
			
		}
		
	}
	
	public static void ordenaCandidatosPorVotos(Candidato [] cv) {
		
		int indiceMin = 0;
		int tamanho = cv.length;
		
	    for(int i=0; i<tamanho - 1; i++) {
	        
	        indiceMin = i;
	        
	        for(int j=i+1; j<tamanho && cv[j].getNome().compareTo(cv[i].getNome()) == 0 ; j++) {
	        	
	            if(cv[j].getIntencoesVotos() < cv[indiceMin].getIntencoesVotos()) {
	            	
	                indiceMin = j;
	                
	            }
	            
	        }
	        
	        if(indiceMin != i) {
	        	
	        	Candidato arrayAntigo = cv[indiceMin];
	            cv[indiceMin] = cv[i];
	            cv[i]= arrayAntigo;
	            
	        }
	        
	    }
		
	}

	public static void ordenaCandidatosPorPartido(Candidato [] cp) {
		
		int indiceMin = 0;
		int tamanho = cp.length;
		
	    for(int i=0; i<tamanho - 1; i++) {
	        
	        indiceMin = i;
	        
	        for(int j=i+1; j<tamanho && cp[j].getNome().compareTo(cp[i].getNome()) == 0 && cp[j].getIntencoesVotos() == cp[i].getIntencoesVotos(); j++) {
	        	
	            if(cp[j].getPartido().compareTo(cp[indiceMin].getPartido()) < 0) {
	            	
	                indiceMin = j;
	                
	            }
	            
	        }
	        
	        if(indiceMin != i) {
	        	
	        	Candidato arrayAntigo = cp[indiceMin];
	        	cp[indiceMin] = cp[i];
	            cp[i]= arrayAntigo;
	            
	        }
	        
	    }
		
	}
	
	public static int pesquisaBinariaCandidatos(Candidato [] cb) {
		
		String nomePesquisado;
		int inicio = 0;
		int meio = 0;
        int fim = cb.length - 1;
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o nome do candidato que será pesquisado: ");
        
        nomePesquisado = scanner.nextLine();
		
        while (inicio <= fim) {
        	
            meio = inicio + (fim - inicio) / 2;
            
            if(cb[meio].getNome().equals(nomePesquisado)) {
            	
                return meio;
                
            }
            if(cb[meio].getNome().compareTo(nomePesquisado) < 0) {
            	
                inicio = meio + 1;
                
            }
            else {
            	
                fim = meio - 1;
                
            }
            
        }
        
		return -1;
		
	}

}
