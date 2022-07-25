package Recursion.main;

public class BinaryTree {

	
	   Node root;
	   
	    BinaryTree() {
	    
	    	root = null;
	    
	    }
	    

		// Root, Left, Right
	    
	    /*
	     Calling a method goes into going through the method's steps top to bottom. 
	     When a method's step is one that calls the method (calls itself),
	     it puts the first run through the method on hold and
	     goes to execute itself from the beginning but with another value (here e.g. node.left).
	     Then when node.left 'breaks' because it is null, the previous run of the method is
	     restarted from the moment it was put on hold.
	     
	     It is well illustrated by Dinesh Varyani, see here: https://www.youtube.com/watch?v=R4V4n-waxn4
	     */
		
		public void treePreOrderTraversalRecursive(Node node) {
			        if (node == null) {
			            return;
			        }
			  
			        System.out.print(node.key + " ");
			        treePreOrderTraversalRecursive(node.left);
			        treePreOrderTraversalRecursive(node.right);
			    }
			  
		void printPreorderRecursive() {
			treePreOrderTraversalRecursive(root);
		}
	
	
}
