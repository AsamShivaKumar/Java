package dataStructures;

public class MyStack<E>{

	MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e) {
		ll.add(e);
	}
	
	public E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("The stack is empty");
		}
		
		return ll.removeLast();
		
	}
	
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("The stack is empty");
		}
		
		return ll.getLast();
	}
}
