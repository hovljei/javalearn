package com.android.example.zsm.example;

class Sum{ 

public static void main(String[] args){

double sum=0;

double fenZi=2.0, fenMu=1.0;    //��ʼ�ķ��� (fenZi)��2����ĸ(fenMu)��1

for(int i=1; i<=20; i++){

sum += fenZi / fenMu ;

fenMu = fenZi;           //��һ��ķ�ĸ �� ��һ��ķ���

fenZi += fenMu;         //��һ��ķ��� �� ��һ��ķ��Ӽӷ�ĸ

}

System.out.println("sum= " + sum);

}
}