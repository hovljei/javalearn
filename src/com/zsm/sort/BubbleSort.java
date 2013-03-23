package com.zsm.sort;

public class BubbleSort {
	public static void BubbleSort(Comparable []arr) {
		int len = arr.length;
		for (int i=0;i<len-1;i++){
			for(int j=len-1;j>i;j--){
				Comparable a = arr[j];
				Comparable b = arr[j-1];
				Comparable tmp = 0;
				if(a.compareTo(b) < 0){
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Comparable []T = {1,23,454,678,32,124,56,34,32,56,76};
		BubbleSort(T);
		for (int i=0;i<T.length;i++){
			System.out.println(T[i]);
		}
	}

}
