package Inheritanceclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void displayPersonDetails() {

       System.out.println("This is the testcase in this class");
        String str1="I am from Person class";
        assertEquals("I am from Person class", str1);
    }
}