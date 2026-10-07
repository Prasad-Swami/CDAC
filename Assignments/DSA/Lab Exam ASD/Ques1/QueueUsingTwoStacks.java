package in.cdac.dsaa;
import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueUsingTwoStacks {		
	ArrayDeque<Integer> inStack = new ArrayDeque<>();
	ArrayDeque<Integer> outStack = new ArrayDeque<>();
	
	public void enqueue(int num) {
		inStack.push(num);
	}
	
	private void transfer() {
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
	}
	
	public int dequeue() {
		transfer();
		if(outStack.isEmpty()) {
			System.out.println("EMPTY");
		}
		return outStack.pop();
	}
	
	public int peek() {
		transfer();
		if(outStack.isEmpty()) {
			System.out.println("EMPTY");
		}
		return outStack.peek();
	}
	
	public int size() {
		return outStack.size() + inStack.size();
	}
	
	public static void main(String[] args) {
		QueueUsingTwoStacks list = new QueueUsingTwoStacks();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = scan.nextInt();
		
		for(int itmp = 0; itmp < size; itmp++) {
			System.out.println("Enter the Operation \nE = Enqueue \nD = Dequeue \nP = Top Value \nS = Number of Element in the Queue \nE = Exit");
			String operation = scan.nextLine();
			
			switch(operation) {
			case "E" -> {
				System.out.println("Enter the Num to Enqueu");
				int num = scan.nextInt();
				list.enqueue(num);
			}
			case "D" -> {
				System.out.println("Remove the top Num");
				list.dequeue();
			}
			case "P" -> {
				System.out.println("The top Num is");
				list.peek();
			}
			case "S" -> {
				System.out.println("The total ELements int the Queue is: " + list.size());
			}
			}
			
		}
		scan.close();
	}
}
