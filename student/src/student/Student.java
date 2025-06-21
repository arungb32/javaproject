package student;

public class Student{
		private int id;
	    private String name;
	    private int age;

	    // Constructor
	    public Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Display method
	    public void displayStudentInfo() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	    }

	    // main method inside Student.java
	    public static void main(String[] args) {
	        Student student = new Student(101, "Arun", 20);

	        System.out.println("Initial Student Details:");
	        student.displayStudentInfo();

	        // Using setter
	        student.setName("Arun G B");
	        student.setAge(21);

	        System.out.println("\nUpdated Student Details:");
	        System.out.println("Name: " + student.getName());
	        System.out.println("Age: " + student.getAge());
	    }
	}