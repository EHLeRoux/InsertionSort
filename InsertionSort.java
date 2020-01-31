package Algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static int[] sort(int[] arr) {
		return sortHelper(arr, arr.length);
	}

	public static int[] sortHelper(int[] array, int iterations) {

		for (int i = 1; i < iterations; i++) {
			// Generating temporary integer for the element i in the array, 1,2,3,4,5,6...
			int temporary = array[i];
			// Creating a subsection of the array which is sorted
			int j = i;
			// looping through the array once, and loop backwards and swapping positions in the correct places 
			// literally insert the number in the sorted subsection of the list
			while (j > 0 && temporary < array[j - 1]) {

				array[j] = array[j - 1];
				j = j - 1; //have j keep track the number we want to insert
			}

			array[j] = temporary;
		}

		return array;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}

}
