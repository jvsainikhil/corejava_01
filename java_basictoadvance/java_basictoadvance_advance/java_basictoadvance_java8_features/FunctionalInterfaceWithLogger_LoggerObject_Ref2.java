package java_basictoadvance_java8_features;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@FunctionalInterface
interface usecaseB {
    int add(int a, int b);
}

public class FunctionalInterfaceWithLogger_LoggerObject_Ref2 {
    private static final Logger logger = Logger.getLogger(FunctionalInterfaceWithLogger_LoggerObject_Ref2.class.getName());

    static {
        // Configure logger to use simple formatting and avoid red color
        logger.setLevel(Level.INFO);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.INFO);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setUseParentHandlers(false); // Turn off default red-colored console logs
    }

    public static void main(String[] args) {
        usecase sample = (a, b) -> {
            try {
                Thread.sleep(200); // simulate a delay
            } catch (InterruptedException e) {
                logger.warning("Thread interrupted");
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
