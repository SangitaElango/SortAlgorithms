package sortalgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
	public static List<Integer> bucketSort(int[] arr){
		int max = findMax(arr);
		int numberOfBuckets = (int) Math.sqrt(arr.length);
		List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
		for(int i=0;i<numberOfBuckets;i++) {
			buckets.add(new ArrayList<>());
		}
		for(int i=0;i<arr.length;i++) {
		buckets.get(hash(arr[i],max,numberOfBuckets)).add(arr[i]);
		}
		for(List<Integer> bucket:buckets) {
			Collections.sort(bucket);
		}
		List<Integer> sortedArray = new ArrayList<>();
		for(List<Integer> bucket:buckets) {
			sortedArray.addAll(bucket);
		}
		return sortedArray;
	}

	

	public static int hash(int i, int max, int numberOfBuckets) {
		
		int hashCode = (int)((double)i/max*(numberOfBuckets-1));
		return hashCode;
	}



	public static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[50];
		for(int i=0;i<50;i++) {
			arr[i]=BubbleSort.randomRange(5,100000);
		}
		System.out.println(Arrays.toString(arr));
		List<Integer> sortArray = BucketSort.bucketSort(arr);
		for(Integer i: sortArray) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
