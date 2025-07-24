package java_basictoadvance_exception;
class Resource {
    // finalize() is called by the garbage collector before object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called before object is garbage collected");
        super.finalize();
    }
}

public class FinalDemo {

    public static void main(String[] args) {
        // final keyword: variable value can't be changed
        final int num = 10;
        System.out.println("Final variable: " + num);

        Resource res = new Resource();

        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // this will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // finally block always executes
            System.out.println("finally block executed");
        }

        // Set object reference to null and suggest garbage collection
        res = null;
        System.gc(); // Suggest JVM to run Garbage Collector

        System.out.println("End of main method");
    }
}
