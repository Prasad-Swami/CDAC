import java.util.Scanner;

class SumofOdds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num: ");
        int num = sc.nextInt();
        System.out.println("The Sum of Odd Num are: ");
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}