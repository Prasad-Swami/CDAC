package in.cdac.dsa;
import java.util.Scanner;
public class SleeperCoach {
	private boolean[] booked;
	private int n;
	
	public SleeperCoach(int n) {
		this.n = n;
		this.booked = new boolean[n+1];
		System.out.println("The total Births in Coach " + n);
	}
	
	static String berthType(int seatNo) {
		
		int seatType = seatNo % 8;
		
		switch(seatType) {
		case 0 -> {
			//System.out.println("The Berth Type is Side Upper Berth (SUB)");
			return "SideUpper";
		}
		case 1 -> {
			//System.out.println("The Berth Type is Lower Berth (LB)");
			return "Lower";
		}
		case 2 ->{
			//System.out.println("The Berth Type is Middle Berth (MB)");
			return "Middle";
		}
		case 3 ->{
			//System.out.println("The Berth Type is Upper Berth (UB)");
			return "Upper";
		}
		case 4 ->{
			//System.out.println("The Berth Type is Lower Berth (LB)");
			return "Lower";
		}
		case 5 ->{
			//System.out.println("The Berth Type is Middle Berth (MB)");
			return "Middle";
		} 
		case 6 ->{
			//System.out.println("The Berth Type is Upper Berth (UB)");
			return "Upper";
		}
		case 7 ->{
			//System.out.println("The Berth Type is Side Lower Berth (SLB)");
			return "SideLower";
		}
		default ->{
			System.out.println("Invalid berth type");
		}
		}
		return "";
	}
	
	public int book(String preferred) {		
		for(int itmp = 1; itmp <= n; itmp++) {
			if(!booked[itmp] && berthType(itmp).equals(preferred)) {
				booked[itmp] = true;
				System.out.println("Ticket is Booked " + itmp);
				return itmp;
			}
		}
		for(int itmp = 1; itmp <= n;itmp++) {
			if(!booked[itmp]) {
				booked[itmp] = true;
				System.out.println("Ticket is Booked " + itmp);
				return itmp;
			}
		}
		
		return -1;
	}
	
	public boolean cancel(int seatNo) {
		if(booked[seatNo]) {
			booked[seatNo] = false;
			System.out.println("Ticket Cancel " + seatNo);
			return true;
		}
		return false;
	}
	
	public int available() {
		int counter = 0;
		for(int itmp = 1; itmp < n + 1; itmp++) {
			if(!booked[itmp]) {
				counter++;
			}
		}
		System.out.println("Available: " + counter);
		return counter;
	}
	
	public void printChart() {
		for(int itmp = 1; itmp <= n; itmp++) {
			String status = booked[itmp]?"Booked" : "Available";
			System.out.println("Seat No.: " + itmp + ": " + berthType(itmp) + ": " + status);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size = scan.nextInt();
		SleeperCoach book = new SleeperCoach(size);
		berthType(4);
		book.book("SideLower");
		book.book("Lower");
		book.book("Upper");
		book.book("SideLower");
		book.book("Upper");
		book.book("SideLower");
		book.cancel(3);
		book.available();
		book.printChart();
		
	}
}
