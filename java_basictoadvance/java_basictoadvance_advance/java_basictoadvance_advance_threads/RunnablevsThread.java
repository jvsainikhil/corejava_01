package java_basictoadvance_advance_threads;


class Xx implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++ )
		System.out.println("hi");
		try {
			Thread.sleep(10); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class Yy implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++ )
		System.out.println("hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}


public class RunnablevsThread {
	public static void main(String[] args) {
		Runnable ab= new X();
		Runnable a= new Y();
		//ab.start();
		//a.start();
	    Thread t1 = new Thread(ab);
	    Thread t2 = new Thread(a);
	    t1.start();
	    t2.start();
	    
	}
}
