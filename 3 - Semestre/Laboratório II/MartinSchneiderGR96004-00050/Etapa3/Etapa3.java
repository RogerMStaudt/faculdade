package Etapa3;

public class Etapa3 {
	
	public Stack<Character> converteStringStack(String dado){
		
		Stack<Character> stack = new StaticStack<Character>(dado.length());
		
		for(int i=dado.length()-1; i>=0; i--) {
			
			stack.push(dado.charAt(i));
			
		}
		
		return stack;
		
	}
	
	public boolean checkBrackets(Stack<Character> s1) {
		
		Stack<Character> stack = new StaticStack<Character>(s1.numElements());
		
		while(!s1.isEmpty()) {
			
			Character elemento = s1.pop();
			
			if(elemento == '(') {
				
				stack.push(elemento);
				
			}
			else if(elemento == ')') {
				
				if(stack.isEmpty()) {
					
					return false;
					
				}
				else {
					
					stack.pop();
					
				}
				
			}
			
		}
		
		return stack.isEmpty();
		
	}

}
