package java_basictoadvance_Objects;

abstract class Car{ //-------|1 // abstract class can have implemented and non implemented methods
//	public void drive() {
//		//not shure 
//	}
	public abstract void drive();//-------|0,1 can create multiple 
	public abstract void fly(); // not derived 
	public void playMusic() {
		System.out.println("Play music");
	}
}

abstract class WagonR extends Car{ // every abstract shoud be implemented if you dont want we need to do abstract
	public void drive() {//--|0
		System.out.println("drive");
	}

//	@Override
//	public void fly() {
//		// TODO Auto-generated method stub
//	}
}

class updatedWagonR extends WagonR{  //concrete class onject can be used 

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly");
	}
	
}

public class AbstractKeyWord {
	public static void main(String[] args) {
		 Car obj = new updatedWagonR(); 
		 // abstract car cannot create object but we can use reference
		 obj.drive();
		 obj.playMusic();
		 obj.fly();
	}
}
