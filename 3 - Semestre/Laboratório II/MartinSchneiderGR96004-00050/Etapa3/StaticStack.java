package Etapa3;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class StaticStack<E> implements Stack<E> {
	
	protected int top;
	
	protected E elements[];
	
	public StaticStack(int maxSize) {
		
		elements = (E[]) new Object[maxSize];
		
		top = -1;
		
	}
	
	@Override
	public int numElements() {
		
		return top + 1;
		
	}

	@Override
	public boolean isEmpty() {
		
		if(top == -1) {
			
			return true;
			
		}
		
		return false;
		
	}

	@Override
	public boolean isFull() {
		
		if(top == elements.length-1) {
			
			return true;
			
		}
		
		return false;
		
	}

	@Override
	public E top() throws BufferUnderflowException {
		
		if(isEmpty()) {
			
			throw new BufferUnderflowException();
			
		}
		
		return elements[top];
		
	}

	@Override
	public void push(E element) throws BufferOverflowException {
		
		if(isFull()) {
			
			throw new BufferOverflowException();
			
		}
		
		top++;
		
		elements[top] = element;
		
	}

	@Override
	public E pop() throws BufferUnderflowException {
		
		if(isEmpty()) {
			
			throw new BufferUnderflowException();
			
		}
		
		E c = elements[top];
		
		elements[top] = null;
		
		top--;
		
		return c;
		
	}

}
