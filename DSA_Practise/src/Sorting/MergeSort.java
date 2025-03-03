package Sorting;
import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int[] arr, int low, int high, int mid) {
		int i = low;
		int j = mid+1;
		int k=0;
		int[] temp = new int[high-low+1];
		
		while(i<=mid && j<=high) {
			if(arr[i]<=arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}
			else {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while(j<=high) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		for(int p=0; p<temp.length; p++) {
			arr[low+p] = temp[p];
		}
	}
	
	public static void mergeSort(int[] arr, int low, int high) {
		
		if(low>=high) {
			return;
		}
		
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, high, mid);
	}

	public static void main(String[] args) {
		
		int arr[] = {3, 1, 2, 4, 1, 5, 2, 6, 4};
		mergeSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
