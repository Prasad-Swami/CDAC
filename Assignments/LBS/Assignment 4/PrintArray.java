import java.util.Scanner;

class PrintArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("The values of Arrays are: ");
        for(int i = 0; i < 5; i++){
            arr[i] =  sc.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.println("index " + i + " is " + arr[i]);
        }


    }
}