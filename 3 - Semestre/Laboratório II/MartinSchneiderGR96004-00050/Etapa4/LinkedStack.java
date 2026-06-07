package Etapa4;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class LinkedStack<E> implements Stack<E> {
	
	Node<E> topo;
	int numElements = 0;
	
	@Override
	public int numElements() {
		
		return numElements;
		
	}

	@Override
	public boolean isEmpty() {
		
		if(topo == null) {
			
			return true;
			
		}
		
		return false;
		
	}

	@Override
	public boolean isFull() {
		
		return false;
		
	}

	@Override
	public E top() throws BufferUnderflowException {
		
		if(isEmpty()) {
			
			throw new BufferUnderflowException();
			
		}
		
		return topo.element;
		
	}

	@Override
	public void push(E element){
		
		try {
			
			Node<E> n = new Node<E>(element);
	        n.next = topo;
	        topo = n;
	        numElements++;
			
		}
		catch(BufferOverflowException e) {
			
			System.out.println("Overflow!");
			
		}
		
	}

	@Override
	public E pop() throws BufferUnderflowException {
		
		if(isEmpty()) {
			
            throw new BufferUnderflowException();
            
        }
		
        E elementTopo = topo.element;
        topo = topo.next;
        numElements--;
        
        return elementTopo;
		
	}

}
