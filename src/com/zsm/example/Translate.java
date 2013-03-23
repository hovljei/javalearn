package com.zsm.example;

//import com.zsm.sort.Hello;
//import com.zsm.sort.ShellSort;

public class Translate {

public static String translate1(String str) {
String tempStr = "";
try {
tempStr = new String(str.getBytes("ISO-8859-1"), "GBK");
tempStr = tempStr.trim();
}
catch (Exception e) {
System.err.println(e.getMessage());
}
return tempStr;
}

public static void main(String []args){ 
/*	Translate.translate1("ab");
	System.out.println(Translate.translate1("abcdef"));
	System.out.println(Translate.translate1("123456"));
	System.out.println(Translate.translate1("×ÞÊ¤Ã·"));*/
	String abc=Translate.translate1("abcdef");
	String num=Translate.translate1("123456");
	String name=Translate.translate1("×ÞÊ¤Ã·");
	System.out.println(abc);
	System.out.println(num);
	System.out.println(name);
}
}