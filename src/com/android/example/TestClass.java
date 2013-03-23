package com.android.example;

public class TestClass {
	int x;
	int y;

	static void showtest(TestClass tc) {
		System.out.println(tc.x + "  " + tc.y);
	}

	void seeit() {
		showtest(this);
	}

	public static void main(String[] args) {
		TestClass p = new TestClass();
		p.x = 9;
		p.y = 10;
		p.seeit();

	}

}
