import java.util.Scanner;

class PrintStringArr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Names: ");
        String names[] = new String[4];

        for(int i = 0; i < 4; i++){
            names[i] = sc.next();
            
        }

        System.out.println("The Names are: ");
        for(String x : names){
            System.out.println(x);
        }
    }
 }