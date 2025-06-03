package java_basictoadvance;

class MathUtils {
    // Method with one parameter
    int add(int a) {
        return a + 10;
    }

    // Overloaded method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloaded {
    public static void main(String[] args) {
        MathUtils utils = new MathUtils();
        
        System.out.println(utils.add(5));         // Output: 15
        System.out.println(utils.add(5));
    }
}

