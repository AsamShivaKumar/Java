package dataStructures;

import java.util.Scanner;

public class MyBinaryTree<E> {
	   static Scanner sc = null;
	   public static void main(String[] args) {
		   sc = new Scanner(System.in);
		   Node root = createTree();
		   System.out.println(root.data);
	   }
	  
	   public static Node createTree() {
		   Node root = null;
		   System.out.println("Enter the value: ");
		   int val = sc.nextInt();
		   if(val == -1) return null;
		   root = new Node(val);
		   System.out.println("Enter the left for " + val);
		   root.left = createTree();
		   System.out.println("Enter the right for " + val);
		   root.right = createTree();
		   return root;
	   }
	   static class Node{
			int data;
			Node right, left;
			
			Node(int data){
				this.data = data;
				this.right = this.left = null;
			}
		}
}
