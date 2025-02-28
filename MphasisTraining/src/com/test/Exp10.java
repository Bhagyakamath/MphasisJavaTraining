package com.test;

public class Exp10 {

	public static void main(String[] args) {
		//for loop
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		int a[]= {10,20,30,40,50};
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		int l=a.length;
		int x=0;
		
		//while loop
		while(x<l) {
			System.out.println(a[x]);
			x++;
		}
		int y=0;
		
		//do-while loop
		do {
			System.out.print(a[y]+" ");
			y++;
		}while(y<l);
		
		//for-each loop
		for(int j:a) {
			System.out.println(j);
		}

	}

}
