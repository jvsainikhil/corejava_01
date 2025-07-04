package java_basictoadvance_advance_threads;

class Count{
	int count;
	public synchronized void increament() {
		count++;
	}
}

public class RaceThreads {
	public static void main(String[] args) {
		Count c = new Count();
		Runnable ab = () -> {
			for (int i = 1; i <= 100; i++) {
				c.increament();
			}
		};
		
		Runnable a = () -> {
			for (int i = 1; i <= 100; i++) {
				c.increament();
			}
		};
		Thread t1 = new Thread(ab);
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
		
		// wait for a certain thread 
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Wait for t1 to finish
        try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Wait for t2 to finish
		
		System.out.println(c.count);
	}
}
