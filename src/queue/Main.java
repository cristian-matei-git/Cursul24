package queue;

public class Main {

	public static void main(String[] args) {
		
		CircularArray<Integer> array = new CircularArray<>();
		
		System.out.println(array.isEmpty());
		array.offer(3);
		System.out.println(array);
		array.offer(4);
		array.offer(5);
		array.offer(6);
		array.offer(7);
		System.out.println(array.poll());
		System.out.println(array.poll());
		System.out.println(array.poll());
		System.out.println(array);
		System.out.println(array.peek());
		System.out.println(array.isEmpty());
		System.out.println(array);

	}

}
