package com.android.example.zsm.example;

public class HelloWord2 {
	public static void main(String []args){ 
	Object s1 = "Hello";
	Object s2 = "Hello";
	if (s1 == s2) {
	 System.out.println("s1 and s2 are ==");
	} else if (s1.equals(s2)) {
	 System.out.println("s1 and s2 are equals()");
	}
	
	StringBuilder sb = new StringBuilder(" Hello ");
	sb.append(" World ");
	System.out.println(sb.toString().trim( ));
	}
}