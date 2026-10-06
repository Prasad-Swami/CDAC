package in.cdac.dsa;

public class BubbleSort {
	public static void main(String[] args) {
		
		int array[] = {55,63,11,9,31,27,45};
		
		bubbleSort(array);
		
		for(int itmp : array) {
			System.out.print(itmp + " ");
		}
	}
	
	private static void bubbleSort(int array[]) {
		for(int itmp = 0; itmp < array.length - 1; itmp++) {
			for(int jtmp = 0; jtmp < array.length - itmp - 1; jtmp++) {
				if(array[jtmp] > array[jtmp + 1]) {
					int temp = array[itmp];
					array[jtmp] = array[jtmp + 1];
					array[jtmp + 1] = temp;
				}
			}
		}
	}
}
