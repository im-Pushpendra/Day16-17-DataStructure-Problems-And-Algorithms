package com.bridgelabz.day16.UC_Day16and17_Datastructure;

public class InsertionSort {
	static void printSortedArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 71, 8, 1, 13, 4 };
		/*
		 * consider that 0th index is sorted so we start our loop from 1st index and go
		 * till end using for loop.
		 */
		for (int i = 1; i < arr.length; i++) {
			/*
			 * consider array has 2 parts[sorted | unsorted] atfirst[0th(consider sorted)|
			 * rest of elements unsorted] take 1 element from unsorted part and compare with
			 * each sorted part element
			 */
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				// Keep swapping
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		printSortedArray(arr);
	}
}
