package com.android.example;

public class BubbleSort {
	public static void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

	}

	public static void main(String[] args) {
		int T[] = { 1, 23, 454, 678, 32, 124, 56, 34, 32, 56, 76 };
		BubbleSort(T);
		for (int i = 0; i < T.length; i++)
			System.out.println(T[i]);

	}
}
