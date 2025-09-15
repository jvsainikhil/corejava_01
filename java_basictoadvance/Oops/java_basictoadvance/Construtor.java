package java_basictoadvance;

class Human {
	private int age; // this will print 
	private String name;
	
	//constructor --> it is a special method
	//same name as a class name --> never return any thing 
	public Human() {
		//we can assign the values 
		//System.out.println("in constructor");
		age =12;
		name ="nikhil";// we can write the data base connection inside the constructor
	}
	
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
		Human a= new Human();// this line itself
		Human b= new Human();// this will call a constructor
		System.out.println(a.getName()+" : "+a.getAge());// this is taking a default values 
		System.out.println(b.getName()+" : "+b.getAge());
		//a.setAge(20);
		//a.setName("nikhil");
		//System.out.println(a.getAge()+a.getName()+a.getClass());
	}
	/* output:
	 * in constructor in constructor 0null
	 */

}
