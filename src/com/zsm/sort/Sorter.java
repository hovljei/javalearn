package com.zsm.sort;

/**
 * ÅÅĞò³éÏó»ù´¡Àà
 * @author Andy.Chen
 *
 * @param <T>
 */
public abstract class Sorter<T extends Comparable<T>> {
	
	public abstract void sort(T[] array,int from,int len);
	
	public final void sort(T[] array){
		sort(array,0,array.length);
	}
	
	protected final void swap(T[] array,int from,int to){
		T tmp = array[from];
		array[from] = array[to];
		array[to] = tmp;
	}

}