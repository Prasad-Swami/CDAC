import java.util.Scanner;
public class Assign1 {
    static int[] findMinMax(int arr[]){
        if(arr.length > 0){
            int min = arr[0];
            int max = arr[0];
            for(int itmp = 0; itmp < arr.length; itmp++){
                if(min > arr[itmp]) min = arr[itmp];
                else if(max < arr[itmp]) max = arr[itmp];
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            return new int[]{max, min};
        }
        return null;
    }

    static int secondLargestNum(int arr[]){
        if(arr.length < 1)return arr[0];
        for(int itmp = 0; itmp < arr.length - 1; itmp++){
            for(int jtmp = itmp + 1; jtmp < arr.length; jtmp++){
                if(arr[itmp] > arr[jtmp]){
                    int temp = arr[itmp];
                    arr[itmp] = arr[jtmp];
                    arr[jtmp] = temp;
                }
            }
        } 
        //removing the Duplicates is Remaining
        return arr[arr.length - 2];
    }
    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int itmp = 0; itmp < size; itmp++){
            System.out.println("Enter the value:");
            arr[itmp] = scan.nextInt();
        }

        System.out.println(findMinMax(arr));
        System.out.println(secondLargestNum(arr));

        scan.close();
    }
}