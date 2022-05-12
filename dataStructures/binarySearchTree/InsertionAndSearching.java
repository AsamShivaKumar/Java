package dataStructures.binarySearchTree;

public class InsertionAndSearching {
//	Binary Search Tree Class
	Node root;
	
	InsertionAndSearching(){
		root = null;
	}
	public void insert(int data) {
		insertUtil(root, data);
	}
	public Node insertUtil(Node root,int data){
		Node toInsert = new Node(data);
		if(root == null) {
			root = toInsert;
		}
		if(root.data > data) {
			root.left = insertUtil(root.left, data);
		}else if(root.data < data){
			root.right = insertUtil(root.right, data);
		}
		return root;
	}
	public void inOrder(Node root) {
		if(root != null) {
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
		}
	}
	public void inOrderUtil() {
		inOrder(root);
	}
	class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	public static void main(String[] args) {

		InsertionAndSearching bst = new InsertionAndSearching();
//		        10
//		      5   19 
//		   4  6  12 20
		
		bst.insert(10);
		bst.insert(5);
		bst.insert(19);
		bst.insert(4);
		bst.insert(6);
		bst.insert(12);
		bst.insert(20);
		bst.inOrderUtil();
	}

}
