import java.util.Scanner;

class EvenNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num: ");
        int num = sc.nextInt();
        System.out.println("The Even nums are: ");
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}