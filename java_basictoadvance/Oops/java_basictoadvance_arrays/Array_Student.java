package java_basictoadvance_arrays;

public class Array_Student {
    int rollno;
    String name;
    int marks;

    // Override toString method to print meaningful info
    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        Array_Student s1 = new Array_Student();
        s1.rollno = 1;
        s1.name = "Amit";
        s1.marks = 87;

        Array_Student s2 = new Array_Student();
        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 67;

        Array_Student s3 = new Array_Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        Array_Student[] students = new Array_Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Index-based for loop with improved toString output
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]); // uses toString() of each student
        }
        
        // Display using loop
        for (Array_Student s : students) {
            System.out.println(s);  // Now uses overridden toString()
        }
    }
}