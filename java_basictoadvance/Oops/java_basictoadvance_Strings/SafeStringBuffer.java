package java_basictoadvance_Strings;

public class SafeStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

//        Runnable task = () -> {
//            for (int i = 0; i < 1000; i++) {
//                sb.append("a");
//            }
//        };
        
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // code here
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();

        try {
            t1.join(); 
            t2.join();
        } catch (InterruptedException e) {}

        System.out.println("StringBuffer length: " + sb.length()); // Always 2000
    }
}
/*
🔍 What is happening:
   - Same idea as before: Two threads add 'a' to a shared string.
   - But now, we're using StringBuffer, which is thread-safe.

✅ Solution:
   StringBuffer uses synchronized methods, which means:
   - Only one thread can access it at a time.
   - The other thread waits its turn.
   - This prevents interference and ensures 
     the final length is always 2000.
*/
