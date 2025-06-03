package java_basictoadvance;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
}
//@FunctionalInterface
interface Animals {
    void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound();        // Output: Dog barks
        
        Animals cat = () -> System.out.println("cat barks");
        cat.makeSound();
    }
    
   
}
