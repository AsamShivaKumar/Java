package dataStructures;

import dataStructures.MyLinkedList.Node;

public class MyQueue<E> {

	private Node<E> head;
	private Node<E> tail;
	
	void enqueue(E data) {
		Node<E> add = new Node<>(data);
		if(head == null) {
			head = add;
			return;
		}
		if(tail == null) {
			tail = add;
			return;
		}
		tail.next = add;
	}
	
	E dequeue() {
		if(head == null) {
			return null;
			}
		if(head.next == null || tail == null) {
			Node<E> temp = head;
			head = null;
			return temp.data;
		}
		Node<E> temp = head;
		head = head.next;
		return temp.data;
	}
	E peek() {
		return head.data;
	}
	
}
