package algorithm;

import java.util.*;

public class Huffaman {
	    
	    static class HuffmanNode implements Comparable<HuffmanNode> {
	           int freq;
	           char c;
	           HuffmanNode left,right;
	           
	           HuffmanNode(int freq, char c){
	               this.freq = freq;
	               this.c = c;
	               this.left = this.right = null;
	           }
	           
	          @Override
	          public int compareTo(HuffmanNode h){
	              if(this.freq == h.freq) return 1;
	              return (this.freq-h.freq);
	          }
	    }
	    
	    
	    static public ArrayList<String> huffmanCodes(String S, int f[], int N)
	    {
	           ArrayList<String> arr = new ArrayList<>();
	           
	           PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
	           
	           for(int i = 0; i < N; i++){
	               HuffmanNode hnew = new HuffmanNode(f[i],S.charAt(i));
	               pq.add(hnew);
	           }
	           
	           HuffmanNode root = null;
	           
	           while(pq.size() > 1){
	                HuffmanNode a = pq.poll();
	                HuffmanNode b = pq.poll();
	                HuffmanNode hnew = new HuffmanNode(a.freq+b.freq,'#');
	                hnew.left = a;
	                hnew.right = b;
	                root = hnew;
	                pq.add(hnew);
	           }
	           
	           encode(root,arr,"");
	           return arr;
	    }
	    
	    static void encode(HuffmanNode root,ArrayList<String> arr, String s){
	         
	         if(root.left == null && root.right == null && root.c != '#'){
	             arr.add(s);
	             return;
	         }
	         
	         encode(root.left,arr,s+"0");
	         encode(root.right,arr,s+"1");
	    }
	
	public static void main(String[] args) {
		   
		   String S = "akdfvlo";
		   int freq[] = {4,5,2,7,5,8,9};
		   
		   ArrayList<String> codes = huffmanCodes(S,freq,7);
		   
		   for(String s: codes) System.out.print(s + " ");
		   System.out.println();
	}

}
