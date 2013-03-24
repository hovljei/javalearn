package com.zsm.example;

class BirthDate {
	private int date;
	private int month;
	private int year;

	public BirthDate(int d, int m, int y) {
		date = d;
		month = m;
		year = y;
	}
}

public class TestStackAndHeap {
	public static int []arr={1,2,3};
	public static void main(String args[]) {

		int date = 9;
		TestStackAndHeap test = new TestStackAndHeap();
		test.change(date,arr);
		System.out.println(date);
		System.out.println(arr[2]);
	}

	public void change(int i,int []arr) {
		i = 1234;
		arr[2]=4;
	}
}