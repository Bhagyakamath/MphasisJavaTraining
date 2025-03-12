package com.test;

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
	    Book b=new Book();
	    
	    b.setB_name("Spring");
	    b.setB_author("rodJ");
	    b.setB_price(123);
	    
	    //execute the object
	    session.save(b);  //persistent state
	    
	    t.commit();
	    
	    System.out.println("Done");
	    
	    //close session object
	    session.close(); //detached state
	    
		
		 
	}
	
	
	
	

}
