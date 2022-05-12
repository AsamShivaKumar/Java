package helloWorld;

import dataStructures.MyLinkedList;

public class New<E> {
	
	MyLinkedList<E> ll = new MyLinkedList<>();
	
	public void push(E e) {
		ll.add(e);
	}
	public E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("The stack is empty!");
		}
		return ll.removeLast();
	}
	public E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("The stack is empty!");
		}
		return ll.getLast();
	}
	public boolean empty() {
		return ll.isEmpty();
		}
	
	public int search(E e) {
		return ll.searchEle(e);
	}
	}


