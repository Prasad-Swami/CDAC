import java.util.Scanner;

class SumArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSum[] = new int[5];

        System.out.println("Add the nums in array: ");

        for(int i = 0 ; i < 5 ; i++){
            arrSum[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < 5; i++){
            sum += arrSum[i];
        }

        System.out.println("Sum of all Numbers are: " + sum);
    }
}