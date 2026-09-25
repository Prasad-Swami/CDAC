package in.cdac.examReLearn;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.OptionalDouble; 
import java.util.Optional;
import java.util.Collections;

public class Result {
	private String studentName;
	private String subName;
	private int marks;
	private Grade grade;
	
	Result(String studentName, String subName, int marks){
		this.studentName = studentName;
		this.subName = subName;
		this.marks = marks;
		
		if(marks >= 75) {
			this.grade = Grade.DISTINCTION;
		}else if(marks >= 60) {
			this.grade = Grade.FIRST_CLASS;
		}else if(marks >= 50) {
			this.grade = Grade.SECOND_CLASS; 
		}else if(marks >= 40) {
			this.grade = Grade.PASS;
		}else {
			this.grade = Grade.FAIL;
		}
	}
		
	public String getSubName() {
		return subName;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public Grade getgrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return "\nName: " + studentName + "\nSubject name: " + subName + "\nMarks: " + marks + "\nGrade: " + getgrade();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Grade grade;
		int limit = 0;

		
		ArrayList<Result> entry = new ArrayList<>();
		
		do {
			
			System.out.println("1. Add new Result Entry, \n2. Display Result, \n3. Calculate the avg Marks, \n4. Top Scorer, \n5. Sorted Display all results ");
			int choiceFunc = scan.nextInt();
			switch(choiceFunc) {
			case 1 -> {
				System.out.println("Add the Result Entry");
				System.out.println("Add Name");
				String name = scan.next();
				System.out.println("Add Subject name");
				String sub = scan.next();
				System.out.println("Add Marks");
				int marks = scan.nextInt();	
				Result res = new Result(name, sub, marks);
				entry.add(res);	
			}
			
			case 2 ->{
				System.out.println("Display the Student Marks");
				System.out.println(entry.toString());
				System.out.println("Displaying Results by Specific Grade");
				String inputGrade = scan.next();
				Grade grades = Grade.valueOf(inputGrade);
				Predicate<Result> byGrade = remark ->(remark.getgrade().equals(grades)); 
				entry.stream()
					 .filter(byGrade)
					 .forEach(System.out::println); 
			}
			
			case 3->{
				System.out.println("Enter The Subject you want get avg marks");
				String subject = scan.next();
				Predicate<Result> bySubject = result -> (result.getSubName().equals(subject)); 
				long count = entry.stream()
								 .filter(bySubject)
								 .count();
				double avg = entry.stream()
								  .filter(bySubject)
								  .mapToInt(res -> res.getMarks())
								  .average()
								  .orElse(0.0);	
				System.out.println("The Average Marks in: " + avg);	
			}
			
			case 4->{
				System.out.println("The Top Scorer: ");				
				Optional <Result> topStudent = entry.stream()
									.max((r1, r2) -> r1.getMarks() - r2.getMarks());
				System.out.println(topStudent);
			}
			
			case 5 ->{
				System.out.println("Display all Results in Revers Sorted: ");
				Collections.sort(entry,(r1, r2) -> r2.getMarks() - r1.getMarks() );
				System.out.println(entry);
				
			} 
			
			default -> {
				System.out.println("Exit");
				limit = 1;
			}	
			}
		}while(limit == 0);		
		scan.close(); 
	}
	
}
