package Etapa2;

public class Candidato {
	
	String nome, partido;
	int intencoesVotos;
	
	public Candidato(String nome, String partido, int intencoesVotos) {
		
		this.nome = nome;
		this.partido = partido;
		this.intencoesVotos = intencoesVotos;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setPartido(String partido) {
		
		this.partido = partido;
		
	}
	
	public String getPartido() {
		
		return partido;
		
	}
	
	public void setIntencoesVotos(int intencoesVotos) {
		
		this.intencoesVotos = intencoesVotos;
		
	}
	
	public int getIntencoesVotos() {
		
		return intencoesVotos;
		
	}
	
	public String toString(){
        
        return "O(A) candidato(a) "+nome+" é do partido "+partido+" e possui "+intencoesVotos+" intenções de votos.";
        
    }

}
