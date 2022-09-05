package sortalgos;

import java.util.Arrays;

public class ShellSort {
	public static void shellsort(int[] arr) {
		for(int j = arr.length/2;j>=1;j=j/2) {
			for(int k=0;k<j;k++) {
				for(int i=k;i<arr.length;i=i+j) {
					int key = arr[i];
					while(i-j>=k&&key<arr[i-j]) {
						arr[i]=arr[i-j];
						i=i-j;
					}
					arr[i] = key;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=BubbleSort.randomRange(5,1000);
		}
		System.out.println(Arrays.toString(arr));
		shellsort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
