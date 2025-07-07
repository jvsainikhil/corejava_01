package java_basictoadvance_java10_17;

import java.util.Objects;

//---> THIS HOLDS DATA
/*class DataHolder{ 
	private final int id;
	private final String name;
	
	//To assign value we use constructor 
	public DataHolder(int id, String name) {
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
		DataHolder other = (DataHolder) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}
*/

// we have no default constructor
// we got all the object and it is true Simple One with out doing the top methods 
record DataHolder(int id, String name) {
	//not recomended ----------> _01_Changing behaviour 
//	public DataHolder() {
//		this(0," "); // called another constructor
//		
//	}
	//Canoninical constructor
	public DataHolder(int id, String name) {
		//pre check If we want to throw exception
		if(id ==0)
			throw new IllegalArgumentException("Id cannot be zero");
		
		this.id = id;
		this.name = name;
	}
}

public class Update_Java17_RecordedClass_Easy17 {

	public static void main(String[] args) {
		//Data Carrier Class
		//if we have come data for store purpose only 
		DataHolder a1= new DataHolder(0, "Nikhil");
		DataHolder a2= new DataHolder(1, "Nikhil");
		//if some once sends 0
		//To change the behaviour of constructor --> default constructor
		//DataHolder a3= new DataHolder(); //----------> _01_Changing behaviour 
		// we cannot change the data
		//System.out.println(a3);
		System.out.println(a1.equals(a2)); 
		System.out.println(a1);
	}
}

//output: False --> they are not same objects 2different object, because of values we are saying
// --> 0, We want to get the values
//Normal way -> bit we want all the values so for this --> 0
/*var a = a1.getName();
		var b = a1.getId();
		System.out.println(b +" : "+ a);*/