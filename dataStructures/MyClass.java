package dataStructures;

public class MyClass {

	public static void main(String[] args) throws Exception {
		
//		MyLinkedList<Integer> l = new MyLinkedList<>();
//		for(int i = 0; i < 10; i++) {
//			l.add(i);
//		}
//		l.print();
//		System.out.println(l.size());
//		System.out.println(l.get(4));
//		
//		String n = l.toString();
//		System.out.println(n);
		
		
//		MyStack<Integer> ms = new MyStack<>();
//		ms.push(12);
//		ms.push(1);
//		ms.push(21);
//		ms.push(121);
//	    System.out.println(ms.pop());
//	    int x = ms.peek();
//	    System.out.println(x);
		
//		MyQueue<Character> mq = new MyQueue<>();
//		
//		mq.enqueue('A');
//		mq.enqueue('B');
//		mq.enqueue('C');
//		mq.enqueue('D');
//		
//		System.out.println(mq.peek());
//		System.out.println(mq.dequeue());
//		System.out.println(mq.dequeue());
//		System.out.println(mq.dequeue());
//		System.out.println(mq.dequeue());
//		System.out.println(mq.dequeue());
//		mq.enqueue('A');
//		System.out.println(mq.peek());
//		MyArrayDeque<Integer> ma = new MyArrayDeque<>();
//		ma.addToHead(121);
//		ma.addToHead(21);
//		ma.addToHead(12);
//		System.out.println(ma.removeLast());
//		System.out.println(ma.removeLast());
//		System.out.println(ma.removeLast());
//		System.out.println(ma.removeLast());
		
		MyDeque<Integer> md = new MyDeque<>();
		md.offerFirst(2111);
		md.offerFirst(211);
		md.offerFirst(21);
		md.offerFirst(2);
		System.out.println(md.removeLast());
	}

}
