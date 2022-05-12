package dataStructures.graphDataStruc;

public class Implementation1 {
     int arr[][];
     
     Implementation1(int v){
    	 arr = new int[v][v];
     }
     public void addEdge(int from,int upto) {
    	 arr[from][upto] = 1;
     }
     public void addEdge(int from,int upto,int weight) {
    	 arr[from][upto] = weight;
     }
	public static void main(String[] args) {
		Implementation1 imp = new Implementation1(5);
		imp.addEdge(1, 3);
		imp.addEdge(2,3, 3);
		imp.addEdge(4, 3, 4);
		imp.addEdge(2,4,10);
		for(int[] item: imp.arr) {
			for(int it: item) {
				System.out.print(it + " ");
			}
			System.out.println();
		}
	}
}
