package com.ctg.algorithm.learn.sortAlgorithm;

import java.util.Arrays;

public class InsertSort {

	private static void sort(int[] array) {
		for (int i = 0; i < array.length; i++)
			for (int j = i - 1; j >= 0 && array[j + 1] < array[j]; j--) {
				swap(array, j + 1, j);
			}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort(new int[] { 2, 1, 43, 21, 45, 63, 1, 2 });
	}

	private static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
