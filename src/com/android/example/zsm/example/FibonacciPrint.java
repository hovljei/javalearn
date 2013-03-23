package com.android.example.zsm.example;

import java.lang.Integer;

import com.zsm.example.FibonacciPrint;

//计算斐波那契数列(Fibonacci)的第n个值

//并把整个数列打印出来

public class FibonacciPrint {

	public static void main(String args[]) {

		int n = Integer.parseInt(args[0]);
		// int n = 20;

		FibonacciPrint t = new FibonacciPrint();

		for (int i = 1; i <= n; i++) {

			t.print(i);

		}
		System.out.println("args1: "+(String)args[1]);
		System.out.println("args2: "+(String)args[2]);
		System.out.println("args3: "+(String)args[3]);

	}

	public void print(int n) {

		int n1 = 1;// 第一个数

		int n2 = 1;// 第二个数

		int sum = 0;// 和

		if (n <= 0) {

			System.out.println("参数错误!");

			return;

		}

		if (n <= 2) {

			sum = 1;

		} else {

			for (int i = 3; i <= n; i++) {

				sum = n1 + n2;

				n1 = n2;

				n2 = sum;

			}

		}

		System.out.println(sum);

	}

}