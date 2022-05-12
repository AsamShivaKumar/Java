package algorhythm.searching;

public class JumpSearch {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println(search(a, 8));
	}
	
	static int search(int arr[], int x) {
		int n = arr.length;
		int m = (int)Math.sqrt(n);
		int i = 0;
		while(i < n) {
			if(arr[i] == x) {
				return i;
			}
			if(i >= 1) {
			if(arr[i] > x) {
				for(int j = i-m+1; j < i; j++) {
					if(arr[j] == x) {
						return j;
					}
				}
				return -1;
			}
		}
			i += m;
		}
		return -1;
	}
}
