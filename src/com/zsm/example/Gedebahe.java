package com.zsm.example;

import java.lang.Math;

/*7����°ͺղ���,�κ�һ����������ż�����Բ�ֳ����������ĺ�

 ��ӡ�����еĿ���*/

//�κ�һ����������ż�����Բ�ֳ����������ĺ�

//��ӡ�����еĿ���

public class Gedebahe {

	public static void main(String args[]) {

		// int num = Integer.parseInt(args[0]);
		int num = 10;

		if (num <= 6) {

			System.out.println("��������!");

			return;

		}

		if (num % 2 != 0) {

			System.out.println("��������!");

			return;

		}

		Gedebahe g = new Gedebahe();
//		System.out.println("20 isPrime: " + g.isPrime(20));
		
		// 1��������,2��ż��,��˴�3��ʼѭ��

		for (int i = 3; i <= num / 2; i++) {

			if (i % 2 == 0) {// ���Ϊż��,�˳�����ѭ��

				continue;

			}

			// ��i��num-i��Ϊ����ʱ,��������,��ӡ

			if (g.isPrime(i) && g.isPrime(num - i)) {

				System.out.println(i + " + " + (num - i) + " = " + num);

			}/*else{
				System.out.println(i+" isPrime "+g.isPrime(i)+";" +(num -i) + "isPrime"+g.isPrime(num - i));
			}*/

		}

	}

	/*
	 * public long method4(int num) { long bTime = System.currentTimeMillis();
	 * ArrayList<Integer> al = new ArrayList<Integer>(num>>1); //����Ԥ�ƿռ�,��������
	 * 
	 * for (int i = 2; i <= num; i++) { boolean ok = true; for (int t : al) { //
	 * ���������������ж�,���ٱȽϴ��� if (i % t == 0) { ok = false; break; } if (t * t > i) {
	 * // ���ܹؼ�,��С����ƽ������������ break; } } if (ok) { al.add(i); } }
	 * 
	 * return System.currentTimeMillis()-bTime; }
	 */

	public Boolean isPrime(int num) {
		/** * һ������������ * * @param args */
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