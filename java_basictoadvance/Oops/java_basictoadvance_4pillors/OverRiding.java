package java_basictoadvance_4pillors;

class Computer {
	//	public void makeSound() {
	//		System.out.println("Animal makes a sound");
	//	}
	public void playMusic()
	{
		System.out.println("Music Playing..");
	}
	public String getMEAPen(int cost) {
		if (cost>=10)
			return "Pen";
		else
			return "null";
	}
}
//class Dog extends Animal {
//	@Override
//	void makeSound() {
//		System.out.println("Dog barks");
//	}
//}
//
//class Cat extends Animal{
//	@Override
//	void makeSound() {
//		System.out.println("Cat meow");
//	}
//}
//
//class Cow extends Animal{
//	@Override
//	void makeSound() {
//		System.out.println("Cat Amba");
//	}
//}

public class OverRiding {
	public static void main(String[] args) {
		Computer obj =new Computer();
		String str = obj.getMEAPen(20);
		System.out.println(str);

		//		Animal myDog = new Dog(); // Polymorphism
		//		myDog.makeSound();        // Output: Dog barks
		//
		//		Animal cat = new Cat();
		//		cat.makeSound();
		//		
		//		Animal Cow = new Cow();
		//		Cow.makeSound();
	}


}
