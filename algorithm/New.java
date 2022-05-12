package algorithm;

import java.util.*;

public class New {

	public static void main(String[] args) {
		int arr[] = {5,1,2,3,4};
		System.out.println(isAscending(arr));
	}
	
	static boolean isAscending(int a[]) {
		boolean ret = true;
		Stack<Integer> st = new Stack<>();
		if(a[0] < a[1]) {
			st.push(a[0]);	
		}else {
			return false;
		}
		for(int i = 1;i < a.length; i++) {
			if(a[i] < st.peek()) {
				ret = false;
				break;
			}else {
				st.push(a[i]);
			}
		}
		
		return ret;
	}

}
