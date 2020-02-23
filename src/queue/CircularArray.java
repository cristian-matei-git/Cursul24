package queue;

import java.util.Arrays;

public class CircularArray<E> {
	
	private int size;
	private int tail;
	private int head;
	private int[] array;
	
	public CircularArray() {
	
		this.size = 0;
		this.tail = 0;
		this.head = 0;
		this.array = new int[4];
	}
	
	public void offer(int e) {
		
		if(this.size == array.length) {
			
			int temp[] = new int[array.length * 2];
			int i = 0;
			
			while(size > 0) {
				temp[i] = array[head];
				size--;
				i++;
				head = (head + 1) % array.length;
			}
			
			head = 0;
			tail = array.length;
			size = array.length;
			array = temp;
		
		}
		
		array[tail] = e;
		tail = (tail + 1) % array.length;
		size++;
		
	}
	
	public int poll() {
		
		int aux = array[head];
		head = (head + 1) % array.length;
		size--;
		return aux;
		
	}
	
	public int peek() {
		
		return array[head];
		
	}
	
	@Override
	public String toString() {
		return  Arrays.toString(array);
	}

	public boolean isEmpty() {
		
		return (size == 0);
		
	}
	
}
