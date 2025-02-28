package com.test;
import java.util.*;
//POJO: Plain Old Java Object
public class Encapsulation {
	private int id;
	private String name;
	private int price;
	private int qnty;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setQnty(int qnty) {
		this.qnty=qnty;
	}
	public int getQnty() {
		return qnty;
	}
	

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		int id=sc.nextInt();
		e.setId(id);
		sc.nextLine();
		System.out.print("Enter name:");
		String name=sc.nextLine();
		e.setName(name);
		System.out.print("Enter price:");
		int price=sc.nextInt();
		e.setPrice(price);
		System.out.print("Enter quantity:");
		int qnty=sc.nextInt();
		e.setQnty(qnty);
		
		System.out.println();
		System.out.println("ID: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("Price: "+e.getPrice());
		System.out.println("Quantity: "+e.getQnty());

	}

}
