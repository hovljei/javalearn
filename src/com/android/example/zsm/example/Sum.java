package com.android.example.zsm.example;

class Sum{ 

public static void main(String[] args){

double sum=0;

double fenZi=2.0, fenMu=1.0;    //初始的分子 (fenZi)＝2，分母(fenMu)＝1

for(int i=1; i<=20; i++){

sum += fenZi / fenMu ;

fenMu = fenZi;           //下一项的分母 ＝ 上一项的分子

fenZi += fenMu;         //下一项的分子 ＝ 上一项的分子加分母

}

System.out.println("sum= " + sum);

}
}