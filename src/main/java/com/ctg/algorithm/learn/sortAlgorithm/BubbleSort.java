package com.ctg.algorithm.learn.sortAlgorithm;

import java.util.Arrays;

public class BubbleSort {

	private static void sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {
				if (array[j] < array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		System.out.println(Arrays.toString(array));
	}

	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort(new int[] { 2, 1, 43, 21, 45, 63, 1, 2 });

	}

}
