package java_basictoadvance;

class Man {
	
	private int age;  
	private String name;
	
	//default will set by java when object calls it will print
	public Man(){
    //java will say if you are not mentioning a constructor it will automatically set a constructor as a default one
		age= 12;
		name="Dinesh";
	}
	
	//paramatized constructor
	public Man(String name) {
		//super();
		this.age =50;// ------extra 
		this.name = name;
	}

	//paramatized constructor
	public Man(int age, String name) {
		//super();
		this.age = age;
		this.name = name;
	}
	
	//java will say if you are not mentioning a constructor it will automatically set a constructor as a default one 
//	public Man() { //if i want to passing a value 
//		//default constructor
//		age =25;
//		name ="Nikhil";
//	}
//	
//	public Man(int c, String n) {
//		// Parameterized constructor 
//		age=c;
//		name=n;
//	}

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
public class ParameterizedConstrutor {
	public static void main(String[] args) {
		Man a= new Man();
		Man b= new Man("nikhil");
		Man c= new Man(40,"King");
		//Man b= new Man(40,"Srikanth"); //we are passing this value
		System.out.println("Name: " +a.getName() +"\n"+"Age:  "+a.getAge());
		System.out.println("Name: " +b.getName() +"\n"+"Age:  "+b.getAge());
		System.out.println("Name: " +c.getName() +"\n"+"Age:  "+c.getAge());
		//System.out.println("Name: " +b.getName() +"\n"+"Age:  "+b.getAge());
		//System.out.println(b.getName()+" : "+b.getAge());	
	}
}
