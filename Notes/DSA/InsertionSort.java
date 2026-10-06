package in.cdac.dsa;

public class InsertionSort {
	public static void main(String[] args) {
		int array[] = {6, 3, 55, 23, 76, 21, 85, 11, 7};
		
		insertionSort(array);
		
		for(int arr: array) {
			System.out.print(arr + " ");
		}
	}
	
	private static void insertionSort(int [] array) {
		for(int itmp = 0; itmp < array.length; itmp++) {
			int temp = array[itmp];
			int jtmp  = itmp - 1;
			
			while(jtmp >= 0 && array[jtmp] > temp){
				array[jtmp + 1] = array[jtmp];
				jtmp--;
			}
			array[jtmp + 1] = temp;
		}
	}
}
