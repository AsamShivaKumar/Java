package dataStructures.binaryTraversals;

import java.util.*;

public class Traversal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Node root = createTree();
		inOrder(root);
//		System.out.println();
//		preOrder(root);
//		System.out.println();
//		postOrder(root);
//		System.out.println();
//		levelOrderTraversal(root);
	}
	
	public static Node createTree() {
		Node root = null;
		System.out.println("Enter the value: ");
		int val = sc.nextInt();
		if(val == -1) return null;
		root = new Node(val);
		System.out.println("Enter left for " + val);
		root.left = createTree();
		System.out.println("Enter right for " + val);
		root.right = createTree();
		return root;
	}
	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	public static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	public static void levelOrderTraversal(Node root) {
		LinkedList<Node> qu = new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node temp = qu.pollFirst();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
			qu.addLast(root.left);
			}
			if(temp.right != null) {
			qu.addLast(root.right);
			}
		}
	}
	
public static class Node{
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
	}
}
}

