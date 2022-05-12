package algorhythm.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7};
		System.out.println(iterativeSearch(a,8));
	}
	
	static int search(int arr[], int start, int end, int x) {
		if(end >= 1 && start <= arr.length-2 && start < end) {
		int mid = (start + end-1)/2;
		if(arr[mid] == x) {
			return mid;
		}else if(arr[mid] > x) {
			return search(arr, start, mid-1, x);
		}else {
			return search(arr,mid+1,end,x);
		}
	}
		return -1;
	}
	
//	Iterative Approach
	static int iterativeSearch(int arr[], int x) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end-1)/2;
		while(start <= end) {
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] > x) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}

}
