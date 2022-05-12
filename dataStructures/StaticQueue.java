package dataStructures;

public class StaticQueue{
	int front,rear;
	int size;
	int capacity;
	int array[];
	
	public StaticQueue(int capacity) {
		front = size = 0;
		this.capacity = capacity; 
		rear = capacity - 1;
		array = new int[this.capacity];
	}
	
	public void enqueue(int data) {
		if(this.isFull(this)) {
			System.out.println("The queue is full!");
			return;
		}
		this.rear = (this.rear + 1)%this.capacity;
		this.array[this.rear] = data;
		this.size += 1;
		
	}
	public int dequeue(){
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		int ret = array[front];
		this.front = (front + 1)%capacity;
		this.size = this.size - 1;
		return ret;
	}
	public int front() {
		return this.array[this.front];
	}
	
	public int rear() {
		return this.array[this.rear];
	}

	
	public boolean isFull(StaticQueue queue) {
		return queue.size == queue.capacity;
	}
	public boolean isEmpty(StaticQueue queue) {
		return queue.size == 0;
	}
	
	public static void main(String[] args){
		StaticQueue sq = new StaticQueue(8);
		for(int i = 1; i < 9; i ++) {
			sq.enqueue(i);
		}
		System.out.println(sq.dequeue());
		sq.enqueue(7);
		System.out.println(sq.dequeue());
		System.out.println(sq.front());
	}
}
