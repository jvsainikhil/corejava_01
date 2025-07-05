package java_basictoadvance_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	//this and that
	public int compareTo(Student that) {
		if (this.age > that.age)
			return 1;
		else
			return -1;
	}
	
}

public class CompatorvsComparableExample2 {
	public static void main(String[] args) {
		Comparator<Student> com = new Comparator<>() {
			@Override
			public int compare(Student i, Student j) {
				if (i.age > j.age)
					return 1;
				else
					return -1;
			}
		};
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(21, "Nikhil"));
		studs.add(new Student(20, "Srikanth"));
		studs.add(new Student(32, "vasavi"));
		studs.add(new Student(29, "Rakshita"));
		
		Collections.sort(studs, com);// pass object
		for (Student i : studs) {
			System.out.println(i);
		}
		
		
	}
}
