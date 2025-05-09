package com.test;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("from run()");
	}

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		Thread1 t3=new Thread1();
		System.out.println(t1.getName()+" "+t2.getName()+" "+t3.getName());
		t1.setName("Transfer");
		t2.setName("Credit");
		t3.setName("Debit");
		System.out.println(t1.getName()+" "+t2.getName()+" "+t3.getName());
		
		System.out.println(MAX_PRIORITY);
		System.out.println(NORM_PRIORITY);
		System.out.println(MIN_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		
		ThreadGroup tg1=new ThreadGroup("Bank");

	}

}
