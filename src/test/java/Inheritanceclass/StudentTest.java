package Inheritanceclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void displayPersonDetails() {

        System.out.println("This is the testcase in this class");
        String str1="Person class inherited in the student class";
        assertEquals("Person class inherited in the student class", str1);
    }

    @Test
    public void displayStudentDetails() {

        System.out.println("This is the testcase in this class");
        String str1="I am a Student";
        assertEquals("I am a Student", str1);
    }
}