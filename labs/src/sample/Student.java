package sample;

public class Student {
	 String name;
	    int age;

	    // Constructor
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Overriding the toString() method
	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', age=" + age + "}";
	    }
}
