package com.android.example;

public class Test1 {

	public static String changeStr(String str) {
		str = "welcome";
		return str;
	}

	public static void main(String[] args) {

		String str = "1234";

		str = changeStr(str);

		System.out.println(str);

	}

}
