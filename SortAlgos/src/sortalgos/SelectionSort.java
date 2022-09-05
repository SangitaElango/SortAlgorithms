package sortalgos;

import java.util.Arrays;

public class SelectionSort {
	public int[] selectionsort(int[] arr) {
		int temp,minIndex=0;
		for(int i=0;i<arr.length;i++) {
			minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		return arr;
	}
	public int randomRange(int min, int max) {
		int range = max - min;
		return (int)(Math.random()*range) + min;
	}
	public static void main(String[] args) {
		SelectionSort selectsort = new SelectionSort();
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i]=selectsort.randomRange(5,1000);
		}
		System.out.println(Arrays.toString(arr));
		arr=selectsort.selectionsort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
