package java_basictoadvance_advance_threads;

// we wanted to print parallely 
class X extends Thread{
	public void run() {// run threads
		for(int i=1;i<=100;i++ )
		System.out.println("hi");
		try {
			Thread.sleep(100); // sleep ms
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//wanted to print parallely 
class Y extends Thread{
	public void run() { //run threads
		for(int i=1;i<=100;i++ )
		System.out.println("hello");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // sleep ms
	}
}


public class WhatareThreads {
	public static void main(String[] args) {
		X ab= new X();// we are making objects as threads
		Y a= new Y();// we are making objects as threads
		
		//printing priorityj
		//a.setPriority(Thread.MAX_PRIORITY); // we can only suggest 
		//System.out.println(ab.getPriority()); 
		// output:5 --->
		// The priority ranges from 1 to 10 ---> 5 is default
		
		ab.start();// this will call run method
		a.start();// this will call run method
	}
}
