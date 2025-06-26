package java_basictoadvance_Objects;

class Car{
//	public void drive() {
//		//not shure 
//	}
	public void drive();
	public void playMusic() {
		System.out.println("Play music");
	}
}

class WagonR extends Car{
	public void drive() {
		System.out.println("drive");
	}
}

public class AbstractKeyWord {
	public static void main(String[] args) {
		 Car obj = new Car();
		 obj.drive();
		 obj.playMusic();
	}
}
