package java_basictoadvance;

public class ClassObject {
		// Class
	static class Car {
		String color;
		String model;
		int year;

		// Constructor
		Car(String color, String model, int year) {
			this.color = color;
			this.model = model;
			this.year = year;
		}

		// Method to display car details
		void displayDetails() {
			System.out.println("Car Model: " + model);
			System.out.println("Car Color: " + color);
			System.out.println("Car Year: " + year);
		}
	}

	public static void main(String[] args) {
		// Creating an object of the Car class
		Car myCar = new Car("Red", "Toyota", 2020);
		
		// Displaying car details
		myCar.displayDetails();
	}
}
