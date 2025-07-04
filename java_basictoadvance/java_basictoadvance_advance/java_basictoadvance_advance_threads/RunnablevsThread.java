package java_basictoadvance_advance_threads;

class Z{
	
}

class Xx extends Z,Thread{
	public void run() {
		for(int i=1;i<=100;i++ )
		System.out.println("hi");
		try {
			Thread.sleep(100); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class Yy extends Thread{
	public void run() {
		for(int i=1;i<=100;i++ )
		System.out.println("hello");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}


public class RunnablevsThread {
	public static void main(String[] args) {
		X ab= new X();
		Y a= new Y();
		ab.start();
		a.start();
	}
}
