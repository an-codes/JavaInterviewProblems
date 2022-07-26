package main.Recursive;

public class InOrderTraversalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
  
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printInorderRecursive();
        
        
	}
	
}
