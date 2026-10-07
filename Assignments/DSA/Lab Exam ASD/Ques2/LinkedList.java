package in.cdac.dsaa;

public class LinkedList {
	static Node head;
	static Node nextnode;
	
	public static Node add(Node node) {
		if(head == null) {
			head = node;
			nextnode = node;
			return nextnode;
		}
		else if(head != null && head.next == null) {
			head.next = node;
			nextnode = node;
			return nextnode;
		}
		else {
			nextnode.next = node;
			nextnode = node;
			return nextnode;
		}
	}
	
	static void printDuplicates(Node head) {
		System.out.println("The Duplicates are: ");
		Node current = head;
		while(current != null) {
			int count = 1;
			Node temp = current.next;
			
			while(temp != null && current.data == temp.data) {
				count++;
				temp = temp.next;
			}
			if(count > 1) {
				System.out.println(current.data + " = " + count);
			}
			current = temp;
		}
	}
	
	static void display() {
		if(head != null) {
			Node curr = head;
			while(curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
	}
}
