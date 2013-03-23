package com.android.example.zsm.example;

import com.zsm.example.Fibonacci;

public class Fibonacci{

	public static long value(long n){

		long a1 =1;  //a1的值

		long a2 = 1;    //a2的值

		long val=1;  //第一个4，可看作分母为1 的分式，以后的分母每次递增2

		if(n==1 || n==2)
			return val;
		else
		{
		for (int i = 3; i <= n; i++){ //运行老久，减少循环次数会快很多，只是精确度小些

		val = a1 + a2 ;

		a1=a2;    //每项分子的变化是+4，－4，+4，－4 ….

		a2=val;    //分母的变化是1，3，5，7， ….   每项递加2

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
