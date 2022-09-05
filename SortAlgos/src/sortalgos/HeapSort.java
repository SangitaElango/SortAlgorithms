package sortalgos;

import java.util.Arrays;

public class HeapSort {
	
	public static void heapSort(int[] arr) {
		int n = arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(i,n,arr);
		}
		
		for(int i=n-1;i>0;i--) {
			int swap = arr[i];
			arr[i] = arr[0];
			arr[0] = swap;
			
			heapify(0,i,arr);
		}
	}

	private static void heapify(int i,int n,int[] arr) {
		int largest = i;
		int leftChild = (2*i)+1;
		int rightChild = (2*i)+2;
		if(leftChild<n && arr[largest]<arr[leftChild]) {
			largest = leftChild;
		}
		if(rightChild<n && arr[largest]<arr[rightChild]) {
			largest = rightChild;
		}
		if(largest!=i) {
			int swap = arr[largest];
			arr[largest] = arr[i];
			arr[i]=swap;
			
			heapify(largest,n,arr);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i]=BubbleSort.randomRange(5,100);
		}
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
