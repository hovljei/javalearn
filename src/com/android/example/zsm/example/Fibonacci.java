package com.android.example.zsm.example;

import com.zsm.example.Fibonacci;

public class Fibonacci{

	public static long value(long n){

		long a1 =1;  //a1��ֵ

		long a2 = 1;    //a2��ֵ

		long val=1;  //��һ��4���ɿ�����ĸΪ1 �ķ�ʽ���Ժ�ķ�ĸÿ�ε���2

		if(n==1 || n==2)
			return val;
		else
		{
		for (int i = 3; i <= n; i++){ //�����Ͼã�����ѭ���������ֻܶ࣬�Ǿ�ȷ��СЩ

		val = a1 + a2 ;

		a1=a2;    //ÿ����ӵı仯��+4����4��+4����4 ��.

		a2=val;    //��ĸ�ı仯��1��3��5��7�� ��.   ÿ��ݼ�2

		System.out.println(val);
		}
		return val;
		}
		}
	
	
public static void main(String[] args){
	//long val_n=Fibonacci.value(20);
	//System.out.println(val_n);
	
	Fibonacci val=new Fibonacci();
	System.out.println(val.value(40));
}



}
