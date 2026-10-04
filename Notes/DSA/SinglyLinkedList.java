package in.cdac.dsa;
import java.util.NoSuchElementException;
public class SinglyLinkedList{
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmplty() {
		return size == 0;
	}
	
	//O(1)
	public void addFirst(int value) {
		Node n = new Node(value);
		n.next = head;
		head = n;
		size ++;
	}
	
	//O(n) - must walk through all the elements
	public void addLast(int value) {
		Node n = new Node(value);
		
		if(head == null) {
			head = n;
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = n;
			//n = current;
			
		}
		size++;
	}
	
	private Node nodeAt(int index) {
		Node current = head;
		for(int itmp = 0; itmp < index; itmp++) {
			current = current.next;
		}
		return current;
	}
	
	public void add(int index, int value) {	
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index);
		}
		if (index == 0) {
			addFirst(value);
			return;
		}
		
		Node prev = nodeAt(index - 1);
		Node n = new Node(value);
		n.next = prev.next; // pointing previous next to n node next
		prev.next = n;
		
		size++;
	}
	
	public int removeFirst() {
		if(head == null) {
			throw new NoSuchElementException("List is empty");
		}
		
		int v = head.data;
		head = head.next;
		size --;
		return v;
	}
	
	public int removeLast() {
		if(head == null) {
			throw new NoSuchElementException("List is Empty no last no first dwag");
		}
		if(head.next == null) {
			return removeFirst();
		}
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		int v = current.next.data;
		current.next = null;
		size--;
		return v;
	}
	private void checkElementIndex(int index) { 
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Its Invalid dude make sure index is valid");
		}
	}
	public int remove(int index) {
		checkElementIndex(index);
		if(index == 0) {
			return removeFirst();
		}
		Node prev = nodeAt(index - 1);
		int v = prev.next.data;
		prev.next = prev.next.next;
		size --;
		return v;
		}
	
	public int get(int index) {
		checkElementIndex(index);
		return nodeAt(index).data;
	}
	
	public boolean contains(int value) {
		for(Node current = head; current != null; current = current.next) {
			if(current.data == value) {
				return true;
			}
		}
		return false;
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		
		while(current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Node current = head; current != null; current = current.next) {
			sb.append(current.data).append("->");
		}
		return sb.append("null").toString();
	}
	
	public static void main(String[] agrs) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addFirst(20);
		list.addLast(34);
		list.addLast(23);
		list.add(2, 88);
		list.addFirst(32);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.reverse();
		System.out.println(list);
		
	}
}
