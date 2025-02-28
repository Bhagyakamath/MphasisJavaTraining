package com.test;

public class Student {

	public static void main(String[] args) {
		Student1 obj=new Student1();
		obj.setId(101);
		obj.setName("Rohit");
		Student1 obj2=new Student1(201, "Rahul");
		Student1[] stdData= {obj, obj2};
		for(int i=0; i<stdData.length; i++) {
			System.out.println(stdData[i]);
		}
		for(Student1 obj3:stdData) {
			System.out.println(obj3);
		}

	}

}
class Student1{
	public Student1() {
		
	}
	public Student1(int id, String name) {
		this.id=id;
		this.name=name;
	}
	private int id;
	private String name;
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
	public String toString() {
		return "Student[id="+id+", name="+name+"]";
	}
	
}
