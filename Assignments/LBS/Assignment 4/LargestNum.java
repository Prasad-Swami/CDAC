import java.util.Scanner;
class LargestNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int arrNum[] = new int[5];

        for(int i = 0; i < 5; i++){
            arrNum[i] = sc.nextInt();
        }

        int largest = arrNum[0];

        for(int i = 0; i < 5; i++){
            if (arrNum[i] > largest){
                largest = arrNum[i];
            }
        }

        System.out.println("The Largest Num in Array is: "  + largest);

    }
}