package com.android.example.zsm.example;

import com.zsm.example.LetterPrinter;
import com.zsm.example.NumberPrinter;
import com.zsm.example.Printer;

class Test2{

public static void main(String[] args) {

Printer p = new Printer();

Thread t1 = new NumberPrinter(p);

Thread t2 = new LetterPrinter(p);

t1.start();

t2.start();

}

}

class Printer{

private int index = 1;//设为1，方便计算3的倍数

//打印数字的构造方法，每打印两个数字，等待打印一个字母

public synchronized void print(int i){

while(index%3==0){try{wait();}catch(Exception e){}}

System.out.print(" "+i);

index++;

notifyAll();

}

//打印字母，每打印一个字母，等待打印两个数字

public synchronized void print(char c){

while(index%3!=0){try{wait();}catch(Exception e){}}

System.out.print(" "+c);

index++;

notifyAll();

}

}

//打印数字的线程

class NumberPrinter extends Thread{

private Printer p;

public NumberPrinter(Printer p){this.p = p;}

public void run(){

for(int i = 1; i<=52; i++){

p.print(i);

}

}

}

//打印字母的线程

class LetterPrinter extends Thread{

private Printer p;

public LetterPrinter(Printer p){this.p = p;}

public void run(){

for(char c='A'; c<='Z'; c++){

p.print(c);

}

}

}

/*如果这题中，想保存需要打印的结果，可在Printer类里定义一个成员变量

String s = “”; //不写“”的话是null，null跟没有东西是不一样的，它会把null当成字符 =_=

然后在两个print()方法里面，while循环后分别加上 s = s + ” “+i; 以及 s = s +” “+ c;*/