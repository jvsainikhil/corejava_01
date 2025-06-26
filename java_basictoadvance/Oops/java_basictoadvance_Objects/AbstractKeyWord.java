package java_basictoadvance_Objects;

abstract class Car{
//	public void drive() {
//		//not shure 
//	}
	public abstract void drive();
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
		 Car obj = new WagonR(); 
		 // abstract car cannot create object but we can use reference
		 obj.drive();
		 obj.playMusic();
	}
}
