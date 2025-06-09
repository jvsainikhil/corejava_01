package java_basictoadvance;

//--> we are targeting to call class with out an object <--
class MobilePhone {
    String brand;        // Instance variable
    int price;           // Instance variable
    static String name;  // Static variable shared by all objects

    // Static block
    static {
        name = "Phone";
        System.out.println("Static Block: name=" + name);
    }

    // Constructor
    public MobilePhone() {
        brand = "";
        price = 200;
        System.out.println("Constructor called");
    }

    // Non-static method (instance method)
    public void show1() {
        System.out.println("brand=" + brand + ",\t price=" + price + ",\t name=" + name);
    }
}

public class ClassClassfile {

    public static void main(String[] args) throws ClassNotFoundException {
        // Calling static block using reflection
    	// This will load the class and execute static blocks
        Class.forName("java_basictoadvance.MobilePhone");
        // This will load the class WITHOUT initializing (static block WON'T execute)
        Class.forName("java_basictoadvance.MobilePhone", false, ClassLoader.getSystemClassLoader());
    }
}

	
