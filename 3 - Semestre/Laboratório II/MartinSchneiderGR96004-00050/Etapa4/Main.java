package Etapa4;

import java.util.Random;

public class Main {
	
	public static void main(String [] args) {
		
		System.out.println("Linked Stack:");
		
		Stack<Integer> s = new LinkedStack<Integer>();
		
		System.out.println("Está vazia: "+s.isEmpty());
		
		Random r = new Random();
		
		System.out.println("Elementos Pilha:");
		
		for(int i=0; i<(r.nextInt(50)+3); i++) {
			
			int elemento = r.nextInt(10000);
			
			System.out.println(elemento);
			s.push(elemento);
			
		}
		
		System.out.println("Número elementos: "+s.numElements());
		
		System.out.println("Elemento topo: "+s.top());
		
		System.out.println("Retira topo: "+s.pop());
		System.out.println("Retira topo: "+s.pop());
		System.out.println("Retira topo: "+s.pop());
		
		System.out.println("Elemento topo: "+s.top());
		
		System.out.println("Está vazia: "+s.isEmpty());
		
		System.out.println("Fim Linked Stack.");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("Começo Linked Queue:");
		
		Queue<Integer> q = new LinkedQueue<Integer>();
		
		System.out.println("Está vazia: "+q.isEmpty());
		
		System.out.println("Elementos Fila:");
		
		for(int i=0; i<(r.nextInt(50)+3); i++) {
			
			int elemento = r.nextInt(10000);
			
			System.out.println(elemento);
			
			q.enqueue(elemento);
			
		}
		
		System.out.println("Número elementos: "+q.numElements());
		
		System.out.println("Elemento front: "+q.front());
		System.out.println("Elemento back: "+q.back());
		
		System.out.println("Retira: "+q.dequeue());
		System.out.println("Retira: "+q.dequeue());
		System.out.println("Retira: "+q.dequeue());
		
		System.out.println("Elemento front: "+q.front());
		System.out.println("Elemento back: "+q.back());
		
		System.out.println("Está vazia: "+q.isEmpty());
		
		System.out.println("Fim Linked Queue.");
		
	}

}
