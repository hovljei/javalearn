package com.zsm.example;

import java.lang.Math;

/*7、歌德巴赫猜想,任何一个大于六的偶数可以拆分成两个质数的和

 打印出所有的可能*/

//任何一个大于六的偶数可以拆分成两个质数的和

//打印出所有的可能

public class Gedebahe {

	public static void main(String args[]) {

		// int num = Integer.parseInt(args[0]);
		int num = 10;

		if (num <= 6) {

			System.out.println("参数错误!");

			return;

		}

		if (num % 2 != 0) {

			System.out.println("参数错误!");

			return;

		}

		Gedebahe g = new Gedebahe();
//		System.out.println("20 isPrime: " + g.isPrime(20));
		
		// 1不是质数,2是偶数,因此从3开始循环

		for (int i = 3; i <= num / 2; i++) {

			if (i % 2 == 0) {// 如果为偶数,退出本次循环

				continue;

			}

			// 当i与num-i都为质数时,满足条件,打印

			if (g.isPrime(i) && g.isPrime(num - i)) {

				System.out.println(i + " + " + (num - i) + " = " + num);

			}/*else{
				System.out.println(i+" isPrime "+g.isPrime(i)+";" +(num -i) + "isPrime"+g.isPrime(num - i));
			}*/

		}

	}

	/*
	 * public long method4(int num) { long bTime = System.currentTimeMillis();
	 * ArrayList<Integer> al = new ArrayList<Integer>(num>>1); //申请预计空间,避免扩容
	 * 
	 * for (int i = 2; i <= num; i++) { boolean ok = true; for (int t : al) { //
	 * 用已有质数集作判断,减少比较次数 if (i % t == 0) { ok = false; break; } if (t * t > i) {
	 * // 这句很关键,用小于其平方根的数整除 break; } } if (ok) { al.add(i); } }
	 * 
	 * return System.currentTimeMillis()-bTime; }
	 */

	public Boolean isPrime(int num) {
		/** * 一般求素数方法 * * @param args */
		boolean ok = true;
		int sqrt_floor=(int)(Math.sqrt(num));
		for (int i = 2; i <= sqrt_floor; i++) {
				if(num%i==0){
					ok = false;
					break;
					}
				}


		return ok;
	}
}