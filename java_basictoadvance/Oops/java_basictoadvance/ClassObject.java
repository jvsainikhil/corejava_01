package java_basictoadvance;

//Define a class named Nikhil
class adf{
	int a = 10; // Instance variable
	int b = 20; // Instance variable
	public int abc() {
		int c= a+b; // This method returns the sum of a and b
		//System.out.println("Sum of a and b is: " + c);
		return c;
	}
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		int r=i+j;
		return r;
	}
}

class Nikhil {
	// Method inside the class
	void sayHello() {
		System.out.println("Hello World Nikhil");
	}
}

public class ClassObject {
	public static void main(String[] args) {
		// Create an object of Nikhil class
		Nikhil a = new Nikhil();
		// Call the method using the object
		a.sayHello();
		adf obj = new adf();
		//int result = obj.abc();
		int sum = obj.add(1,2);
		System.out.println("Sum of a and b is: " + "result" +""+sum);
	}

}

//---------------------------------------------------------------------------------------
// Class is a blueprint for creating objects
// Object is an instance of a class
// Class defines the properties and behavior of an object
// Object is created from a class
// Class is a template for creating objects
// Object is a real-world entity that has state and behavior
// Class is a user-defined data type
// Object is an instance of a class
// Class is a collection of objects
// Object is a collection of data and methods
//---------------------------------------------------------------------------------------
// JVM will create objects in java
// JVM creates an object of the class when we create an instance of the class
// JVM allocates memory for the object
// JVM initializes the object by calling the constructor of the class
// JVM calls the constructor of the class to initialize the object
// JVM calls the methods of the class to perform operations on the object
// JVM deallocates the memory for the object when it is no longer needed
// JVM uses garbage collection to deallocate memory for the object
// JVM uses a garbage collector to automatically deallocate memory for objects
//----------------------------------------------------------------------------------------
// Example of a class and object in Java
//		// Class
//	static class Car {
//		String color;
//		String model;
//		int year;
//
//		// Constructor
//		Car(String color, String model, int year) {
//			this.color = color;
//			this.model = model;
//			this.year = year;
//		}
//
//		// Method to display car details
//		void displayDetails() {
//			System.out.println("Car Model: " + model);
//			System.out.println("Car Color: " + color);
//			System.out.println("Car Year: " + year);
//		}
//	}
//
//	public static void main(String[] args) {
//		// Creating an object of the Car class
//		Car myCar = new Car("Red", "Toyota", 2020);
//		
//		// Displaying car details
//		myCar.displayDetails();
//	}