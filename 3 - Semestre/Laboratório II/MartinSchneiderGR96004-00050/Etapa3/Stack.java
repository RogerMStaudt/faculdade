package Etapa3;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public interface Stack<E> {
	
	public int numElements();
	public boolean isEmpty();
	public boolean isFull();
	public E top() throws BufferUnderflowException;
	public void push (E element) throws BufferOverflowException;
	public E pop() throws BufferUnderflowException;

}
