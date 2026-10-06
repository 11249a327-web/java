Program to Demonstrate Multiple Inheritance Using Interfaces in Java

Aim:
To write and execute a Java program to demonstrate the use of multiple interfaces by implementing Sports and Academics interfaces in a Student class.

Algorithm:
Create the Sports interface with the play() method.
Create the Academics interface with the study() method.
Create the Student class implementing both interfaces.
Define the play() and study() methods.
Create an object of the Student class.
Call the play() and study() methods.

Program:
interface Sports {
    void play();
}

interface Academics {
    void study();
}

class Student implements Sports, Academics {
    public void play() {
        System.out.println("Student is playing.");
    }

    public void study() {
        System.out.println("Student is studying.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.play();
        s.study();
    }
}

Output:

Student is playing.
Student is studying.

Result:
Thus, the program successfully demonstrates multiple inheritance using interfaces in Java
