package Etapa4;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class LinkedQueue<E> implements Queue<E> {
	
	protected Node<E> first;
	protected Node<E> last;
	int numElements = 0;
	
	public LinkedQueue() {
		
		first = null;
		last = null;
		
	}
	
	@Override
	public int numElements() {
		
		return numElements;
		
	}
	@Override
	public boolean isEmpty() {
		
		if(numElements == 0) {
			
			return true;
			
		}
		
		return false;
		
	}
	@Override
	public boolean isFull() {
		
		return false;
		
	}
	@Override
	public E front() throws BufferUnderflowException {
		
		if(isEmpty()) {
			
			throw new BufferUnderflowException();
			
		}
		
		return first.element;
		
	}
	@Override
	public E back() throws BufferUnderflowException {
		
		if(isEmpty()) {
			
			throw new BufferUnderflowException();
			
		}
		
		return last.element;
		
	}
	@Override
	public void enqueue(E element) throws BufferOverflowException {
		
		if(isFull()) {
			
			throw new BufferOverflowException();
			
		}
		
		Node<E> n = new Node<E>(element);
		
		if(isEmpty()) {
			
			first = n;
			last = n;
			
		}
		else {
			
			last.next = n;
			last = n;
			
		}
		
		numElements++;
		
	}
	@Override
	public E dequeue() throws BufferUnderflowException {
		
		if(isEmpty()) {
			
			throw new BufferUnderflowException();
			
		}
		
		E e = first.element;
		first = first.next;
		
		if(first == null) {
			
			last = null;
			
		}
		
		numElements--;
		
		return e;
		
	}

}
