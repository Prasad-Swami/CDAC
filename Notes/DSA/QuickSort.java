package in.cdac.dsa;

public class QuickSort {
	public static void main(String[] args) {
		int array[] = {8, 2, 5, 3, 9, 4, 7, 6, 1};
		
		quickSort(array, 0, array.length - 1);
		
		for(int itmp : array) {
			System.out.print(itmp + " ");
		}
	}
	
	private static void quickSort(int[] array, int start, int end) {
		if(end <= start) {
			return;
		}
		
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);
	}
	
	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int itmp = start - 1;
		for(int jtmp = start; jtmp <= end; jtmp++) {
			if(array[jtmp] < pivot) {
				itmp++;
				int temp = array[itmp];
				array[itmp] = array[jtmp];
				array[jtmp] = temp;
			}
		}
		itmp++;
		int temp = array[itmp];
		array[itmp] = array[end];
		array[end] = temp;
		return itmp;
	}
}
