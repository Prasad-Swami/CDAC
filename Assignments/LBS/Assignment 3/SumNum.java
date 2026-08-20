import java.util.Scanner;

class SumNum{
    void sumOfTwoNumbers(int a, int b){
        int result = a + b;
        System.out.println("The sum of" + result);
    }
    public static void main(String[] args){
        SumNum obj = new SumNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a = sc.nextInt();
        System.out.println("Enter the second num: ");
        int b = sc.nextInt();
        obj.sumOfTwoNumbers(a, b);
    }
}