package com.zsm.example;

import java.lang.Integer;

/*4、输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值

 1  1  2  3  5  8  13  21  34

 规律：一个数等于前两个数之和*/

//计算斐波那契数列(Fibonacci)的第n个值 

public class Fibonacci1 {

	public static void main(String args[]) {

		int n = 20;

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
