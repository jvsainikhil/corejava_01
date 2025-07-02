package java_basictoadvance_java8_Lamda_loginfousage;

@FunctionalInterface
interface usecase {
    int add(int a, int b);
}

public class FunctionalInterfaceWithoutLogger_Ref2 {
    public static void main(String[] args) {

        usecase sample = (a, b) -> {
            try {
                Thread.sleep(200); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            return a + b;
        };

        long start = System.nanoTime();
        int result = sample.add(10, 10);
        long end = System.nanoTime();

        long durationInMs = (end - start) / 1_000_000;

        System.out.println("Result: " + result);
        System.out.println("Total Time Taken: " + durationInMs + " ms");
    }
}
