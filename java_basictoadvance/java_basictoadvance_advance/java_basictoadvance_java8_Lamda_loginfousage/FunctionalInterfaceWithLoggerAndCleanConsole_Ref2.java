package java_basictoadvance_java8_Lamda_loginfousage;

import java.util.logging.Logger;

@FunctionalInterface
interface sampleusecase {
    int add(int a, int b);
}

public class FunctionalInterfaceWithLoggerAndCleanConsole_Ref2 {
    private static final Logger logger = Logger.getLogger(FunctionalInterfaceWithLoggerAndCleanConsole_Ref2.class.getName());

    public static void main(String[] args) {

        sampleusecase sample = (a, b) -> {
            try {
                Thread.sleep(200); // simulate delay
            } catch (InterruptedException e) {
                logger.warning("Thread interrupted");
            }
            return a + b;
        };

        long start = System.nanoTime();
        int result = sample.add(10, 10);
        long end = System.nanoTime();
        long durationInMs = (end - start) / 1_000_000;

        // Print final result in normal console color (non-red)
        System.out.println("===============");
        System.out.println("Result: " + result);
        System.out.println("Time Taken: " + durationInMs + " ms");
        System.out.println("===============");

        // Also log (these may appear red depending on IDE)
        logger.info("Logged Result: " + result);
        logger.info("Logged Time Taken: " + durationInMs + " ms");
    }
}
