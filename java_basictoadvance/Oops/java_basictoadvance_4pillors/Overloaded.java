package java_basictoadvance_4pillors;

class CalculatorA {
    // Method with one parameter
    int add(int a) {
        return a + 20;
    }
    // Overloaded method with two parameters
    int add(int a, int b) {
        return a + b;
    }
    
 // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloaded {
    public static void main(String[] args) {
        CalculatorA utils = new CalculatorA();
        
        System.out.println(utils.add(5));         // Output: 15
        System.out.println(utils.add(5,10));
        System.out.println(utils.add(5,10,1));
        System.out.println(utils.add(5.4,10.3));
    }
}
