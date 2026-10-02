import java.util.ArrayList;
import java.util.Scanner;

public class StudentMngSys {
    public static void main(String[] args){
        //you can do this in last file just add choice parameter
        //ArrayList<Integer> studentQueue(ArrayList<Integer> queueStudents, int iD){
        ArrayList<Integer> queueStudents = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int countFunc = 0;
        do{
            System.out.println(queueStudents);

            int addStudent = 1;
            int removeStudent = 2;
            int displayCurrentStudent = 3;
            int isPresent = 4;
            int count = 5;

            System.out.println("Enter the Choice: \n1 - Add the Student in Queue \n2 - Remove the Student from the List \n3 - Display The Current Student \n4 - Searching Student in Queue.\n5 - No of Students in the Count");

            int choice = scan.nextInt();
    
            switch (choice) {
                case 1 -> {
                    System.out.println("Add the Student in The Queue");
                    queueStudents.add(scan.nextInt());
                }
                case 2 ->{
                    System.out.println("Remove the first Student");
                    queueStudents.remove(Integer.valueOf(scan.nextInt()));
                }
                case 3 -> {
                    System.out.println("Display the Top Student");
                    System.out.println(queueStudents.get(0));
                }
                case 4 -> {
                    System.out.println("Search student");
                    System.out.println(queueStudents.contains(scan.nextInt()));
                }
                case 5 -> {
                    System.out.println("The Total Count of Student in the Queue");
                    System.out.println(queueStudents.size());
                }
                default -> {
                    System.out.println("Exit..");
                    countFunc = 1;
                }
            }
        }while(countFunc != 1);

        //System.out.println(queueStudents);

    }

    }


