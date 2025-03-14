package com.test.service;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.dao.*;
import com.test.model.*;

@Repository
@Service
public class EmployeeService implements EmployeeDao{
	private static Employees empData=new Employees();
	static {
		empData.getEmpList().add(new Employee(1, "Rohit", "ICC"));
		empData.getEmpList().add(new Employee(2, "Kohli", "ICC"));
		empData.getEmpList().add(new Employee(3, "Rahul", "BCCI"));
		empData.getEmpList().add(new Employee(4, "Dhoni", "ICC"));
		empData.getEmpList().add(new Employee(5, "Axar", "ICC"));
		empData.getEmpList().add(new Employee(6, "Pant", "BCCI"));
	}
	
	@Override
	public Employee createEmployee(Employee emp) {
		empData.getEmpList().add(emp);
		return emp;
	}
	
	@Override
	public List<Employee> readAllEmployees(){
		return empData.getEmpList();
	}
	
	@Override
	public String updateEmployee(Employee emp) {
		for(int i=0; i<empData.getEmpList().size(); i++) {
			Employee e=empData.getEmpList().get(i);
			if(e.getId().equals(emp.getId())){
				empData.getEmpList().set(i, emp);
			}
		}
		return "The given id is not available";
	}
	
	
	@Override
	public String deleteEmployee(Integer id) {
		for(int i=0; i<empData.getEmpList().size(); i++) {
			Employee e=empData.getEmpList().get(i);
			if(e.getId().equals(id)) {
				empData.getEmpList().remove(i);
			}
		}
		return "The given id is not available";
	}

}
