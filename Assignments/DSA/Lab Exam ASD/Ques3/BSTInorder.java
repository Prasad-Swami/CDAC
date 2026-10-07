package in.cdac.dsaa;

public class BSTInorder {
	static Node root;
	
	static void insert(Node node) {
		root = insertHelper(root, node);
	}
	
	static Node insertHelper(Node root, Node node) {
		int data = node.data;
		if(root == null) {
			return node;
		}
		else if(root.data > data) {
			root.left = insertHelper(root.left, node);
		}
		else{
			root.right = insertHelper(root.right, node);
		}
		return root;
	}
	
	static void display() {
		displayHelper(root);
	}
	
	static void displayHelper(Node root) {
		
		if(root == null) {
			return;
		}
		displayHelper(root.left);
		System.out.println(root.data);
		displayHelper(root.right);
	}
}
