package main.Iterative;

import java.util.Stack;

public class BinaryTree {

	
	   Node root;
	   
	    BinaryTree() {
	    
	    	root = null;
	    
	    }
	    

		// Left, Right, Root
		
		public void treePostOrderTraversalIterative(Node node) {
			
			Stack<Node> s1;
			Stack<Node> s2;
			
	
			
		// Using Two Stacks
			
		/*
		  Source: https://www.geeksforgeeks.org/iterative-postorder-traversal/
		 
		 1. Push root to first stack.
		 
		 2. Loop while first stack is not empty:
    	    2.1 Pop a node from first stack and push it to second stack
    	    2.2 Push left and right children of the popped node to first stack
    	 
		 3. Print contents of second stack 
		 
		 
		 
		 We keep the first stack as a working stack to temporarily store nodes and
		 the second stack to save the order of the nodes.
		 
		 Pop the top value of the first stack, simultaneously push that same value to a second stack,
		 as a 'read' value and push this value's children into the first stack. 

		 */
	
		        // Create two stacks
		        s1 = new Stack<>();
		        s2 = new Stack<>();
		 
		        if (root == null)
		            return;
		 
		        // push root to first stack
		        s1.push(root);
		 
		        // Run while first stack is not empty
		        while (!s1.isEmpty()) {
		            // Pop an item from s1 and push it to s2
		            Node temp = s1.pop();
		            s2.push(temp);
		 
		            // Push left and right children of
		            // removed item to s1
		            if (temp.left != null)
		                s1.push(temp.left);
		            if (temp.right != null)
		                s1.push(temp.right);
		        }
		 
		        // Print all elements of second stack
		        while (!s2.isEmpty()) {
		            Node temp = s2.pop();
		            System.out.print(temp.key + " ");
		        }
		    }
			
			  
		void printPostorderIterative() {
			treePostOrderTraversalIterative(root);
		}
	
	
}
