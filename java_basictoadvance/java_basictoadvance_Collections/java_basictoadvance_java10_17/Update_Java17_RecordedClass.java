package java_basictoadvance_java10_17;

import java.util.Objects;

class DataHolders{
	private final int id;
	private final String name;
	
	//To assign value we use constructor 
	public DataHolders(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//If we want to fetch the data or convert to jsonm we need to access it
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	//To frint all at once we use tostring
	public String toString() {
		return "DataHolders [id=" + id + ", name=" + name + "]";
	}

	//saying compare just the values don't compare memeory location
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataHolders other = (DataHolders) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}

public class Update_Java17_RecordedClass {

	public static void main(String[] args) {
		//Data Carrier Class
		//if we have come data for store purpose only 
		DataHolders a1= new DataHolders(1, "Nikhil");
		DataHolders a2= new DataHolders(1, "Nikhil");
		// --> 0, We want to get the values
		System.out.println(a1.equals(a2)); //output: False --> they are not same objects 2different object, because of values we are saying
		//Normal way -> bit we want all the values so for this --> 0
		/*var a = a1.getName();
		var b = a1.getId();
		System.out.println(b +" : "+ a);*/
		
	}

}
