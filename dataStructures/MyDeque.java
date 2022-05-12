package dataStructures;

import dataStructures.MyArrayDeque.Node;

public class MyDeque<E> {
	Node<E> head, tail;
	
	public void offerFirst(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}
	public E removeLast() {
		if(head == null) {
			return null;
		}
		if(head == tail) {
			Node<E> ret = head;
			head = tail = null;
			return ret.data;
		}
		Node<E> ret = tail;
		tail = tail.next;
		tail.prev = null;
		
		return ret.data;
	}
	public static class Node<E>{
		E data;
		Node<E> next,prev;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
			
		}
	}
}
