package com.zsm.example;

/*PI��4��4/3+4/5-4/7����.

��ӡ����һ������ 3.1415С�� 3.1416��ֵ*/

 

class Pi {

public static void main(String[] args){

double pi =0;  //�����ʼֵ

double fenZi = 4;    //����Ϊ4

double fenMu = 1;  //��һ��4���ɿ�����ĸΪ1 �ķ�ʽ���Ժ�ķ�ĸÿ�ε���2

for (int i = 0; i < 1000000000; i++){ //�����Ͼã�����ѭ���������ֻܶ࣬�Ǿ�ȷ��СЩ

pi += (fenZi/fenMu) ;

fenZi *= -1.0;    //ÿ����ӵı仯��+4����4��+4����4 ��.

fenMu += 2.0;    //��ĸ�ı仯��1��3��5��7�� ��.   ÿ��ݼ�2

}

System.out.println(pi);

}

}