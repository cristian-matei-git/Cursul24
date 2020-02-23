package stack;

import java.util.LinkedList;
import java.util.List;

public class StackLinked<E>{
	
	private List<E> stack = new LinkedList<E>();
	
	public void push(E item) {
		
		stack.add(0, item);
		
	}	
	
	public E pop() {
		
		if(stack.isEmpty()) System.out.println("Eroare");
		return stack.remove(0);
	}
	
	public E peek() {
		
		if(stack.size() == 0) System.out.println("Eroare");
		return stack.get(0);
		
	}
	
	public boolean isEmpty() {
		
		return stack.isEmpty();
		
	}
	
	@Override
	public String toString() {
		
		return stack + "";
	}
	
}
