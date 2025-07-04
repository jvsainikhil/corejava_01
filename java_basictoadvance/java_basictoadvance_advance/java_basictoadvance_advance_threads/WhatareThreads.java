package java_basictoadvance_advance_threads;

// wanted to print parallely 
class X extends Thread{
	public void run() {// run threads
		for(int i=1;i<=100;i++ )
		System.out.println("hi");
	}
}

//wanted to print parallely 
class Y extends Thread{
	public void run() { //run threads
		for(int i=1;i<=100;i++ )
		System.out.println("hello");
	}
}


public class WhatareThreads {
	public static void main(String[] args) {
		X ab= new X();// we are making objects as threads
		Y a= new Y();// we are making objects as threads
		ab.start();// this will call run method
		a.start();// this will call run method
	}
}
