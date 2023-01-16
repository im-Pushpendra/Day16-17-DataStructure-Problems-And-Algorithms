package com.bridgelabz.day16.UC_Day16and17_Datastructure;

import java.util.Scanner;

/*
 * Bubble Sort
a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
b. I/P -> read in the list ints
c. O/P -> Print the Sorted List
 */
public class BubbleSort {

	static void printSortedArray(int arr[]) {
		System.out.println();
		System.out.println("Ater sorting");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");// size of array
		int size = scan.nextInt();
		System.out.println("Enter elements of array");// enter inputs for array
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Before Sorting elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Bubble sort
		/*
		 * (arr.length-1) bcoz in bubble sort we compare elements in pairs like 0th and
		 * 1st index value, 1st and 2nd index value
		 */
		for (int i = 0; i < arr.length - 1; i++) {
			/*
			 * (arr.length-1-i) here i represents the number of sorted elements in the array
			 * 1st time i=0 no elements sorted 2nd time i=1 1 element is sorted . .
			 * 
			 */
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printSortedArray(arr);
	}

}
