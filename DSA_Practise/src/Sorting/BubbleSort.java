package Sorting;
import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			boolean swapped = false;
			for(int j=0; j<(arr.length-i-1); j++) {
				int temp;
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {13, 46, 24, 52, 20, 9};
		bubbleSort(arr);
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}	
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
}
