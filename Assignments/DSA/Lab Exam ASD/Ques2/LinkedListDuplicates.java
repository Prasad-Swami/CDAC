package in.cdac.dsaa;
import java.util.Scanner;

public class LinkedListDuplicates {
	static int size;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//LinkedList n = new LinkedList();
		System.out.println("Enter the Size of Linked List");
		size = scan.nextInt();
		for(int itmp = 0; itmp < size; itmp++) {
			System.out.println("Enter the nums in " + itmp);
			LinkedList.add(new Node(scan.nextInt()));
		}
		
		LinkedList.printDuplicates(LinkedList.head);
		LinkedList.display();
		scan.close();
//		Node n1 = new Node(10);
//		Node n2 = new Node(20);
//		Node n3 = new Node(30);
//		Node n4 = new Node(40);
//		
//		Node head = n1;
//		head.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		
	}	
}
