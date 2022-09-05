package sortalgos;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionsort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			for(int j = i-1;j>=0;j--) {
				if(key<arr[j]) {
					arr[j+1]=arr[j];
					arr[j]=key;
				}
			}
		}
	}
	public static void main(String[] args) {
		SelectionSort selectsort = new SelectionSort();
		MergeSort mergesort = new MergeSort();
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i]=selectsort.randomRange(5,1000);
		}
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		mergesort.printArray(arr);
		//System.out.println(Arrays.toString(arr));
	}

}
