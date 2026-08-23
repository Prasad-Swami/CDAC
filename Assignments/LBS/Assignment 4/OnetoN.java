import java.util.Scanner;

class OnetoN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print(i+" ");
        }
    }
}