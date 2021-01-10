package Class;

public class Student extends Person {
    // defining additional properties to child class
    String course = "Java Course";

    public Student()
    {
        System.out.println("Student class Constructor");
    }

    public void displayStudentDetails() {
        System.out.println("I am a Student");
    }
}