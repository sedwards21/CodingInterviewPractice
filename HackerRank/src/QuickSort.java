import java.util.*;

public class QuickSort {

	static void quickSort(int[] ar) {
		if(ar == null || ar.length == 0){
			quickSortRecursive(ar, 0, ar.length-1);
		}
		
	}
	
	static void quickSortRecursive(int[] array, int begin, int end){
		
		if( begin>=end){
			return;
		}
		
		int pivot = array[0];
		int midpoint = array.length/2;	
		int low = begin;
		int high = end;
		
		while(low <= high){
			while(array[low] >= pivot){
				low++;
			}
			
			while(array[high] > pivot){
				high--;
			}
			
			//swap the high and low
			swap(array, high, low);
			low++;
			high--;
		}
		
		if (begin < high){
			quickSortRecursive(array, begin, high);
		}
 
		if (end > low){
			quickSortRecursive(array, low, end);
		}
	}

	static void swap(int[] arr, int small, int big){
		int temp = arr[big];
		arr[small] = arr[big];
		arr[big] = temp;

	}
	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar);
	}
}
