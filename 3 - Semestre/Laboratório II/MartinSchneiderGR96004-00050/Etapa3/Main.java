package Etapa3;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String expressao;
		
		List<Integer> lista = new StaticList<Integer>(20);
	
		for(int i=0; i<20; i++) {
			
			int[] n = {1, 2, 3, 4, 5};
			
			Random r = new Random();
			
			lista.insert(n[r.nextInt(5)], i);
			
		}
		
		System.out.println("Lista apos insercoes: ");
		System.out.println(lista);
		
		System.out.println(lista.remove(5)+" foi removido da lista!");
		
		System.out.println("\nLista apos remocao do elemento na posicao 5: ");
		System.out.println(lista.toString());
		
		System.out.println("\nQuantidade de vezes elemento 5: "+lista.contaElementos(5));
		
		Etapa3 e = new Etapa3();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nDigite a expressão matemática: ");
        
        expressao = scanner.nextLine();
        
        Stack<Character> stack = e.converteStringStack(expressao);
        
        System.out.println("\nA expressão matemática "+expressao+" é "+e.checkBrackets(stack));
		
	}

}
