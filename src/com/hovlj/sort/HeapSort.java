package com.hovlj.sort;

public class HeapSort {
	public static void heapSort(int[] arr) {

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 56, 78, 2, 3, 67, 12, 15, 53, 42, 73, 41 };
		siftDown(arr);
		System.out.println(log2fp(16));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void heapToTree(int[] arr) {

	}

	public static void siftDown(int[] arr) {
		for (int i = 0; i <= Math.pow(2, log2fp(arr.length)); i++) {
			if (i * 2 + 1 > arr.length) {
				System.out.print(i * 2 + " exit");
			}
			if (i * 2 + 2 > arr.length) {
				System.out.print(i * 2 + " exit");
			}
			for (int j = 0; j < log2fp(arr.length) + 1; j++) {

				if (arr[i] < arr[2 * i + 1]) {
					swap(arr, i, 2 * i + 1);
				}
				if (arr[i] < arr[2 * i + 2]) {
					swap(arr, i, 2 * i + 2);
				}
			}
		}
	}

	public static void siftUp(int[] arr) {
	}

	public static void insert(int[] arr, int in_val) {
	}

	public static void delete(int[] arr, int del_val) {
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	private static final double log2div = Math.log(2);

	public static int log2fp(int bits) {
		if (bits == 0)
			return 0;
		// or throw exception
		return (int) (Math.log(bits & 0xffffffffL) / log2div);
	}

}
