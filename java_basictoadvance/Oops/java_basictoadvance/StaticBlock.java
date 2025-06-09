package java_basictoadvance;

class MobileNewBlock{
    String brand;        // Instance variable
    int price;           // Instance variable
    static String name;  // Static variable shared by all objects

    static { //static block will call only once
    	name ="phone";
    	System.out.println("static block will call only once");
    }
    
    // Non-static method (instance method)
    public void show() {
        System.out.println("brand=" + brand + ",\t price=" + price + ",\t name=" + name);
    }

    // Static method cannot directly access non-static variables
    public static void show1(MobileNewBlock obj) {
        // Accessing instance variables through object reference
        System.out.println("brand=" + obj.brand + ",\t price=" + obj.price + ",\t name=" + name);
    }
}

public class StaticBlock { // --> linked
    public static void main(String[] args) { // --> linked
        MobileNewBlock obj1 = new MobileNewBlock();
        obj1.brand = "Apple";
        obj1.price = 1500;
        MobileNewBlock.name= "Smartphone";
        
        MobileNewBlock obj2 = new MobileNewBlock();
        obj2.brand = "Nokia";
        obj2.price = 100;
        MobileNewBlock.name= "Smartphone";

        // Set static variable (shared across all objects)
        MobileNewBlock.name = "Phone";

        // Call static method with object reference
        MobileNewBlock.show1(obj1);

        // Call instance methods
        obj1.show();
        obj2.show();
    }
}
