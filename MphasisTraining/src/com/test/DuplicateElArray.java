package com.test;
import java.util.*;
public class DuplicateElArray {

	public static void main(String[] args) {
		int a[]= {15,22,3,43,3,25,6,22};
		int cnt=1;
		Arrays.sort(a);
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);           
				}
			}
		}
	}

}
