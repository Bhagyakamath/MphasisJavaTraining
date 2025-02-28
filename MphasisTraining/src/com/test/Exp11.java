package com.test;
import java.util.*;
public class Exp11 {

	public static void main(String[] args) {
		//for loop to print even numbers
		System.out.println("Even numbers:");
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//while loop to print odd numbers
		System.out.println("Odd numbers:");
		int j=1;
		while(j<=10) {
			if(j%2!=0) {
				System.out.println(j);
				j++;
			}
			else {
			j++;
			}
		}
		
		//Even or odd
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The number "+a+" is even");
		}
		else {
			System.out.println("The number "+a+" is odd");
		}

	}

}
