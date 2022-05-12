package dataStructures;

public class Linked<E> {
	Node<E> head;
	
	void add(E data) {
		Node<E> add = new Node<>(data);
		if(isEmpty()) {
			head = add;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = add;
	}
	int size() {
		int sum = 0;
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
			sum++;
		}
		return sum;
	}
	E get(int index) {
		int x = 0;
		Node<E> temp = head;
		while(x < index) {
			temp = temp.next;
			x++;
		}
		return temp.data;
	}
	boolean isEmpty() {
		return head == null;
	}
	public class Node<E>{
		E data;
		Node<E> next;
		
		Node(E data){
			this.data = data;
			this.next = null;
		}
	}
}
