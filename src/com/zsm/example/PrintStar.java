package com.zsm.example;

//打印金字塔图案

public class PrintStar{

public static void main(String args[]){

//int col = Integer.parseInt(args[0]);
int row=5;
for(int i=1;i<=row;i++){//i表示行数

//打印空格

for(int k=0;k<row-i;k++){

System.out.print(" ");

}

//打印星星

for(int m=0;m<2*i-1;m++){

System.out.print("*");

}

System.out.println();

}

}

}
