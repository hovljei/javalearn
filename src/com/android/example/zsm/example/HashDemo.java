package com.android.example.zsm.example;

public class HashDemo {
	public static void main(String args[]) {
		// String h = "32768";
		int hash = 61440;
		hash ^= (hash >>> 20) ^ (hash >>> 12);
		int h1 = hash ^ (hash >>> 7) ^ (hash >>> 4);
		System.out.println(h1);
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

}
