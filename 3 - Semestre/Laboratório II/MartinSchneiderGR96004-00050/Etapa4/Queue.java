package Etapa4;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public interface Queue<E> {
	
	public int numElements();
	public boolean isEmpty();
	public boolean isFull();
	public E front() throws BufferUnderflowException;
	public E back() throws BufferUnderflowException;
	public void enqueue(E element) throws BufferOverflowException;
	public E dequeue() throws BufferUnderflowException;

}
