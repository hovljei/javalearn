package com.zsm.example;

import java.util.HashSet;
import java.util.Set;
public class RandomTest {
public static void main(String[] args) {
numTest();
}
static void numTest(){
Set set= new HashSet();
for(int i=0;i<10;i++){
while(true){
int num=(int) (Math.random()*100);
if(!set.contains(num)){
System.out.println(num);
set.add(num);
break;
}
}
}
}
}