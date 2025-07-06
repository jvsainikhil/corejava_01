package java_basictoadvance_java10_17;

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
}

public class Update_Java17_RecordedClass {

	public static void main(String[] args) {
		//Data Carrier Class
		//if we have come data for store purpose only 
		DataHolders a1= new DataHolders(1, "Nikhil");
		// --> 0, We want to get the values
		System.out.println(a1);
		//Normal way -> bit we want all the values so for this --> 0
		/*var a = a1.getName();
		var b = a1.getId();
		System.out.println(b +" : "+ a);*/
		
	}

}
