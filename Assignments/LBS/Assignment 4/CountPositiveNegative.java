import java.util.Scanner;
class CountPositiveNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num: ");
        int arrCount[] = new int[5];

        for (int i = 0; i < 5; i++){
            arrCount[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < 5; i++){
            if(arrCount[i] > 0){
                positiveCount += 1;
            }else if (arrCount[i] < 0) {
                negativeCount += 1;
            }else{
                System.out.println("This is Origin.");
            }
        }
        
        System.out.println("The Count of Positive Nums: " + positiveCount);
        System.out.println("The Count of Negative Nums: " + negativeCount);
    }
}