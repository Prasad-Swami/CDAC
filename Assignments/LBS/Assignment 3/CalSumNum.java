import java.util.Scanner;
class CalSumNum {
    void calculateSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The Sum of Numbers is: " + sum);
    }
    public static void main(String[] args){
        CalSumNum obj1 = new CalSumNum();
        obj1.calculateSum();
    }
}
