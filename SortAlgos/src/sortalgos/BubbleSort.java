package sortalgos;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	public int[] bubbleSort(int arr[]) {
		int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	return arr;
	}
	
	public static int randomRange(int min, int max) {
		int range = max - min;
		return (int)(Math.random()*range) + min;
	}
	
	public static void main(String[] args) {
		BubbleSort bsort = new BubbleSort();
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i]=randomRange(5,100000);
		}
		System.out.println(Arrays.toString(arr));
		arr=bsort.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
