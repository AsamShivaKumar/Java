package dataStructures;

public class MyLinkedList<E> {

	Node<E> head;
	
     public void add(E data) {
		Node<E> addTo = new Node<>(data);
		
		if(isEmpty()) {
			head = addTo;
			return;
		}
		Node<E> temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = addTo;
	}
	
	public void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public int size() {
		Node<E> temp = head;
		int sum = 0;
		
		while(temp != null) {
			sum++;
			temp = temp.next;
		}
		return sum;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public E get(int index){
		int i = 0;
		Node<E> temp = head;
		while(i <  index) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}
	public E removeLast() throws Exception {
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("The list is empty!");
			}
		if(temp.next == null) {
			Node<E> toRemove = temp;
			temp = null;
			return toRemove.data;
		}
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
		
	}
	
	public E getLast() throws Exception {
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("The list is empty!");
			}
		if(temp.next == null) {
			Node<E> toRemove = temp;
			return toRemove.data;
		}
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		return toRemove.data;
		
	}
	public int searchEle(E e) {
		E ret;
		if(!isEmpty()) {
			int i = 0;
			Node temp = head;
			while(temp != null) {
				if(temp.data == e) {
					return i;
				}else {
					i += 1;
					temp = temp.next;
				}
			}
		}
		return -1;
	}
	
	public static class Node<E> {
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}

}
