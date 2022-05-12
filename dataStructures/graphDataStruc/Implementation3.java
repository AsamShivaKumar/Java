package dataStructures.graphDataStruc;

import java.util.ArrayList;
import java.util.LinkedList;

public class Implementation3 {
//	Undirected graph
	ArrayList<Integer> arr[];
	
	public Implementation3(int v) {
		arr = new ArrayList[v];
		for(int i = 0; i < v; i++) {
			arr[i] = new ArrayList<>();
		}
	}
	public void addEdge(int from, int upto) {
		arr[from].add(upto);
		arr[upto].add(from);
	}
	public void breadthFirst(int s) {
		boolean visited[] = new boolean[arr.length];
		LinkedList<Integer> queue = new LinkedList<>();
		queue.addLast(s);
		visited[s] = true;
		while(!queue.isEmpty()) {
			int pri = queue.pollFirst();
			System.out.print(pri + " ");
			for(int item: arr[pri]) {
				if(!visited[item]) {
					visited[item] = true;
					queue.add(item);
				}
			}
		}
	}
//	returns the shortest distance between source and destination
//	public int breadthFirstSearch(int source, int destination) {
//		boolean visited[] = new boolean[arr.length];
//		int dis = 0;
//		LinkedList<Integer> queue = new LinkedList<>();
//		queue.add(source);
//		visited[source] = true;
//		while(!queue.isEmpty()) {
//			int x = queue.pollFirst();
//			for(int i: arr[x]) {
//				if(i == destination) break;
//				
//				if(!visited[i]) {
//					queue.add(i);
//					visited[i] = true;
//					dis++;
//				}
//						}
//		}
//		return dis;
//	}
	public void depthFirstTraversal(int source) {
		boolean visited[] = new boolean[arr.length];
		DFTUtil(source, visited);
		
	}
	public void DFTUtil(int source, boolean visited[]) {
		System.out.print(source + " ");
		visited[source] = true;
		for(int i: arr[source]) {
			if(!visited[i]) {
				DFTUtil(i, visited);
			}
		}
	}
// returns a boolean value on the basis of whether there is a path to traverse from the source to destination
	public boolean DFS(int source, int destination) {
		boolean visited[] = new boolean[arr.length];
		return DFSUtil(source, destination, visited);
	}
	public boolean DFSUtil(int source, int destination, boolean visited[]) {
		if(source == destination) return true;
		
		for(int i: arr[source]) {
			if(!visited[i]) {
				visited[i] = true;
				boolean isConnected = DFSUtil(i, destination, visited);
				
				if(isConnected) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Implementation3 imp = new Implementation3(6);
		imp.addEdge(2,3);
		imp.addEdge(3, 5);
		imp.addEdge(1,5);
		imp.addEdge(1, 3);
//		System.out.println(imp.breadthFirstSearch(1, 5));
//		imp.breadthFirst(1);
//		System.out.println();
//		imp.depthFirstTraversal(1);
		System.out.println(imp.DFS(2,5));
	}

}
