package in.cdac.dsa;
import java.util.Scanner;
public class AttendanceReport {
	static int present = 0;
	static int absent = 0;
	static int total;
	static double percentage;
	static int needPresentDays;
	
	
	static int countPresent(int att[]){
		total = att.length;
		for(int iatt = 0; iatt < att.length; iatt++) {
			if(att[iatt] == 1) {
				present += 1;
			}else {
				absent += 1;
			}
		} 
		System.out.println("Days Present:"+ present + " of " + total);
		return present;
	}
	
	static double percentage(int present) {
		percentage = ((double)present/total) * 100;
		System.out.println("Attendance:" + percentage + "%");
		return percentage;
	}
	
	static boolean isEligible() {
		if (percentage > 75) {
			System.out.println("Eligible:Yes");
			return true;
		}else
			System.out.println("Eligible:No");
		return false;
	}
	//Longest Streak work is not completed yet
	static void longestStreak(int att[], int value) {
		int bestCount = 0;
		int currCount = 0;
		//int bestEnd;
		if(value == 1) {
			for(int itmp = 0; itmp < att.length; itmp++) {
				if(att[itmp] == value) {
					currCount += 1;
				}			
			}
			
			if(currCount > bestCount) {
				bestCount = currCount;
			}
			System.out.println("Longest Presence: " + bestCount);
		}
		
		
		
//		int presentAtt[] = new int[];
//		int absentAtt[] = new int[];
//		
	}
	
	static int daysNeeded(int present, int total) {
		int curr = 0;
		int extraNeed = 0;
		int initialPresent = present;
		if(percentage < 75) {
			while((((double)present/total)*100) < 76) {
				curr  = present + 1;
				present = curr;
				total ++;
				//percentage(needPresentDays);
			}
			extraNeed = present - initialPresent;
			System.out.println("Days needed for 75%: " + extraNeed +" " + present + " of " + total);	
		}
		return extraNeed;
	}
	
	public static void main(String[] args) {
		AttendanceReport student = new AttendanceReport();
		Scanner scan = new Scanner(System.in);
		System.out.println("Put the total Days");
		int size = scan.nextInt();
		int arrStud[] = new int[size];
		for(int itmp = 0; itmp < arrStud.length; itmp++) {
			System.out.println("Day: " + (itmp+1));
			arrStud[itmp] = scan.nextInt();
		}
		
		countPresent(arrStud);
		percentage(present);
		isEligible();
		longestStreak(arrStud, 1);
		daysNeeded(present, total);
		
		System.out.println(present);
		System.out.println(total);
	}
}


