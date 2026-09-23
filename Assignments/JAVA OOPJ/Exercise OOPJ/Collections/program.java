package in.cdac.excercise;
import java.util.ArrayList;

import java.util.TreeSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class program {
	public static void main(String[] args) {
		//q1
		ArrayList <String> colours = new ArrayList<>();
		
		colours.add("Red");
		colours.add("White");
		colours.add("Black");
		colours.add("Cyan");
		colours.add("Yellow");
		
		System.out.println("New Array is Created yay");
		System.out.println(colours);
		
		//q2
		
		System.out.println("Now First element is GOLD");
		colours.set(0, "Gold");
		
		System.out.println(colours);
		
		//q3
		
		System.out.println("yo man whats on index 4");
		System.out.println(colours.get(4));
		
		//q4
		//using Iterator to find element
//		Iterator searchColour = colours.searchColour();
//		
		
		System.out.println("Lets check where White colour Hiding at");
		for(int icolor = 0; icolor < colours.size(); icolor++) {
			if(colours.get(icolor) == "White") {
				System.out.println("The index of colour White is: " + icolor);
			}
			
		}
		
		System.out.println("Change White to warm");
		colours.set(1, "Warm");
		
		System.out.println(colours);
		
		
		
		
		//q5
		
		System.out.println("Remove whats on Third Index");
		colours.remove(3);
		System.out.println(colours);
		
		//q6
		System.out.println("Find the Black");
		System.out.println(colours.contains("Black"));
		System.out.println("Blackkk is here");
		
		
		//q7
		
		//we need to sort the tree - add elemnets in set list 
		
		System.out.println("Lets Sort colours via Ascii/ Alpha by TreeSet");
		TreeSet <String> colourSort = new TreeSet<>();
		
		//trying by for each loop
		for(String col : colours) {
			colourSort.add(col);
		}
		
		System.out.println(colourSort);
		
		// q8
		
		System.out.println("Hey Created new Clone of Colour");
		
		Object copyCol = new ArrayList<>();
		
		copyCol = colours.clone();
		
		System.out.println(copyCol);
		
		// q9 --
		
		//new arraylist
//		ArrayList <String> colours2 = new ArrayList<>();
//		
//		Iterator iter = colours2.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		
		//loop
		
		
		Collections.shuffle(colours);  
		System.out.println("Shuffled Colours");
		System.out.println(colours);
		
		//Shuffling Elements 
		
		//q10 ----
		
//		ArrayList <String> colourRev = new ArrayList<>();
//
//		for(int icpy = 0; icpy < colours.size(); icpy++ ) {
//			colourRev = colours.reversed(); 
//		}
		
		System.out.println("Now the colours are reversed");
		//colourRev = colours.reversed();
		System.out.println(colours.reversed());
		
		//q 11 ---- 
		
		//Creating New Tree Set
		TreeSet <String> coloursTree = new TreeSet<>();
		
		coloursTree.add("White");
		coloursTree.add("Green");
		coloursTree.add("Red");
		coloursTree.add("Cyan");
		coloursTree.add("Brown");
		//coloursTree.add(null);
		coloursTree.add("Green");
		
		System.out.println("From TreeSet");
		System.out.println(coloursTree);
		
		//q 12 -- modify treeset add to other treeset
		
		TreeSet <String> copyTree = new TreeSet<>();
		
		for(String cpycol : coloursTree) {
			copyTree.add(cpycol);
		}
		
		System.out.println("The Copied Element from TreeSet is: ");
		System.out.println(copyTree);
		
		
		//q 13
		//Creating Reverse order of Tree Set
		System.out.println("The Reverse Colours Tree: ");
		System.out.println(coloursTree.reversed());
		
		//q 14
		//Modify first and last element
		System.out.println("The First Element is: ");
		System.out.println(coloursTree.getFirst());
		System.out.println("The Last Element is: ");
		System.out.println(coloursTree.getLast());
		
		System.out.println("New First Element");
		System.out.println(coloursTree.first());
		
		System.out.println("New last Element");
		System.out.println(coloursTree.last());
		
		//we can't set first and last cause treeset is sort by it
		
		//q 15
		//using celling
		
		System.out.println("Ceilling will print greater or equal value of that element: ");
		
		System.out.println(coloursTree.ceiling("Black")); //black not present there so it will print brown
		
		
	}
}
