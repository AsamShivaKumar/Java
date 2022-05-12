package dataStructures.graphDataStruc;

import java.util.*;

public class Implementation2 {
//	Undirected graph
	ArrayList<ArrayList<Integer>> arr;
	
	public Implementation2(int v) {
		arr = new ArrayList<>(v);
		for(int i = 0; i < v; i++) {
			arr.add(new ArrayList<>());
		}
	}
	public void addEdge(int from, int upto) {
		arr.get(from).add(upto);
		arr.get(upto).add(from);
	}
	public void print() {
		for(int i = 0; i < arr.size(); i++) {
			System.out.println("The array list for node " + i);
			System.out.println(arr.get(i));
		}
	}
	public static void main(String[] args) {
		Implementation2 imp = new Implementation2(5);
		imp.addEdge(1,4);
		imp.addEdge(2,3);
		imp.addEdge(3, 4);
		imp.addEdge(4, 2);
		imp.print();
	}
}
