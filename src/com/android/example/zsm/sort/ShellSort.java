package com.android.example.zsm.sort;

import com.zsm.sort.ShellSort;
import com.zsm.sort.Sorter;

/**  
 * Ï£¶û(Shell)ÅÅÐòËã·¨  
 * @author Administrator  
 *  
 * @param <T>  
 */  

public class ShellSort<T extends Comparable<T>> extends Sorter<T>{
	@Override
	public void sort(T[] array, int from, int len) {
		//System.out.println("a"); 
		int value =1;
		while((value+1)*2 < len){
			//System.out.println("b"); 
			value = (value+1)*2 - 1;
			//System.out.println(value); 
		}
		
		for(int delta=value;delta>=1;delta=(delta+1)/2-1){
			//System.out.println("c"); 
			for(int i=0;i<delta;i++){
				//System.out.println("d"); 
				invokeInsertionSort(array,from,len,delta);
			}
		}
		
	}
	
    private final void invokeInsertionSort(T[] array,int from,int len,int delta){
		//System.out.println("e"); 
		if(len<=1){
			//System.out.println("f"); 
			return;
		}
		 T tmp=null;
         for(int i=from+delta;i<from+len;i+=delta)
         {
			//System.out.println("g"); 
             tmp=array[i];
			 //System.out.println(tmp); 
             int j=i;
             for(;j>from;j-=delta)
             {
				//System.out.println("h"); 
                 if(tmp.compareTo(array[j-delta])<0)
                 {
					//System.out.println("i"); 
                     array[j]=array[j-delta];
                 }
                 else break;
             }
             array[j]=tmp;
         }
	}
  
  public static void main(String []args){
	Comparable []c={4,9,23,1,45,27,5,2,121,3121}; 
	ShellSort a = new ShellSort();
	//a.loveLJ();
	//hello.loveLJ();
	System.out.println("Hello");   
	
	a.sort(c,0,c.length);
	System.out.println("shellÅÅÐò£º");
	for(int i=0;i<c.length;i++){ 
		System.out.println(c[i]); 
	}
}
}  