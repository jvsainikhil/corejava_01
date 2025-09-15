package java_basictoadvance_4pillors;

class DifferentLaptop {
	 String model;
	 int price;

	 public String toString() {
	return "Hey"+ model+price;
		 }
}

public class InheritanceObjectClass {
	public static void main(String[] args) {
		DifferentLaptop obj = new DifferentLaptop();
		obj.model = "Lenova" ;
		obj.price = 10000;
		System.out.println(obj.toString()); // default it will take
		//output:java_basictoadvance_4pillors.DifferentLaptop@6be46e8f

	}
}
