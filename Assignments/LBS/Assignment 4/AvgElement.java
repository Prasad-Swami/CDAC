import java.util.Scanner;
class AvgElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Nums: ");
        int arrAvg[] = new int[5];

        for(int i = 0; i < 5; i++){
            arrAvg[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += arrAvg[i];
        }

        int avg = sum / 5;

        System.out.println("The Avg of the array is: " + avg);

    }
}