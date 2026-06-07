package Etapa4;

import java.nio.BufferUnderflowException;

public interface Stack<E> {
	
	public int numElements();
	public boolean isEmpty();
	public boolean isFull();
	public E top() throws BufferUnderflowException;
	public void push (E element);
	public E pop() throws BufferUnderflowException;

}
