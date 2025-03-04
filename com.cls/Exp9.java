package com.cls;

import java.util.HashSet;
import java.util.Objects;

public class Exp9 {

	public static void main(String[] args) {
		HashSet<Book> data=new HashSet<>();
		data.add(new Book(101, "Cricket", "Rohit", 12));
		data.add(new Book(102, "Cricket", "Rohit", 123));
		data.add(new Book(103, "Cricket", "Rohit", 13));
		data.add(new Book(104, "Cricket", "Rohit", 123));
		System.out.println(data);
		data.forEach(book->System.out.println(book.getId()+" "+book.getName()));
		data.forEach(x->System.out.println(x));
		
		System.out.println();
		data.parallelStream()
		.filter(bk->bk.getPrice()>=10 && bk.getPrice()<=20)
		.forEach(book->System.out.println(book.getId()+" "+book.getName()));
	}

}
class Book{
	private int id;
	private String name;
	private String author;
	private int price;
	public Book() {
		
	}
	public Book(int id, String name, String author, int price) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book[Id:"+id+" Name:"+name+" Author:"+author+" Price:"+price+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
	
}
