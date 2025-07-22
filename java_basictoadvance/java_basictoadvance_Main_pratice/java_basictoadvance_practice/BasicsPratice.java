package java_basictoadvance_practice;

class nikhil {
	String pen = "Big";
	String musels = "Big";
	int HeartBeat = 20;
	int RunningSpeed = 40;

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}

	public String getMusels() {
		return musels;
	}

	public void setMusels(String musels) {
		this.musels = musels;
	}

	public int getHeartBeat() {
		return HeartBeat;
	}

	public void setHeartBeat(int heartBeat) {
		HeartBeat = heartBeat;
	}

	public int getRunningSpeed() {
		return RunningSpeed;
	}

	public void setRunningSpeed(int runningSpeed) {
		RunningSpeed = runningSpeed;
	}

}

//class logic extends nikhil{
//	int add() {
//		return getHeartBeat() + getRunningSpeed();
//	}
//}

//✅ Define functional interface at top level OR make it accessible
interface Addable {
 int add();
}

public class BasicsPratice {
 public static void main(String[] args) {
     nikhil a = new nikhil();
     System.out.println("Muscles: " + a.getMusels());

     // ✅ Lambda expression assigned to Addable
     Addable b = () -> a.getHeartBeat() + a.getRunningSpeed();

     // ✅ Call the method and print result
     System.out.println("Sum using lambda: " + b.add());
 }
}
