package in.cdac.dsa;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = {2,4,5,6,7,8,9};
		
		int index = binarySearch(array, 9);
		
		for(int itmp : array) {
			System.out.println(itmp + " ");
		}
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		}else {
			System.out.println("Element is not Found");
		}
	}
	
	private static int binarySearch(int array[], int target) {
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) /2;
			
			if(array[mid] == target) {
				System.out.println("Index is " + mid);
				return mid;
			}else if(array[mid] <  target) {
				low = mid + 1;
				//System.out.println("Index is: "+ low);
			}else {
				high = mid - 1;
				//System.out.println("Index is: "+ high);
			}	
		}
		return -1;
	}
}
