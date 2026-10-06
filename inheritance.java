Program to Demonstrate Different Types of Inheritance in Java

Aim:
To write and execute a Java program to demonstrate single, multilevel, hierarchical, and multiple inheritance using interfaces.

Algorithm:
Create a parent class Animal with an eat() method.
Create Dog by extending Animal.
Create Puppy by extending Dog.
Create Cat by extending Animal.
Create Father and Mother interfaces.
Implement both interfaces in the Child class.
Create objects and call the inherited methods.
Display the output for each type of inheritance.

Program:
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// SINGLE INHERITANCE
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// MULTILEVEL INHERITANCE
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// HIERARCHICAL INHERITANCE
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// MULTIPLE INHERITANCE USING INTERFACES
interface Father {
    void father();
}

interface Mother {
    void mother();
}

class Child implements Father, Mother {

    public void father() {
        System.out.println("Child gets father's property");
    }

    public void mother() {
        System.out.println("Child gets mother's property");
    }
}

// MAIN CLASS
public class inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("SINGLE INHERITANCE");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println();

        // Multilevel Inheritance
        System.out.println("MULTILEVEL INHERITANCE");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        System.out.println();

        // Hierarchical Inheritance
        System.out.println("HIERARCHICAL INHERITANCE");

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println();

        // Multiple Inheritance
        System.out.println("MULTIPLE INHERITANCE USING INTERFACES");
        Child ch = new Child();
        ch.father();
        ch.mother();
    }
}

Output:
SINGLE INHERITANCE
Animal eats
Dog barks

MULTILEVEL INHERITANCE
Animal eats
Dog barks
Puppy plays

HIERARCHICAL INHERITANCE
Animal eats
Dog barks
Animal eats
Cat meows

MULTIPLE INHERITANCE USING INTERFACES
Child gets father's property
Child gets mother's property

Result:
Thus, the program successfully demonstrates single, multilevel, hierarchical, and multiple inheritance using interfaces in Java.
