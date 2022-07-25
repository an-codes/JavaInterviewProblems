package Iteration.main;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {

	
	   Node root;
	   
	    BinaryTree() {
	    
	    	root = null;
	    
	    }
	    

		// Root, Left, Right
		
		public void treePreOrderTraversalIterative(Node node) {
			 
	        if (node == null) {
	            return;
	        }
	        
	        
	        // Create an empty stack and push root to it
	        Stack<Node> nodeStack = new Stack<Node>();
	        nodeStack.push(root);
	 
	        
	        /*
	         
	         Instruction:
	         Pop all items one by one. Do following for every popped item.
	          - Push the root as the first node
	          - Print it
	          - Pop it
	          - Check its children
	          - Push right first
	          - Push left second
	          - Print the top element
	          - Pop the top element
	          
	          Repeat for the new node.
	         
	         */
	        
	        /*
	          
	         
	         stack:
	         A stack is a linear data structure that follows the principle of Last In First Out (LIFO).

	         
	         stack.peek:
	         The java.util.Stack.peek() method in Java is used to retrieve or fetch
	         the first element of the Stack or the element present at the top of the Stack.
	         The element retrieved does not get deleted or removed from the Stack.
	         
	         
	         stack.pop():
	         The Java.util.Stack.pop() method in Java is used to pop an element from the stack.
	         The element is popped from the top of the stack and is removed from the same.
	         
	         
	         stack.push(E Element):
	         Java.util.Stack.push(E element) method is used to push an element into the Stack.
	         The element gets pushed onto the top of the Stack.
	         
	         
	         */
	        
	        while (!nodeStack.empty()) {
	 
	            // Pop the top item from stack and print it
	            Node mynode = nodeStack.peek();
	            System.out.print(mynode.key + " ");
	            nodeStack.pop();
	 
	            // Push right and left children of the popped node to stack
	            if (mynode.right != null) {
	                nodeStack.push(mynode.right);
	            }
	            if (mynode.left != null) {
	                nodeStack.push(mynode.left);
	            }
	        }
			
		}
			  
		void printPreorderIterative() {
			treePreOrderTraversalIterative(root);
		}
	
	
}
