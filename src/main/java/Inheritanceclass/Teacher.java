package Inheritanceclass;

class Teacher extends Person

{

    public   Teacher (){
        System.out.println("Teacher class Constructor");

    }
    // defining additional properties to the child class
    public void displayTeacherDetails()
    {
        System.out.println("I am a Teacher ");
    }
}