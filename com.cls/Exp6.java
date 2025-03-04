package com.cls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exp6 {

	public static void main(String[] args) {
		List<Student> stdList=new ArrayList<>();
		stdList.add(new Student(5, "John", 20));
		stdList.add(new Student(4, "Alice", 22));
		stdList.add(new Student(3, "Bob", 25));
		stdList.add(new Student(2, "David", 27));
		stdList.add(new Student(1, "Kris", 29));
		
		List<Student> frmtData=stdList.stream().sorted(Comparator.comparing(Student :: getId)).collect(Collectors.toList());
		frmtData.forEach(emp->System.out.println("ID:"+emp.getId()+" Name:"+emp.getName()+" Age:"+emp.getAge()));
	}

}
class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	public Student() {
		
	}
	public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		return this.id-o.id;
	}
	
	
}