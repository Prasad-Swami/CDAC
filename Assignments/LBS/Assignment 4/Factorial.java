import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num: ");
        int num = sc.nextInt();
        int mul = 1;
        for(int i = 1; i<=num; i++){
            mul *= i;
        }
        System.out.println("The Facotrial of num is: " + mul);
    }
}