package java_basictoadvance_advance_threads;


class X {
	public void show() {
		for(int i=1;i<=10;i++ )
		System.out.println("hi");
	}
}

class Y {
	public void show() {
		for(int i=1;i<=10;i++ )
		System.out.println("hello");
	}
}


public class WhatareThreads {
	public static void main(String[] args) {
		X ab= new X();
		Y a= new Y();
		ab.show();
		a.show();
	}
}
