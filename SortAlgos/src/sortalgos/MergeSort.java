package sortalgos;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergesort(int[] arr,int length) {
		if(length>1) {
			int mid = length/2;
			int leftArray[] = new int[mid];
			int rightArray[] = new int[length-mid];
			for(int i=0;i<mid;i++) {
				leftArray[i] = arr[i];
			}
			for(int i=mid;i<length;i++) {
				rightArray[i-mid] = arr[i];
			}
			mergesort(leftArray,mid);
			mergesort(rightArray,length-mid);
			merge(arr,leftArray,rightArray);
		}
	}
	
	public static void merge(int[] arr,int[] leftArray,int[] rightArray) {
		int i = 0,j = 0,k = 0;
		while(i<leftArray.length && j<rightArray.length) {
			if(leftArray[i]<rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
				k++;
			}
			else {
				arr[k]=rightArray[j];
				j++;
				k++;
			}
		}
			while(j<rightArray.length) {
				arr[k]=rightArray[j];
				j++;
				k++;
			}
			while(i<leftArray.length) {
				arr[k]=leftArray[i];
				i++;
				k++;
			}
		//System.out.println(Arrays.toString(arr));
	}
	
	static void printArray(int arr[]) {
	    int n = arr.length;
	    for (int i = 0; i < n; ++i)
	      System.out.print(arr[i] + " ");
	    System.out.println();
	  }
	
	public static void main(String[] args) {
		SelectionSort selectsort = new SelectionSort();
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i]=selectsort.randomRange(5,1000);
		}
		System.out.println(Arrays.toString(arr));
		mergesort(arr,arr.length);
		printArray(arr);
		//System.out.println(Arrays.toString(arr));
	}

}
