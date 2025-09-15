package java_basictoadvance;

class MobileNewABC {
    String brand;        // Instance variable
    int price;           // Instance variable
    static String name;  // Static variable shared by all objects

    // Non-static method (instance method)
    public void show() {
        System.out.println("brand=" + brand + ",\t price=" + price + ",\t name=" + name);
    }

    // Static method cannot directly access non-static variables
    public static void show1(MobileNewABC obj) {
        // Accessing instance variables through object reference
        System.out.println("brand=" + obj.brand + ",\t price=" + obj.price + ",\t name=" + name);
    }
}

public class StaticMethods { // --> linked
    public static void main(String[] args) { // --> linked
        MobileNewABC obj1 = new MobileNewABC();
        obj1.brand = "Apple";
        obj1.price = 1500;
        MobileNewABC.name= "Smartphone";
        
        MobileNewABC obj2 = new MobileNewABC();
        obj2.brand = "Nokia";
        obj2.price = 100;
        MobileNewABC.name= "Smartphone";

        // Set static variable (shared across all objects)
        MobileNewABC.name = "Phone";

        // Call static method with object reference
        MobileNewABC.show1(obj1);

        // Call instance methods
        obj1.show();
        obj2.show();
    }
}
