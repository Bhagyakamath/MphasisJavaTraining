package com.test;
import java.util.Arrays;
import java.util.List;
public class ArrayDemo {

	public static void main(String[] args) {
		Integer a[]= {15,22,3,43,3,25,6};
		System.out.println("Before sorting: ");
		 for(int x:a) {
			 System.out.print(x+ " ");
		 }
		 System.out.println();
		 System.out.println("After sorting:");
		 Arrays.sort(a);
		 for(int y:a) {
			 System.out.print(y+" ");
		 }
		 System.out.println();
		 
		 //array to list
		 List<Integer> list=Arrays.asList(a);
		 Arrays.binarySearch(a, 20);

	}

}