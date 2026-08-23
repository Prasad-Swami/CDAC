import java.util.Scanner;

class Multiof3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int rangeNum = sc.nextInt();
        for(int i = 1; i <= rangeNum; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}