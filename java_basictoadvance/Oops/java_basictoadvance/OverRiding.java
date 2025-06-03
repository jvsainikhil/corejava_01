package java_basictoadvance;

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cat meow");
	}
}

class Cow extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cat Amba");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		Animal myDog = new Dog(); // Polymorphism
		myDog.makeSound();        // Output: Dog barks

		Animal cat = new Cat();
		cat.makeSound();
		
		Animal Cow = new Cow();
		Cow.makeSound();
	}


}
