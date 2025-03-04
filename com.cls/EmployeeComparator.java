package com.cls;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeComparator {
	public static void main(String args[]) {
		List<Employee1> empList=new ArrayList<>();
		empList.add(new Employee1(4, "Rohit", 20, "M", 2020));
		empList.add(new Employee1(5, "Iyer", 35, "M", 2021));
		empList.add(new Employee1(1, "Aditya", 25, "M", 2019));
		empList.add(new Employee1(1, "Nayana", 25, "F", 2023));
		Iterator<Employee1> itr=empList.iterator();
		while(itr.hasNext()) {
			Employee1 emp=itr.next();
			System.out.println("ID:"+emp.getId()+" Name:"+emp.getName()+" Age:"+emp.getAge()+" Gender:"+emp.getGender()+" Year of Joining:"+ emp.getYoj());
		}
		System.out.println();
		Collections.sort(empList);
		for(Employee1 emp:empList) {
			System.out.println("ID:"+emp.getId()+" Name:"+emp.getName()+" Age:"+emp.getAge()+" Gender:"+emp.getGender()+" Year of Joining:"+ emp.getYoj());
		}
		System.out.println();
		empList.stream().filter(emp ->emp.getName().startsWith("R")).forEach(emp->System.out.println(emp.getName()));
		System.out.println();
		empList.stream().filter(emp -> emp.getYoj().isAfter(Year.of(2020))).forEach(emp -> System.out.println(emp.getName()));
		System.out.println();
		List<Employee1> newList=empList.stream().sorted(Comparator.comparing(Employee1 :: getName)).collect(Collectors.toList());
		newList.forEach(emp->System.out.println("ID:"+emp.getId()+" Name:"+emp.getName()+" Age:"+emp.getAge()+" Gender:"+emp.getGender()+" Year of Joining:"+ emp.getYoj()));
		
		
	}
}
class Employee1 implements Comparable<Employee1>{
	private int id;
	private String name;
	private int age;
	private String gender;
	private Year yoj;
	public Employee1() {
		
	}
	public Employee1(int id, String name, int age, String gender, int yoj) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.yoj=Year.of(yoj);
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Year getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = Year.of(yoj);
	}
	@Override
	public int compareTo(Employee1 o) {
		
		return this.id-o.id;
	}
	
}