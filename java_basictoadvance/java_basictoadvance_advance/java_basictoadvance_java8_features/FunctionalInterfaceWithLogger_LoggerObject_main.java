package java_basictoadvance_java8_features;

import java.util.logging.Logger;

@FunctionalInterface
interface usecaseA {
    int add(int a, int b);
}

public class FunctionalInterfaceWithLogger_LoggerObject_main {
    private static final Logger logger = Logger.getLogger(FunctionalInterfaceWithLogger_LoggerObject_main.class.getName());

    public static void main(String[] args) {

        sampleusecase sample = (a, b) -> {
            try {
                Thread.sleep(200); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Exception");
            }
            return a + b;
        };

        long start = System.nanoTime();
        int result = sample.add(10, 10);
        long end = System.nanoTime();

        long durationInNs = end - start;
        long durationInMs = durationInNs / 1_000_000;

        logger.info("Result: " + result);
        logger.info("Start Time (ns): " + start);
        logger.info("End Time (ns): " + end);
        logger.info("Total Time Taken: " + durationInMs + " ms");
    }
}
