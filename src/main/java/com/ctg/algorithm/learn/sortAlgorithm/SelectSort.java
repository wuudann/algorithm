package com.ctg.algorithm.learn.sortAlgorithm;

import java.util.Arrays;

public class SelectSort {

	private static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			swap(array, i, min);
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
