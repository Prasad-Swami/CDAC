package in.cdac.dsaa;
import java.util.Scanner;

public class BSTmain {
	public static void main(String[] args) {
		//BSTInorder tree = new BSTInorder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Linked List");
		int size = scan.nextInt();
		
		for(int itmp = 0; itmp < size; itmp++) {
			System.out.println("Enter the Num");
			BSTInorder.insert(new Node(scan.nextInt()));
		}
//		tree.insert(new Node(10));
//		tree.insert(new Node(20));
//		tree.insert(new Node(30));
//		tree.insert(new Node(40));
//		tree.insert(new Node(50));

		BSTInorder.display();
		scan.close();;
	}
}
