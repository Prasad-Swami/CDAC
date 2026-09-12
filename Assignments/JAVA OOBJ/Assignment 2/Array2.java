public class Array2 {
    public static void main(String[] args) throws Exception{
        System.out.println("The Size of Array: ");
        int size = Console.getInt();
        int arr[] = new int[size];
        System.out.println("Enter the Nums: ");
        for(int itmp = 0; itmp < size; itmp++){
            arr[itmp] = Console.getInt();
        }

        System.out.println("The Array is: ");
        for(int itmp = 0;itmp < size; itmp++){
            System.out.print(arr[itmp] + " ");
        }

        //sorting
        for(int itmp = 0; itmp < size - 1; itmp++){
            for(int jtmp = 0; jtmp < size - 1 -itmp; jtmp++){

                if(arr[jtmp] > arr[jtmp + 1]){
                    int temp = arr[jtmp];
                    arr[jtmp] = arr[jtmp + 1];
                    arr[jtmp + 1] = temp;
                }
            }
        }


        //System.out.println();
        System.out.println("The Array is: ");
        for(int itmp = 0;itmp < size; itmp++){
            System.out.print(arr[itmp] + " ");
        }
        
        System.out.println();

        //Sum
        float sum = 0;
        for(int iloop = 0; iloop < size; iloop ++){
            sum += arr[iloop];
        }
        System.out.println("The sum is: " + sum);

        //average value
        float avg = sum/size;
        System.out.println("The Average is: " + avg);

        //copy of array
        //new array
        int arr1[] = new int[size];

        for(int itmp = 0; itmp < size; itmp++){
            arr1[itmp] = arr[itmp];
        }

        for(int itmp = 0; itmp < size; itmp++){
            System.out.println(arr1[itmp]);
        }

        int max = arr[0];
        int min = arr[0];

        for(int itmp = 0; itmp < size; itmp++){
            if(arr[itmp] > max){
                max = arr[itmp];
            }

            if(arr[itmp] < min){
                min = arr[itmp];
            }
        }

        System.out.println("The Max Element is: " + max);
        System.out.println("The Min Element is: " + min);

        //Reverse the array
        int arrRev[] = new int[size];
        int count = 0;

        for(int itmp = size - 1;  itmp >= 0; itmp--){
            arrRev[count] = arr[itmp];
            count ++;
        }

        for(int itmp = 0; itmp < size; itmp++){
            System.out.println(arrRev[itmp]);
        }

        System.out.println();

        //To find duplicate values
        System.out.println("Duplicate elemts in array: ");
        for(int itmp = 0; itmp < size - 1; itmp++){
            for(int jtmp = 0; jtmp < size - 1 - itmp; jtmp++){
                if(arr[itmp] == arr[jtmp]){
                    System.out.println(arr[itmp]);
                    break;
                }
                
            }
        }

        //finding common element in two between array
        System.out.println("Common elements between two arrays: ");
        int arrB[] = new int[size];

        for(int itmp = 0; itmp < size; itmp++){
            arrB[itmp] = Console.getInt();
        }

        for(int itmp = 0; itmp < size; itmp++){
            for(int jtmp = 0; jtmp < size; jtmp++){
                if(arr[itmp] == arrB[jtmp]){
                    System.out.println("The Common element is: " + arr[itmp]);
                }
            }
        }

        }
    
}
