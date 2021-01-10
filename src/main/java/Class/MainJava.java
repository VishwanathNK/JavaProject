package Class;

public class MainJava {

    public static void main(String args[])
    {
        Student student = new Student(); //Single Inheritance, Class student extends class person
        student.displayStudentDetails();
        student.displayPersonDetails();

        EngineeringStudent engStudent = new EngineeringStudent(); //Multilevel inheritance, class enggstudent extends class student and class student extends call person
        engStudent.displayEngStudentDetails();
        engStudent.displayStudentDetails();
        engStudent.displayPersonDetails();

        Teacher teacher = new Teacher();// Hierarchical inheritance, class teacher and student are inheriting class person
        teacher.displayTeacherDetails();
        teacher.displayPersonDetails();
        student.displayStudentDetails();
        student.displayPersonDetails();

    }
}

