package student;

	// StudentDemo.java
public class Studentdemo {
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