package in.cdac.dsa;

public class BST {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(new Node(10));
		tree.insert(new Node(5));
		tree.insert(new Node(24));
		tree.insert(new Node(3));
		tree.insert(new Node(7));
		tree.insert(new Node(15));
		tree.insert(new Node(30));
		
		tree.display();
		System.out.println(tree.search(3));
		
	}
}
