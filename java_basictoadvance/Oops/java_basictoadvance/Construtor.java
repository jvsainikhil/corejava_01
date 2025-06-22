package java_basictoadvance;

class Human {
	private int age =30;
	private String name="nikhil";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Construtor {
	public static void main(String[] args) {
		Human a= new Human();
		System.out.println(a.getAge()+a.getName()+a.getClass());
		a.setAge(20);
		a.setName("nikhil");
		//System.out.println(a.getAge()+a.getName()+a.getClass());
	}
}
