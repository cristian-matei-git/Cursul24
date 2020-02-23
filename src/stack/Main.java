package stack;

public class Main {

	public static void main(String[] args) {
		
		
		StackLinked<Integer> stack = new StackLinked<>();
		
		System.out.println(stack);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		stack.push(1);
		stack.push(5);
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
	}

}
