package problems;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int a[] = {3,1,2,1,3,2,5,2,8,4,9};
		int k = 3;
			
		slide(a,a.length,k);
	}

	public static void slide(int arr[], int n, int k) {
		
		Deque<Integer> s = new LinkedList<>();
		
		for(int i = 0; i < k; i++) {
			while(!s.isEmpty() && arr[s.peekLast()] <= arr[i]) {
				s.removeLast();
			}
			s.addLast(i);
		}
		for(int i = k; i < n; i++) {
					
			System.out.print(arr[s.peekFirst()] + " ");
			while(!s.isEmpty() && s.peekFirst() <= i-k) {
				s.removeFirst();
			}
			while(!s.isEmpty() && arr[s.peekLast()] <= arr[i]) {
				s.removeLast();
			}
			s.addLast(i);
		}
		System.out.print(arr[s.peekFirst()] + " ");
	}
}
