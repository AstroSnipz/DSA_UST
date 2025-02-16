package Sorting;
import java.util.Arrays;

public class QuickSort {
	
	static void swap(int[] arr, int i, int j){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while(i<j) {
			while(arr[i]<=pivot && i<=high) {
				i++;
			}
			
			while(arr[j]>pivot && j>=low) {
				j--;
			}
			if(i<j) {
				swap(arr, i, j);
			}
		}
		
		swap(arr, low, j);
		return j;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int partition_idx = partition(arr, low, high);
			quickSort(arr, low, partition_idx-1);
			quickSort(arr, partition_idx+1, high);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
		quickSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array: " + Arrays.toString(arr));	
	}
}
