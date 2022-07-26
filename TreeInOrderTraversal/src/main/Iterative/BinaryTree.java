package main.Iterative;

import java.util.Stack;

public class BinaryTree {

	
	   Node root;
	   
	    BinaryTree() {
	    
	    	root = null;
	    
	    }
	    
	    // Source: https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/

		// Root, Left, Right
		
		public void treeInOrderTraversalIterative(Node node) {
			
			Stack<Node> s = new Stack<Node>();
	        Node currNode = root;
	  
	        // traverse the tree
	        while (currNode != null || s.size() > 0) {
	  
	            /* Reach the left most Node of the currNode Node */
	            while (currNode !=  null) {
	                s.push(currNode);
	                currNode = currNode.left;
	            }
	  
	            currNode = s.pop();
	  
	            System.out.print(currNode.key + " ");
	            
	            currNode = currNode.right;
	        }
	    }
			

			  
		void printInorderIterative() {
			treeInOrderTraversalIterative(root);
		}
	
	
}
