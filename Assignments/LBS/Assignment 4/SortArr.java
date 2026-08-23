import java.util.Arrays;
import java.util.Scanner;

class Sortarr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 nums: ");
        int arrNum[] = new int[5];

        for (int i = 0; i < 5; i++){
            arrNum[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++){
            Arrays.sort(arrNum);
        }

        for(int num:arrNum){
            System.out.println(num);
        }
    }
}