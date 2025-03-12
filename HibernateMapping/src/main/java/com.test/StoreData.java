package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String args[]) {
		//create configuration class object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//create SessionFactory object
		SessionFactory sf = cfg.buildSessionFactory();
		
		//create Session object
		Session session = sf.openSession();
		
		//transaction object
	    Transaction t = session.beginTransaction();
	    
	    //transient state
	    /*Address adr1=new Address();
	    adr1.setCity("Chennai");
	    adr1.setState("TN");
	    adr1.setCountry("India");
	    Employee emp1=new Employee();
	    emp1.setEmp_name("Rohit");
	    emp1.setEmp_email("rohit@gmail.com");
	    emp1.setAddress(adr1);
	    
	    adr1.setEmployee(emp1);*/
	    
	    
	    Skills skl1=new Skills();
	    skl1.setS_name("Spring");
	    Skills skl2=new Skills();
	    skl2.setS_name("Hibernate");
	    
	    List<Skills> listSkl=new ArrayList<>();
	    listSkl.add(skl1);
	    listSkl.add(skl2);
	    
	    Student std=new Student();
	    std.setStd_name("Rahul");
	    std.setSkills(listSkl);
	    
	    
	    //execute the object
	    session.save(std);  //persistent state
	    
	    t.commit();
	    
	    System.out.println("Done");
	    
	    //close session object
	    session.close(); //detached state
	    
		
		 
	}
	
	
	
	

}
