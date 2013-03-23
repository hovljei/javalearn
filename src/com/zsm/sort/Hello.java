package com.zsm.sort;

public class Hello
{
	public static void loveLJ(){
		System.out.println("I");
		System.out.println("Relly");
		System.out.println("Love");
		System.out.println("Lj!!!");
	}
	
    public static void selectionSort(Comparable []data){
		int intLength = data.length; 
		for(int i=0;i<intLength-1;i++){ 
		 int minIndex = i; 
		 //Find smallest name 
		 for(int j=i+1;j<intLength;j++){ 
		  Comparable a = data[j]; 
		  Comparable b = data[minIndex]; 
			 if(a.compareTo(b)<0){ 
			  minIndex = j; 
			 }                     
		 } 
		 //Swap data if necessary 
		 if(minIndex!=i){ 
			Comparable temp = data[i]; 
			data[i] = data[minIndex]; 
			data[minIndex] = temp; 
		   } 
		}  
  } 
   
    public static void main(String []args){ 
		//hello a = new hello();
		//a.loveLJ();
		Hello.loveLJ();
		System.out.println("Hello");   
		Comparable []c={4,9,23,1,45,27,5,2,121,3121}; 
		Hello.selectionSort(c); 
		System.out.println("Ñ¡ÔñÅÅÐò£º"); 
		for(int i=0;i<c.length;i++){ 
			System.out.println(c[i]); 
		}
		Comparable []cc={4,9,23,1,45,27,5,2,121,3121}; 
		ShellSort a = new ShellSort();
		a.sort(cc,0,cc.length);
		System.out.println("shellÅÅÐò£º");
		for(int i=0;i<cc.length;i++){ 
			System.out.println(cc[i]); 
		}
   } 
} 
