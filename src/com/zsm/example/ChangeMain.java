package com.zsm.example;

public class ChangeMain {

	public static void change(String str) {
		str = "abc";
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "123";
		change(str);
	}
}