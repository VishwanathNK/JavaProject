package Inheritanceclass;
import java.util.*;

public class MainJava {

    public static void main(String args[]) {
        Student student = new Student(); //Single Inheritance, Inheritanceclass student extends class person
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


        OverloadFuncation a = new OverloadFuncation();
        int intVar1 = 15;
        int intVar2 = 7;
        double doubleVar1 = 14.5;
        double doubleVar2 = 18.3;
        int result1 = a.minFunction(intVar1, intVar2);
        // same function name with different parameters
        double result2 = a.minFunction(doubleVar1, doubleVar2);
        System.out.println("The minimum value of integer types = " + result1);
        System.out.println("The minimum value of double types = " + result2);

        //overiding

        Shape obj;
        obj = new Shape();
        obj.draw();
        //initiating object with subclasses
        obj = new Square(); //overriding shape drawing funcation
        obj.draw();

        //Array list collection
        System.out.println("Array");
        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        digits.add(7);

        Iterator<Integer> iterator = digits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Linked list collection
        System.out.println("Linked list collection");
        LinkedList<String> linkedList = new LinkedList<>();

        //Add elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println(linkedList);

        //Add elements at specified position
        linkedList.add(4, "A");
        linkedList.add(5, "A");

        System.out.println(linkedList);

        //Remove element
        linkedList.remove("A");     //removes A
        linkedList.remove(0);       //removes B

        System.out.println(linkedList);

        //Iterate
        ListIterator<String> itrator = linkedList.listIterator();

        while (itrator.hasNext()) {
            System.out.println(itrator.next());

        }
    }
}




