package java_basictoadvance_practice;

// Data class
class nikhiljvs {
	int HeartBeat = 20;
	int RunningSpeed = 40;

	public int getHeartBeat() {
		return HeartBeat;
	}

	public int getRunningSpeed() {
		return RunningSpeed;
	}
}

// Functional Interfaces
@FunctionalInterface
interface Addable {
	int add();
}

@FunctionalInterface
interface Subtractable {
	int sub();
}

// Service Layer
class NikhilService {
	nikhiljvs n = new nikhiljvs();

	public int getSum() {
		Addable a = () -> n.getHeartBeat() + n.getRunningSpeed();
		return a.add();
	}

	public int getDifference() {
		Subtractable s = () -> n.getHeartBeat() - n.getRunningSpeed();
		return s.sub();
	}
}



// Main class
public class BasicPratice_Second {
	public static void main(String[] args) {
		NikhilService service = new NikhilService();

		System.out.println("Addition: " + service.getSum());
		System.out.println("Subtraction: " + service.getDifference());
	}
}
