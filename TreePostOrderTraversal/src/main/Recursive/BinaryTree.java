package main.Recursive;

public class BinaryTree {

	
	   Node root;
	   
	    BinaryTree() {
	    
	    	root = null;
	    
	    }
	    

		// Left, Right, Root
		
		public void treePostOrderTraversalRecursive(Node node) {
			        if (node == null)
			            return;
			  
			        treePostOrderTraversalRecursive(node.left);
			        treePostOrderTraversalRecursive(node.right);
			        System.out.print(node.key + " ");
			    }
			  
		void printPostorderRecursive() {
			treePostOrderTraversalRecursive(root);
		}
	
	
}
