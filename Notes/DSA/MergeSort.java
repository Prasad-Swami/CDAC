package in.cdac.dsa;

public class MergeSort {
	//Divide
	public static void mergeSort(int arr[], int left, int right) {
		if(left < right) {
			int mid = left + (right - left)/2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}	
	}
	
	public static void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int itmp = 0; itmp < n1; itmp++) {
			L[itmp] = arr[left + itmp];
		}
		
		for(int itmp = 0; itmp < n2; itmp++) {
			R[itmp] = arr[mid + 1 + itmp];
		}
		
		int itmp = 0;
		int jtmp = 0;
		int ktmp = left;
		
		
		while(itmp < n1 && jtmp < n2) {
			if(L[itmp] <= R[jtmp]) {
				arr[ktmp++] = L[itmp++];
			}else {
				arr[ktmp++] = R[jtmp++];
			}
		}
		
		while(itmp < n1) {
			arr[ktmp++] = L[itmp++];
		}
		
		while(jtmp < n2) {
			arr[ktmp++] = R[jtmp++];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {55, 13, 7, 89, 54, 33, 77};
		
		mergeSort(arr, 0, arr.length -1);
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
