package in.cdac.dsa;

public class SelectionSort {
	public static void main(String[] args) {
		int array[] = {8, 4, 9, 7, 10, 1};
		
		selectionSort(array);
		
		for(int itmp : array) {
			System.out.print(itmp + " ");
		}
	}
	
	private static void selectionSort(int array[]) {
		for(int itmp = 0; itmp < array.length; itmp++) {
			int min = itmp;
			for(int jtmp = itmp + 1; jtmp < array.length; jtmp++) {
				if(array[min] > array[jtmp]) {
					min = jtmp;
				}
			}
			int temp = array[itmp];
			array[itmp] = array[min];
			array[min] = temp;
		}
	}
}
