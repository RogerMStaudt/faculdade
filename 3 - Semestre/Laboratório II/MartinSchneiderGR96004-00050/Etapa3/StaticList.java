package Etapa3;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class StaticList<E> implements List<E> {
	
	protected E[] elements;
	int numElements;
	
	public StaticList(int maxSize) {
		
		elements = (E[]) new Object[maxSize];
		numElements = 0;
		
	}
	
	@Override
	public int numElements() {
		
		return numElements;
		
	}

	@Override
	public boolean isEmpty() {
		
		return numElements == 0;
		
	}

	@Override
	public boolean isFull() {
		
		return numElements == elements.length;
		
	}

	@Override
	public void insert(E element, int pos) throws BufferOverflowException {
		
		if(isFull()) {
			
			throw new BufferOverflowException();
			
		}
		
		if(pos < 0 || pos > numElements) {
			
			throw new IndexOutOfBoundsException();
			
		}
		
		for(int i=numElements-1; i>=pos; i--) {
			
			elements[i+1] = elements[i];
			
		}
		
		elements[pos] = element;
		numElements++;
		
	}

	@Override
	public E remove(int pos) throws BufferUnderflowException {
		
		E removedElement;
		
		if(isEmpty()) {
			
			throw new BufferUnderflowException();
			
		}
		
		if(pos < 0 || pos >= numElements) {
			
			throw new IndexOutOfBoundsException();
			
		}
		
		removedElement = elements[pos];
		
		for(int k=pos; k<numElements-1; k++) {
			
			elements[k] = elements[k+1];
			
		}
		
		elements[numElements-1] = null;
		numElements--;
		
		return removedElement;
		
	}

	@Override
	public E get(int pos) throws IndexOutOfBoundsException {
		
		if(pos < 0 || pos >= numElements) {
			
			throw new IndexOutOfBoundsException();
			
		}
		
		return elements[pos];
		
	}

	@Override
	public int search(E element) {
		
		for(int i=0; i<numElements; i++) {
			
			if(element.equals(elements[i])) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	@Override
	public int contaElementos(E el)  {
		
		if(isEmpty()) {
			
			return 0;
			
		}
		
		return contaElementos(numElements - 1, el);
		
	}
	
	private int contaElementos(int index, E el) {
		
		if(index == -1) {
			
			return 0;
			
		}
		
		if(elements[index].equals(el)) {
			
			return 1 + contaElementos(index - 1, el);
			
		}
		else {
			
			return contaElementos(index - 1, el);
			
		}
		
	}
	
	@Override
	public String toString() {
		
		String s = "";
		
		for(int i=0; i<numElements; i++) {
			
			s += elements[i] + " ";
			
		}
		
		return s;
		
	}

}
