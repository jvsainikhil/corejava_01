package java_basictoadvance_Strings;

public class UnsafeStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

//        Runnable task = () -> { // lambda expression
//            for (int i = 0; i < 1000; i++) {
//                sb.append("a");
//            }
//        };
        
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    sb.append("a");
                }
            }
        };

        Thread t1 = new Thread(task); //started
        Thread t2 = new Thread(task); //started
        t1.start(); t2.start();

        try {
            t1.join(); t2.join();
        } catch (InterruptedException e) {}

        System.out.println("StringBuilder length: " + sb.length()); // May be < 2000 due to race conditions
    }
}

/*
🔍 What is happening:
- We create a StringBuilder object sb.
- Two threads (t1 and t2) are started, 
  both trying to add 1000 'a' characters to sb.
- Ideally, sb.length() should be 2000 (1000 from each thread).

❌ Problem:
- StringBuilder is not thread-safe, 
  so when two threads try to change it at the same time, 
  they interfere with each other.

This may cause:
- Some characters not being added
- The final length being less than 2000
- Random bugs or data corruption

This is called a race condition.
*/



