package java_basictoadvance;

class Calculator {
    // Method with one parameter
    int add(int a) {
        return a + 20;
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
        Calculator utils = new Calculator();
        
        System.out.println(utils.add(5));         // Output: 15
        System.out.println(utils.add(5,10));
        System.out.println(utils.add(5.4,10.3));
    }
}

