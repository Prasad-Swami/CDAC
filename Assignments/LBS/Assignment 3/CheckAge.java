import java.util.Scanner;

class CheckAge{
    void checkAgeCategory(int age){
        if(age <= 16){
            System.out.println("Minor");
        }else if(age <= 60){
            System.out.println("Adult");
        }else{
            System.out.println("Senior Citizen");
        }
    }

    public static void main(String[] args){
        CheckAge check = new CheckAge();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = inp.nextInt();
        check.checkAgeCategory(age);
    }
}