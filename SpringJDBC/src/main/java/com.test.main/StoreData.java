package com.test.main;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Customer;
import com.test.dao.CustDao;

public class StoreData {
	public static void main(String args[]) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Customer obj=new Customer();
		obj.setId(3);
		obj.setName("Rohit");
		obj.setType("Ocass");
		CustDao cst=ctx.getBean("custDao", CustDao.class);
//		cst.createCustomer(obj);
//		System.out.println("Done");
//		cst.updateCustomer(obj);
//		System.out.println("Done");
//		cst.deleteCustomer(obj);
		List<Customer> data=cst.getAllCustomers();
		for(Customer cstd : data) {
			System.out.println(cstd);
		}
	}

}
