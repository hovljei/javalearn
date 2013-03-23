package com.zsm.example;

public class HelloWord1 {
	public static void main(String[] args) {
		Object s1 = new String("Hello");
		Object s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello";
		if (s1 == s2) {
			System.out.println("s1 and s2 are ==");
		} else if (s1.equals(s2)) {
			System.out.println("s1 and s2 are equals()");
		}

		if (s3 == s3) {
			System.out.println("s3 and s4 are ==");
		}
		if (s3.equals(s4)) {
			System.out.println("s3 and s4 are equals()");
		}
		String s = " Hello ";
		s += " World ";
		s.trim();
		System.out.println(s);

	}
}
