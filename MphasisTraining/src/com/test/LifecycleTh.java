package com.test;

public class LifecycleTh extends Thread{
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
			System.out.println("run()");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) throws Exception {
		LifecycleTh t1=new LifecycleTh();
		System.out.println("Before startting thread state: "+t1.getState());
		System.out.println("Before startting thread state: "+t1.isAlive());
		t1.start();
		System.out.println("After startting thread state: "+t1.getState());
		System.out.println("After startting thread state: "+t1.isAlive());
		Thread.sleep(100);
		System.out.println("In sleep thread state: "+t1.getState());
		System.out.println("In sleep thread state: "+t1.isAlive());
		t1.join();
		System.out.println("After joining thread state: "+t1.getState());
		System.out.println("After joining thread state: "+t1.isAlive());
	}
}
