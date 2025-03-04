package com.cls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Exp5 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(4, "Rohit", 1234));
		empList.add(new Employee(5, "Iyer", 1234));
		empList.add(new Employee(1, "Aditya", 1234));
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext()) {
			Employee emp=itr.next();
			System.out.println("ID:"+emp.getId()+" Name:"+emp.getName()+" Salary:"+emp.getSalary());
		}
		
		Collections.sort(empList);
		for(Employee emp:empList) {
			System.out.println("ID:"+emp.getId()+" Name:"+emp.getName()+" Salary:"+emp.getSalary());
		}
		
		Collections.sort(empList, new NameComparator());
		for(Employee emp:empList) {
			System.out.println("ID:"+emp.getId()+" Name:"+emp.getName()+" Salary:"+emp.getSalary());
		}
	}

}
class Employee implements Comparable<Employee>{
	public Employee() {
		
	}
	public Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	int id;
	String name;
	int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee [id=" +id+", name="+name+", salary="+salary+"]";
	}
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
}
class NameComparator implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
