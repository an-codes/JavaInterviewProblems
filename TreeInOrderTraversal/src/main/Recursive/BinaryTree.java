package main.Recursive;

public class BinaryTree {

	
	   Node root;
	   
	    BinaryTree() {
	    
	    	root = null;
	    
	    }
	    

		// Left, Root, Right
		
		public void treeInOrderTraversalRecursive(Node node) {
			        if (node == null)
			            return;
			  
			        treeInOrderTraversalRecursive(node.left);
			        System.out.print(node.key + " ");
			        treeInOrderTraversalRecursive(node.right);
			    }
			  
		void printInorderRecursive() {
			treeInOrderTraversalRecursive(root);
		}
	
	
}
